package com.share.productorser.source;


import com.share.productorser.annotation.CustomChannels;
import com.share.productorser.bean.UserMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;


@Component
public class SourceBean {
//    private Source source;
    private CustomChannels customChannels;

    private static final Logger logger = LoggerFactory.getLogger(SourceBean.class);

//    @Autowired
//    public SourceBean(Source source){
//        this.source = source;
//    }

    @Autowired
    public SourceBean(CustomChannels customChannels){
        this.customChannels = customChannels;
    }

//    public void defaultPublish(String message,String action,String orgId){
//        logger.info("defult Sending Kafka message {}", action, orgId);
//        UserMessage change =  new UserMessage(
//                message,
//                orgId,
//                action);
//
//        source.output().send(MessageBuilder.withPayload(change).build());
//    }

    public void customPublish(String message, String action,String orgId){

        logger.info("custom Sending Kafka message {}", action, orgId);
        UserMessage change =  new UserMessage(
                message,
                orgId,
                action);

        customChannels.sendMessage().send(MessageBuilder.withPayload(change).build());
    }

    public void customPublish2(String message ,String action,String orgId){
       logger.info("custom2 Sending Kafka message {}", action, orgId);
        UserMessage change =  new UserMessage(
                message,
                orgId,
                action);

        customChannels.sendMessage2().send(MessageBuilder.withPayload(change).build());
    }
}
