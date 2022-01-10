package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AllQuery {
	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Ms");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		String query="from Team where designation='batsman'";
		
		
		
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query);
//		int executeUpdate = createQuery.executeUpdate();		
//		transaction.commit();
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		for (Team team : resultList) {
//			System.out.println(team);
//		}
//		String query = "Delete from Team where id=6";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
		
		
		
		
		
//		String query1="Select min(sal)from Team";
//		Query createQuery2 = createEntityManager.createQuery(query1);
//		Double singleResult = (Double)createQuery2.getSingleResult();
//		System.out.println(singleResult);
////		}
//		String query1 = "Select max(sal)from Team";
//		Query createQuery2 = createEntityManager.createQuery(query1);
//		Double singleResult = (Double) createQuery2.getSingleResult();
//		System.out.println(singleResult);
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		String query2 = "update Team set sal=150 where id=5";
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query2);
//		int executeUpdate = createQuery.executeUpdate();
//		transaction.commit();

	}
}
