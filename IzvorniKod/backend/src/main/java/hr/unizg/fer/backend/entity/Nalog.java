package hr.unizg.fer.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "nalog", schema = "public")
public class Nalog {
    @Id
    @ColumnDefault("nextval('nalog_id_nalog_seq')")
    @Column(name = "id_nalog", nullable = false)
    private Integer id;

    @Column(name = "datum_nalog", nullable = false)
    private Instant datumNalog;

    @Column(name = "status_nalog", length = 50)
    private String statusNalog;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_radnik")
    @JsonBackReference
    private Radnik idRadnik;

    @OneToMany(mappedBy = "idNalog")
    @JsonManagedReference
    private Set<Ocitanje> ocitanjes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idNalog")
    @JsonManagedReference
    private Set<StavkaNaloga> stavkaNalogas = new LinkedHashSet<>();

    public Set<StavkaNaloga> getStavkaNalogas() {
        return stavkaNalogas;
    }

    public void setStavkaNalogas(Set<StavkaNaloga> stavkaNalogas) {
        this.stavkaNalogas = stavkaNalogas;
    }

    public Set<Ocitanje> getOcitanjes() {
        return ocitanjes;
    }

    public void setOcitanjes(Set<Ocitanje> ocitanjes) {
        this.ocitanjes = ocitanjes;
    }

    public Radnik getIdRadnik() {
        return idRadnik;
    }

    public void setIdRadnik(Radnik idRadnik) {
        this.idRadnik = idRadnik;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDatumNalog() {
        return datumNalog;
    }

    public void setDatumNalog(Instant datumNalog) {
        this.datumNalog = datumNalog;
    }

    public String getStatusNalog() {
        return statusNalog;
    }

    public void setStatusNalog(String statusNalog) {
        this.statusNalog = statusNalog;
    }

}