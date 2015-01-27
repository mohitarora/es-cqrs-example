package com.example.catalog.controllers;

import com.example.catalog.domain.Product;
import com.example.catalog.repository.ProductsRepository;
import org.elasticsearch.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping
    public List<Product> products() {
        return Lists.newArrayList(productsRepository.findAll());
    }

    @RequestMapping(value = "/{id}")
    public Product product(@PathVariable String id) {
        return productsRepository.findOne(id);
    }
}
