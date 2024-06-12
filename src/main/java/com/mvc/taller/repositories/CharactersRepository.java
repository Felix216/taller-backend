package com.mvc.taller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.taller.models.Characters;

@Repository
public interface CharactersRepository extends JpaRepository<Characters, Integer> {
    
}
