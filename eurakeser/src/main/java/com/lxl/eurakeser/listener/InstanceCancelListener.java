package com.lxl.eurakeser.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;

public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {
    private static final Logger logger = LoggerFactory.getLogger(InstanceRegisterListener.class);
    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        logger.info("服务：{}，挂掉了",eurekaInstanceCanceledEvent.getAppName());
    }
}
