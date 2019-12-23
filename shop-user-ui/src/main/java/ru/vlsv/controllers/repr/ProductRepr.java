package ru.vlsv.controllers.repr;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vlsv.shopdatabase.entities.Picture;
import ru.vlsv.shopdatabase.entities.Product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;


@Data
@NoArgsConstructor
public class ProductRepr implements Serializable {

    private Long id;

    private String name;

    private BigDecimal price;

    private String categoryName;

    private String brandName;

    private List<Long> pictureIds;

    public ProductRepr(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.categoryName = product.getCategory().getName();
        this.brandName = product.getBrand().getName();
        this.pictureIds = product.getPictures().stream()
                .map(Picture::getId)
                .collect(Collectors.toList());
    }
}
