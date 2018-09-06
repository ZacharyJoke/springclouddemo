项目介绍：
    1模块：
        1.<module>eurakeser</module>   eurake注册中心
        2.<module>helloser</module>     生产者
        3.<module>helloconsumer</module>  消费者  说明：使用feign调用helloser中的接口  集成hystrix异常熔断
        4.<module>turbineser</module>  hystrix熔断集群监控   使用：访问http://localhost:9523/hystrix    在页面输入框中输入需要监控的微服务地址  例：http://192.168.10.214:8764/hystrix.stream
        5.<module>zipkinser</module>   请求追踪   使用：访问 http://localhost:9411/   可根据下拉框中数据进行过滤查看

     环境要求：

        本地需要安装kafka并启动




