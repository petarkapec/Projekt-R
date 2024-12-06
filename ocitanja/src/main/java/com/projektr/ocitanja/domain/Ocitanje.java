package com.projektr.ocitanja.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ocitanje")
public class Ocitanje {
    @Id
    @ColumnDefault("nextval('ocitanje_id_ocitanje_seq')")
    @Column(name = "id_ocitanje", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_nalog")
    @JsonIgnore
    private Nalog idNalog;

    @Column(name = "datum_ocitavanja")
    private LocalDate datumOcitavanja;

    @Column(name = "tarifa_niska", precision = 10, scale = 2)
    private BigDecimal tarifaNiska;

    @Column(name = "tarifa_visoka", precision = 10, scale = 2)
    private BigDecimal tarifaVisoka;

    @Column(name = "komentar", length = Integer.MAX_VALUE)
    private String komentar;

}