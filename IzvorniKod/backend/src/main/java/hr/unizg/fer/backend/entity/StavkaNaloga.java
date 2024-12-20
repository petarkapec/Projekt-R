package hr.unizg.fer.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "stavka_naloga", schema = "public")
public class StavkaNaloga {
    @Id
    @ColumnDefault("nextval('stavka_naloga_id_stavka_seq')")
    @Column(name = "id_stavka", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nalog")
    @JsonBackReference
    private Nalog idNalog;

    @Column(name = "adresa_brojila", length = 100)
    private String adresaBrojila;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brojilo")
    @JsonBackReference
    private Brojilo idBrojilo;

    public Brojilo getIdBrojilo() {
        return idBrojilo;
    }

    public void setIdBrojilo(Brojilo idBrojilo) {
        this.idBrojilo = idBrojilo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Nalog getIdNalog() {
        return idNalog;
    }

    public void setIdNalog(Nalog idNalog) {
        this.idNalog = idNalog;
    }

    public String getAdresaBrojila() {
        return adresaBrojila;
    }

    public void setAdresaBrojila(String adresaBrojila) {
        this.adresaBrojila = adresaBrojila;
    }

}