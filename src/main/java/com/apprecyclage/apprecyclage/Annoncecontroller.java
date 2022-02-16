package com.apprecyclage.apprecyclage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/annonce")
public class Annoncecontroller {

        @Autowired
        private AnnounceServiceImp announceServiceImp;

        @PostMapping("/ajoutannonce")
        public Annonce ajouterAnnonce(@RequestBody Annonce annonce){
            return announceServiceImp.ajoutAnnonce(annonce) ;
        }
        @GetMapping("listerannonce")
        public List<Annonce> listerAnnonce(){
            return announceServiceImp.listerAnnonce();
        }

        @PutMapping("modifierannonce/{idAnn}")
        public Annonce modifierannonce(@RequestBody Annonce annonce,@PathVariable("idAnn") Long idAnn){
            return  announceServiceImp.modifierAnnonce(annonce,idAnn);
        }
        @GetMapping("/infoannonce/{idAnn}")
        public Annonce getAnnonceById(@PathVariable("idAnn") Long idAnn){
            return this.announceServiceImp.getAnnonceById(idAnn);
        }

        @DeleteMapping("supprimerannonce/{idAnn}")
        public  String supprimerAnnonce(@PathVariable("idAnn") Long idAnn){
            announceServiceImp.supprimerAnnonce(idAnn);
            return "successssss";
        }
    }

