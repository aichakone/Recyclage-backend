package com.apprecyclage.apprecyclage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
    Optional<Annonce> findByCategorie(String categorie);
    Optional<Annonce> findByDescription(int description);

}
