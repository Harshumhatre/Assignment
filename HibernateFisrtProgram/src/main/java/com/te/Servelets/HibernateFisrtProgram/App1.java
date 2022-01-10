package com.te.Servelets.HibernateFisrtProgram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App1 {
public static void main(String[] args) {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Harshu");
	EntityManager cem = createEntityManagerFactory.createEntityManager();
	Student1 student = new Student1();
	student.setId(1);
	student.setName("Harshad_Mhatre");
	student.setCity("Mumbai");
	
	Certificate certificate = new Certificate();
	certificate.setCoarse("java");
	certificate.setDuration("3 months");
	student.setCerti(certificate);
	
	Student1 student2 = new Student1();
	student2.setName("Shubham");
	student2.setId(2);
	student2.setCity("pune");
	Certificate certificate1 = new Certificate();
	certificate1.setCoarse("sql");
	certificate1.setDuration("1 months");
	student2.setCerti(certificate1);
	
	Student1 student3 = new Student1();
	student3.setId(3);
	student3.setName("Suraj");
	student3.setCity("Raigad");
	Certificate certificate2 = new Certificate();
	certificate2.setCoarse("python");
	certificate2.setDuration("3 months");
	student3.setCerti(certificate2);
	EntityTransaction transaction = cem.getTransaction();
	transaction.begin();
	cem.persist(student);
	cem.persist(student2);
	cem.persist(student3);
	transaction.commit();
}
}
