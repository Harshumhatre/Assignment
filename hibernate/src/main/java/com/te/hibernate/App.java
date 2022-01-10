package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Team player = new Team();
		player.setId(1);
		player.setName("Ms Dhoni");
		player.setSal(10000);
		player.setDesignation("captain");

		Team player2 = new Team();
		player2.setId(2);
		player2.setName("virat kohli");
		player2.setSal(10000);
		player2.setDesignation("Vice Captian");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ms");
		EntityManager createEntityManager = emf.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(player);
		createEntityManager.persist(player2);
		transaction.commit();
	}
}