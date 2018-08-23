package cn.bdqn.zhucezhongxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZhucezhongxinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhucezhongxinApplication.class, args);
    }
}
