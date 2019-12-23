package ru.vlsv.service;


import ru.vlsv.controllers.repr.ProductRepr;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<ProductRepr> findAll();

    List<ProductRepr> findAllByIdBetween(Long idMin, Long idMax);

    ProductRepr findById(Long id);

    void deleteById(Long id);

    void save(ProductRepr product) throws IOException;
}
