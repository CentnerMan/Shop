package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsv.shopdatabase.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
