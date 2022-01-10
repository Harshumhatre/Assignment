package com.te.Servelets.HibernateFisrtProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory cmf = Persistence.createEntityManagerFactory("Harshu");
		EntityManager createEntityManager = cmf.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
		 Student student=(Student)createEntityManager.find(Student.class, 1);
		 System.out.println(student);
//		transaction.commit();
		String query="from Student where id=2";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query);
		Object singleResult = createQuery.getSingleResult();
		System.out.println(singleResult);
		transaction.commit();
		Student find = (Student)createEntityManager.find(Student.class, 3);
		System.out.println(find);
		
		
		
		//	String query="Delete from Student where id=5";
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query);
//		int executeUpdate = createQuery.executeUpdate();
//		
//		transaction.commit();
//		
		//		Query createQuery = createEntityManager.createQuery(query);
//		List resultList = createQuery.getResultList();
//		for (Object object : resultList) {
//			System.out.println(object);
//		}
		
//		String query = "update Student set name='Kali'  where id=1";
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query);
//		createQuery.executeUpdate();
//		transaction.commit();
//		Query createQuery = createEntityManager.createQuery(query);
//		List resultList = createQuery.getResultList();
//		for (Object object : resultList) {
//			System.out.println(object);
//		}
//		String query = "from Student where id=2";
//		Query createQuery = createEntityManager.createQuery(query);
//		Object singleResult = createQuery.getSingleResult();
//		System.out.println(singleResult);
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Harshad_Mhatre");
//        student.setCity("Mumbai");
//        Student student2 = new Student();
//        student2.setName("Shubham");
//        student2.setId(2);
//        student2.setCity("pune");
//        Student student3 = new Student();
//        student3.setId(3);
//        student3.setName("Suraj");
//        student3.setCity("Raigad");
//        Student student4 = new Student();
//        student4.setId(4);
//        student4.setName("Yogesh");
//        student4.setCity("Raigad");
//        Student student5 = new Student();
//        student5.setId(5);
//        student5.setName("Nikhil");
//        student5.setCity("Raigad");

//        Address address = new Address();
//        address.setAddressId(1);
//        address.setStreetName("Revdanda_Alibaug");
//        address.setX(200.0);
//        address.setIsopen(true);
//        FileInputStream fileInputStream = new FileInputStream("src/main/java/1.jpg");
//        byte[] b=new byte[fileInputStream.available()];
//        address.setImage(b);

//            Query createQuery = createEntityManager.createQuery(query);
//            List<Student> resultList = createQuery.getResultList();
//            for (Student student : resultList) {
//    			System.out.println(student);
//    		}	
//        createEntityManager.persist(student);
//        createEntityManager.persist(student2);
//        createEntityManager.persist(student3);
//        createEntityManager.persist(student4);
//        createEntityManager.persist(student5);
		// createEntityManager.persist(address);

	}
}
