package com.denix04.persistence.controller;

import java.util.List;

import com.denix04.persistence.entity.Introspection;

import jakarta.persistence.*;

public class IntrospectionController {
    private EntityManagerFactory emf;

    public IntrospectionController() {
        emf = Persistence.createEntityManagerFactory("tomi_bitacora");
    }

    public void create(Introspection obs) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(obs);
        transaction.commit();
        em.close();
    }

    public Introspection find(Long id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Introspection.class, id);
    }

    public List<Introspection> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Introspection> obs = null;
        try {
            obs = em.createQuery("SELECT * FROM Introspection", Introspection.class)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("ERROR in retrive instropections");
            e.printStackTrace();
        }

        return obs;
    }

}
