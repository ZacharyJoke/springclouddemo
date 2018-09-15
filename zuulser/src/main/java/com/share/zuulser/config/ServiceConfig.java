package com.share.zuulser.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component //泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
@Configuration
public class ServiceConfig {
  @Value("${signing.key}")
  private String jwtSigningKey="";


  public String getJwtSigningKey() {
    return jwtSigningKey;
  }

}
