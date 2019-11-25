package ru.vlsv.shopdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsv.shopdatabase.entities.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
