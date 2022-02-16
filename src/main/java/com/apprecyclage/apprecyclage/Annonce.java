package com.apprecyclage.apprecyclage;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Annonce {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idAnn;



    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String geolocalisation;

    @Column()
    private LocalDate datepublication = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private Etat etat;

    public Annonce() {
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }



    public Annonce(Long idAnn, String categorie, String description, String geolocalisation, LocalDate datepublication, Etat etat) {
        this.idAnn = idAnn;

        this.description = description;
        this.geolocalisation = geolocalisation;
        this.datepublication = datepublication;
        this.etat = etat;
    }

    public Long getIdAnn() {
        return idAnn;
    }

    public void setIdAnn(Long idAnn) {
        this.idAnn = idAnn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeolocalisation() {
        return geolocalisation;
    }

    public void setGeolocalisation(String geolocalisation) {
        this.geolocalisation = geolocalisation;
    }

    public LocalDate getDatepublication() {
        return datepublication;
    }

    public void setDatepublication(LocalDate datepublication) {
        this.datepublication = datepublication;
    }
    public Etat getEtat() {
        return etat;
    }
}


