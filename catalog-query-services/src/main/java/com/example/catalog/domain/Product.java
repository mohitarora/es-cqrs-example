package com.example.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products", type = "products", shards = 1, replicas = 0, refreshInterval = "-1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private String sku;

    private String title;

    private String shortDescription;

    private String longDescription;

    private double price;

    private String imagePath;

}
