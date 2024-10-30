package com.fabylove.ecommerce.produto.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabylove.ecommerce.produto.model.Product;
import com.fabylove.ecommerce.produto.model.ProductDTO;
import com.fabylove.ecommerce.produto.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    ModelMapper modelMap = new ModelMapper();

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        modelMap.map(productDTO, product);
        return repository.save(product);
    }
}
