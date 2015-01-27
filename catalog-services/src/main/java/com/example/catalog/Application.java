package com.example.catalog;

import com.example.catalog.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ProductsRepository productsRepository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        saveProducts();
    }

    /**
     * Loads products into elasticsearch so that they can be retrieved
     */
    private void saveProducts() {
        //productsRepository.findOne()
    }
}
