package com.share.helloconsumer.control;

import com.share.helloconsumer.annotation.CustomChannels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

public class MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @StreamListener(CustomChannels.IN_INPUT)
    public void loggerSink1(Message<?> message) {

        System.out.println(message.getPayload());
        logger.info("message.getPayload()----IN_INPUT"+message.getPayload());
    }


    @StreamListener(CustomChannels.IN_INPUT2)
    public void loggerSink2(Message<?> message) {

        logger.info("message.getPayload()-----IN_INPUT2"+message.getPayload());
    }

    @StreamListener(Sink.INPUT)
    public void loggerSink(Message<?> message) {

        logger.info("message.getPayload()---INPUT"+message.getPayload());
    }

}
