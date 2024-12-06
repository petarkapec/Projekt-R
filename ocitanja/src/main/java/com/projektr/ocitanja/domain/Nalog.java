package com.projektr.ocitanja.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nalog")
public class Nalog {
    @Id
    @ColumnDefault("nextval('nalog_id_nalog_seq')")
    @Column(name = "id_nalog", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_brojilo")
    private Brojilo idBrojilo;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_radnik")
    private com.projektr.ocitanja.domain.Radnik idRadnik;

    @Column(name = "datum_nalog")
    private LocalDate datumNalog;

    @Column(name = "status_nalog", length = 50)
    private String statusNalog;

}