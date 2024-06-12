package com.mvc.taller.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "episode")
public class Episode {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false)
    private String air_date;
    
    @Column(length = 45, nullable = false)
    private String episode;

    @Column(length = 100, nullable = false)
    private String characters;

    @Column(length = 100, nullable = false)
    private String created;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String url;

    @ManyToMany(mappedBy = "episodes")
    private List<Characters> characters2;
}
