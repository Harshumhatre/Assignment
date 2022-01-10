//package com.te.hibernate.hibernate2;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Myclass {
//public static void main(String[] args) {
//	Girl girl = new Girl();
//	girl.setGid(1);
//	girl.setName("Ash");
//	 
//	Boy boy = new Boy();
//	boy.setBid(101);
//	boy.setBsal(100000);
//	boy.setName("Abhishek");
//	
//	girl.setBoy(boy);
//	boy.setGirl(girl);
//	
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
//	EntityManager em = emf.createEntityManager();
//	EntityTransaction transaction = em.getTransaction();
//	transaction.begin();
//	em.persist(boy);
//	em.persist(girl);
//	transaction.commit();
//	
//}
//}
