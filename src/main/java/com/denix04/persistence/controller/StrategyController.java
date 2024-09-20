package com.denix04.persistence.controller;

import jakarta.persistence.*;

public class StrategyController {

    private EntityManagerFactory emf;

    public StrategyController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }
}
