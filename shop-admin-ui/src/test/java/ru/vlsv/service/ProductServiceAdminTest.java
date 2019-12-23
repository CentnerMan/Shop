package ru.vlsv.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.vlsv.controllers.repr.ProductRepr;
import ru.vlsv.shopdatabase.entities.Brand;
import ru.vlsv.shopdatabase.entities.Category;
import ru.vlsv.shopdatabase.entities.Product;
import ru.vlsv.shopdatabase.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceAdminTest {

    private ProductService productService;

    private ProductRepository productRepository;

    @BeforeEach
    public void init() {
        productRepository = mock(ProductRepository.class);
        productService = new ProductServiceImpl(productRepository);
    }

    @Test
    public void findAll() {
        when(productRepository.findAll()).thenReturn(new ArrayList<Product>() {{
            for (long i = 0; i < 10; i++) {
                Product product = new Product();
                product.setBrand(new Brand());
                product.setCategory(new Category());
                product.setPictures(Collections.emptyList());
                product.setName("Product");
                product.setId(i);
                add(product);
            }
        }});
        List<ProductRepr> result = productService.findAll();
        assertNotNull(result);
        assertEquals(10, result.size());
    }
}
