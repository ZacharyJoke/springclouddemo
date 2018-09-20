package com.lxl.consumerser.api;

import com.lxl.consumerser.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productorser")//使用feign调用微服务接口  productorser:被服务id
public interface UserApi {

    @GetMapping(value = "user/{UserId}")
    User getUser(@PathVariable("UserId") String UserId);
}
