package com.te.hibernate4;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass2 {
public static void main(String[] args) {
	Girl1 girl = new Girl1();
	girl.setGid(1);
	girl.setName("Ash");
	 
	Boy1 boy = new Boy1();
	boy.setBid(101);
	boy.setBsal(100000);
	boy.setName("Abhishek");
	
	Boy1 boy1 = new Boy1();
	boy1.setBid(101);
	boy1.setBsal(400000);
	boy1.setName("Salaman");
	
	Boy1 boy2 = new Boy1();
	boy2.setBid(101);
	boy2.setBsal(20000);
	boy2.setName("vivek");
	
	
	List<Boy1> List = Arrays.asList(boy,boy1,boy2);
	girl.getBoys();
	boy.setGirl(girl);
	boy1.setGirl(girl);
	boy2.setGirl(girl);
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping1");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	em.persist(boy);
	em.persist(boy1);
	em.persist(boy2);
	em.persist(girl);
	transaction.commit();
	
}
}
