package com.denix04.persistence.entity;

import com.denix04.persistence.entity.enums.Mood;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Introspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Mood mood;
    private String managent;
    private String fellings;
    private String observation;

    public Introspection() {

    }

    public Introspection(Mood mood, String man, String fel, String obs) {
        this.mood = mood;
        this. managent = man;
        this.fellings = fel;
        this.observation = obs;
    }
}
