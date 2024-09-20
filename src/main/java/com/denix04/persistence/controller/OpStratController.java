package com.denix04.persistence.controller;

import jakarta.persistence.*;

public class OpStratController {

    private EntityManagerFactory emf;

    public OpStratController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }
}
