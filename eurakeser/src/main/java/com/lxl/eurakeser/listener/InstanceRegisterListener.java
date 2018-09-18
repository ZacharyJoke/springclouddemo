package com.lxl.eurakeser.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;

public class InstanceRegisterListener implements ApplicationListener<EurekaInstanceRegisteredEvent> {
    private static final Logger logger = LoggerFactory.getLogger(InstanceRegisterListener.class);
    @Override
    public void onApplicationEvent(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent) {
        logger.info("服务：{}，注册成功了",eurekaInstanceRegisteredEvent.getInstanceInfo().getAppName());
    }
}
