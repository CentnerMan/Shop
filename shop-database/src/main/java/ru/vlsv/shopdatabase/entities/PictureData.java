package ru.vlsv.shopdatabase.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "pictures_data")
@Data
@NoArgsConstructor
public class PictureData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Lob
    @Column(name = "data", nullable = false)
    private byte[] data;

    public PictureData(byte[] data) {
        this.data = data;
    }
}
