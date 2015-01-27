package com.example.catalog.repository;

import com.example.catalog.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductsRepository extends ElasticsearchRepository<Product, String> {

}
