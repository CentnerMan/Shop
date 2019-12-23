package ru.vlsv.controllers.repr;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vlsv.shopdatabase.entities.Category;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CategoryRepr implements Serializable {

    private long id;

    private String name;

    private long productCount;

    public CategoryRepr(long id, String name, long productCount) {
        this.id = id;
        this.name = name;
        this.productCount = productCount;
    }

    public CategoryRepr(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

}
