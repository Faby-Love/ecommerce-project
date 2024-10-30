package com.fabylove.ecommerce.produto.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;


public class ProductDTO {
    
    @NotNull(message = "Name is required")
    @Size(min = 2, max = 100, message = "The name to have between 2 and 100 characters")
    private String name;
    
    @NotNull(message= "URL is required")
    private String urlImage;

    @Size(min = 10, max = 300, message = "The description to have between 10 and 300 characters")
    private String description;

    @NotNull(message= "Price is required")
    @Positive(message = "The price is can't be negative")
    private Double price;

    @NotNull(message = "Stock is required")
    @PositiveOrZero(message = "The stock is can't be negative")
    private int stock;

    public ProductDTO() {
    }

    public ProductDTO(String name, String urlImage, String description, Double price, int stock) {
        this.name = name;
        this.urlImage = urlImage;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
