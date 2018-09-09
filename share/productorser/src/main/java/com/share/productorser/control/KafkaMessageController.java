package com.share.productorser.control;

import com.share.productorser.bean.UserMessage;
import com.share.productorser.source.SourceBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KafkaMessageController {

    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageController.class);
    @Autowired
    SourceBean sourceBean;

    @RequestMapping(value="kafka/{id}",method = RequestMethod.GET)//kafka自定义通道发送消息
    public UserMessage getMessage(@PathVariable("id") String id) {
        logger.info("Looking up data for org {} with id {}", id);

        UserMessage message =  new UserMessage("messagefromproductorser",Math.random()+"","get");
        sourceBean.customPublish(message.getMessage(),message.getId(),message.getType());
        return message;
    }

    @RequestMapping(value="kafka2/{id}",method = RequestMethod.GET)//kafka自定义通道发送消息
    public UserMessage getMessage2(@PathVariable("id") String id) {
        logger.info("Looking up data for org {} with id {}", id);

        UserMessage message =  new UserMessage("message2fromproductorser",Math.random()+"","get");
        sourceBean.customPublish2(message.getMessage(),message.getId(),message.getType());
        return message;
    }

//    @RequestMapping(value="kafkaDefault/{id}",method = RequestMethod.GET)//kafka默认通道发送消息
//    public UserMessage getMessageDefault(@PathVariable("id") String id) {
//        logger.info("Looking up data for org {} with id {}", id);
//
//        UserMessage message =  new UserMessage("message2fromproductorser",Math.random()+"","get");
//        sourceBean.defaultPublish(message.getMessage(),message.getId(),message.getType());
//        return message;
//    }

}
