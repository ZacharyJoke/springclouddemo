package com.share.helloconsumer.api;

import com.share.helloconsumer.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "helloser")
public interface HelloApi {

    @GetMapping(value = "user/{UserId}")
    User getUser(@PathVariable("UserId") String UserId);
}
