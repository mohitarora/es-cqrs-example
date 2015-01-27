package com.example.catalog.repository;

import com.example.catalog.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductsRepository extends ElasticsearchRepository<Product, String> {

}
