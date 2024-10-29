package com.denix04.persistence.controller;

import com.denix04.persistence.entity.Strategy;

import jakarta.persistence.*;

public class StrategyController {

    private EntityManagerFactory emf;

    public StrategyController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }

    public void create(Strategy strategy) {
        EntityManager em = emf.createEntityManager();
        em.persist(strategy);
    }

}
