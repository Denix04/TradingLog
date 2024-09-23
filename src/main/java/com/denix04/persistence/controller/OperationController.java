package com.denix04.persistence.controller;

import java.util.List;

import com.denix04.persistence.entity.Operation;

import jakarta.persistence.*;

public class OperationController {

    private EntityManagerFactory emf;

    public OperationController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }

    public void create(Operation op) {
        EntityManager em = emf.createEntityManager();
        em.persist(op);
    }

    public Operation find(Long id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Operation.class, id);
    }

    public List<Operation> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Operation> op = null;
        try {
            op = em.createQuery("SELECT * FROM Operarion", Operation.class)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("ERROR in retrieve operations");
            e.printStackTrace();
        }

        return op;
    }
}
