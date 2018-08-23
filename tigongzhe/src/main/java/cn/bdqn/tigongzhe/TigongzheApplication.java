package cn.bdqn.tigongzhe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication()
@EnableEurekaClient
@MapperScan("cn.bdqn.tigongzhe.dao")
public class TigongzheApplication {

    public static void main(String[] args) {
        SpringApplication.run(TigongzheApplication.class, args);
    }
}
