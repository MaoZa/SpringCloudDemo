package cn.dawnland.distributedeurekaservercenter8889;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DistributedEurekaServerCenter8889Application {

    public static void main(String[] args) {
        SpringApplication.run(DistributedEurekaServerCenter8889Application.class, args);
    }
}
