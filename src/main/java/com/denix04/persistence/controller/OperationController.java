package com.denix04.persistence.controller;

import jakarta.persistence.*;

public class OperationController {

    private EntityManagerFactory emf;

    public OperationController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }
}
