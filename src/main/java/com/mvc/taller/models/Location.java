package com.mvc.taller.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer dimension;

    @Column(length = 45, nullable = false)
    private String created;
    
    @Column(length = 45, nullable = false)
    private String type;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String residents_length;

    @Column(length = 100, nullable = false)
    private String url;

    @OneToMany(mappedBy = "location")
    private List<Characters> characters;
}
