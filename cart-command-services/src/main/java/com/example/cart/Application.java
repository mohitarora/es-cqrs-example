package com.example.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;

@SpringBootApplication
@IntegrationComponentScan
@ImportResource("classpath:kafka.xml")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @MessagingGateway
    public interface KafkaGateway {

        @Gateway(requestChannel = "inputToKafka")
        public void addItemToCart();
    }

}
