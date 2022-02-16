package com.apprecyclage.apprecyclage;

import javax.persistence.*;
@Entity
public class categorie {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false)
        private Long idcat;

        @Column(nullable = false)
        private String type;
    public categorie() {
    }
    public void setType(String type) {
        this.type = type;
    }

    public categorie(Long idcat, String type) {
        this.idcat = idcat;
        this.type = type;
    }

    public Long getIdcat() {
        return idcat;
    }

    public void setIdcat(Long idcat) {
        this.idcat = idcat;
    }

    public String getType() {
        return type;
    }
}


