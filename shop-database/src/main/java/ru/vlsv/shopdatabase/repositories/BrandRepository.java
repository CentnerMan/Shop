package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsv.shopdatabase.entities.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
