package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vlsv.shopdatabase.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
