package com.fabylove.ecommerce.produto.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import com.fabylove.ecommerce.produto.model.Product;
import com.fabylove.ecommerce.produto.model.ProductDTO;
import com.fabylove.ecommerce.produto.repository.ProductRepository;
import com.fabylove.ecommerce.produto.service.ProductService;

@SpringBootTest
public class ProductServiceTest {
    
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach // Executado antes dos testes
    void setup() {
        //Utilizado para inicializar os mocks para um melhor desempenho
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testBodyCompleted_createProduct() {
        // produto a ser criado
        ProductDTO sendProduct = new ProductDTO(
            "jeans Nike", 
            "http://test.com",
            "These Nike jeans are very comfortable.",
            89.90,
            12);
        
        //produto esperado apos ser salvo
        ModelMapper modelMapper = new ModelMapper();
        Product createdProduct = new Product();
        modelMapper.map(sendProduct, createdProduct);

        //Mock do comportamento do repositorio
        when(productRepository.save(any(Product.class))).thenReturn(createdProduct);

        //Execucao do metodo
        Product result = productService.createProduct(sendProduct);

        //Verificacao do resultado
        assertEquals(sendProduct.getName(), result.getName());
        assertEquals(sendProduct.getUrlImage(), result.getUrlImage());
        assertEquals(sendProduct.getDescription(), result.getDescription());
        assertEquals(sendProduct.getPrice(), result.getPrice());
        assertEquals(sendProduct.getStock(), result.getStock());
        assertTrue(result.getCreated_at() != null);
    }
}
