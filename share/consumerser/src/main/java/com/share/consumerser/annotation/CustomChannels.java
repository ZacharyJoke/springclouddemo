package com.share.consumerser.annotation;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomChannels {



    String IN_INPUT = "inboundOrgChanges";

    String IN_INPUT2 = "inboundOrgChanges2";
    /*
    *
    * 接受消息通道
    * */
    @Input(IN_INPUT)
    SubscribableChannel orgs();
/*
    *
    * 接受消息通道
    * */
    @Input(IN_INPUT2)
    SubscribableChannel orgs2();

}
