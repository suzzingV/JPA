package com.example.jpaquerydsl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaQueryDslMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaquerydsl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();


    }
}
