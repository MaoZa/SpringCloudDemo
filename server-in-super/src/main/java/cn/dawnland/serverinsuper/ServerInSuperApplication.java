package cn.dawnland.serverinsuper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerInSuperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerInSuperApplication.class, args);
    }
}
