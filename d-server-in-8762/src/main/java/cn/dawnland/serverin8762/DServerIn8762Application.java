package cn.dawnland.serverin8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DServerIn8762Application {

    public static void main(String[] args) {
        SpringApplication.run(DServerIn8762Application.class, args);
    }
}
