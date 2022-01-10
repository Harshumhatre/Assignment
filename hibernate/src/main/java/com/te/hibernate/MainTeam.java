package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTeam {
public static void main(String[] args) {
	System.out.println("Hello world");
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ms");
	EntityManager createEntityManager = emf.createEntityManager();
	System.out.println(emf);
	System.out.println(emf.isOpen());
//	Team player = createEntityManager.find(Team.class,1);
//	System.out.println(player);
}
}
