package com.example.catalog.controllers;

import com.example.catalog.domain.Product;
import com.example.catalog.repository.ProductsRepository;
import org.elasticsearch.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping("/products")
    public List<Product> products() {
        return Lists.newArrayList(productsRepository.findAll());
    }
}
