package com.denix04.persistence.controller;

import jakarta.persistence.*;

public class OpRecController {

    private EntityManagerFactory emf;

    public OpRecController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }
}
