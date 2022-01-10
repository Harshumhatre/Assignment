package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App1 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the total no of players");
//		int no = scanner.nextInt();
//		Team player = new Team();
//		for (int i = 0; i < no; i++) {
//			System.out.println("Enter the Id of player");
//			int id = scanner.nextInt();
//			System.out.println("Enter the name of the player");
//			String name = scanner.next();
//			System.out.println("Enter the salary of the player");
//			double sal = scanner.nextDouble();
//			System.out.println("Enter the designation of the player");
//			String designation = scanner.next();
//			player.setId(id);
//			player.setName(name);
//			player.setSal(sal);
//			player.setDesignation(designation);
		Team player=new Team();
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ms");
			EntityManager createEntityManager = emf.createEntityManager();
	//		EntityTransaction transaction = createEntityManager.getTransaction();
//			transaction.begin();
//			createEntityManager.persist(player);
			//transaction.commit();
			// Deleting the data
			Team obj1=createEntityManager.find(Team.class,8);
		//	transaction.begin();
//			createEntityManager.remove(obj1);
//			transaction.commit();
			//Updating the data
//			Team obj2=createEntityManager.find(Team.class, 2);
//			if (obj2!=null) {
//				obj2.setDesignation("VC");
//				transaction.begin();
//				transaction.commit();	
//				System.out.println("Updated");
//			}
		
		}
	}
