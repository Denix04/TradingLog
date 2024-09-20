package com.denix04.persistence.entity;

import como.denix04.persistence.entity.enums.Mood;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Introspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Mood mood;
    private String managent;
    private String fellings;
    private String observation;
}
