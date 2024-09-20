package com.denix04.persistence.controller;

import java.util.List;

import com.denix04.persistence.entity.OpObs;

import jakarta.persistence.*;

public class OpObsController {
    private EntityManagerFactory emf;

    public OpObsController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }

    public void create(OpObs obs) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(obs);
        transaction.commit();
        em.close();
    }

    public OpObs find(Long id) {
        EntityManager em = emf.createEntityManager();
        return em.find(OpObs.class, id);
    }

    public List<OpObs> findAll() {
        EntityManager em = emf.createEntityManager();
        List<OpObs> obs = null;
        try {
            obs = em.createQuery("SELECT * FROM OpObs", OpObs.class)
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obs;
    }

}
