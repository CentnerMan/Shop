package ru.vlsv.shopuserui.controller.repr;

import lombok.Data;
import lombok.NoArgsConstructor;

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
}
