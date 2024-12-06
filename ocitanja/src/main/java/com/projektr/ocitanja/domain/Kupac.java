package com.projektr.ocitanja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "kupac")
public class Kupac {
    @Id
    @Column(name = "id_kupac", nullable = false, length = 11)
    private String idKupac;

    @Column(name = "ime_kupac", length = 50)
    private String imeKupac;

    @Column(name = "prezime_kupac", length = 50)
    private String prezimeKupac;

    @Column(name = "telefon_kupac", length = 20)
    private String telefonKupac;

    @Column(name = "adresa_kupac", length = 100)
    private String adresaKupac;

}