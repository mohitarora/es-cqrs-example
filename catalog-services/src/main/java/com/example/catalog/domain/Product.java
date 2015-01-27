package com.example.catalog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products", type = "products", shards = 1, replicas = 0, refreshInterval = "-1")
public class Product {

    @Id
    private String sku;

    private String title;

    private String shortDescription;

    private String longDescription;

    private double price;

    public Product(String sku, String title, String shortDescription, String longDescription, double price) {
        this.sku = sku;
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", price=" + price +
                '}';
    }
}
