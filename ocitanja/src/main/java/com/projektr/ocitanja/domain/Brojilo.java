package com.projektr.ocitanja.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "brojilo")
public class Brojilo {
    @Id
    @ColumnDefault("nextval('brojilo_id_brojilo_seq')")
    @Column(name = "id_brojilo", nullable = false)
    private Integer id;

    @Column(name = "serijski_broj_brojilo", length = 50)
    private String serijskiBrojBrojilo;

    @Column(name = "tip_brojila", length = 50)
    private String tipBrojila;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_kupac")
    private com.projektr.ocitanja.domain.Kupac idKupac;

}