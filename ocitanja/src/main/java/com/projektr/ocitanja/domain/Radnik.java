package com.projektr.ocitanja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "radnik")
public class Radnik {
    @Id
    @ColumnDefault("nextval('radnik_id_radnik_seq')")
    @Column(name = "id_radnik", nullable = false)
    private Integer id;

    @Column(name = "ime_radnik", length = 50)
    private String imeRadnik;

    @Column(name = "prezime_radnik", length = 50)
    private String prezimeRadnik;

    @Column(name = "telefon_radnik", length = 20)
    private String telefonRadnik;

}