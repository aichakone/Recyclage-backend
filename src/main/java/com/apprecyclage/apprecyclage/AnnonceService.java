package com.apprecyclage.apprecyclage;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AnnonceService {

        public Annonce ajoutAnnonce(Annonce annonce);
        public Annonce modifierAnnonce(Annonce annonce, Long idAnn);
        public List<Annonce> listerAnnonce();
        public String supprimerAnnonce(Long idAnn);
        public Annonce getAnnonceById(Long idAnn);

}

