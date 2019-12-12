package ru.vlsv.shopuserui.controller.repr;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CartItemRepr implements Serializable {

    private Long productId;

    private Integer qty;

    private String size;

    private String color;

    private String pageUrl;
}
