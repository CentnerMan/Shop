package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.vlsv.shopdatabase.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    Product findOneByName(String name);

    List<Product> findAllByIdBetween(Long minId, Long maxId);

    List<Product> findAllByPriceBetweenOrderByPrice(BigDecimal minCost, BigDecimal maxCost);

    Product findFirstByOrderByPriceAsc();

    Product findFirstByOrderByPriceDesc();
}
