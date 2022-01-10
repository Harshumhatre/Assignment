package com.te.practice.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainCla {
public static void main(String[] args) {
	Rahul rahul = new Rahul();
	rahul.setId(1);
	rahul.setName("bablu");
	rahul.setSal(10000000);
	Siddhi siddhi = new Siddhi();
	siddhi.setId(101);
	siddhi.setName("Chuchi");
	rahul.setSiddhi(siddhi);
	siddhi.setRahul(rahul);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping1");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	em.persist(rahul);
	em.persist(siddhi);
	transaction.commit();
}
}
