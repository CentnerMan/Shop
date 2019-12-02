package ru.vlsv.shopuserui.controller.repr;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vlsv.shopdatabase.entities.Picture;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PictureRepr implements Serializable {

    private Long id;

    private String name;

    private String contentType;

    public PictureRepr(Picture picture) {
        this.id = picture.getId();
        this.name = picture.getName();
        this.contentType = picture.getContentType();
    }
}
