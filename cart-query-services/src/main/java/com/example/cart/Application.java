package com.example.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@SpringBootApplication
@IntegrationComponentScan
@ImportResource("classpath:kafka.xml")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Spring integration flow for messages received from Kafka using Spring Integration DSL.
     */
    @Bean
    public IntegrationFlow myFlow() {
        return IntegrationFlows.from("kafkaInboundChannel")
                .handle(System.out::println)
                .get();
    }

}
