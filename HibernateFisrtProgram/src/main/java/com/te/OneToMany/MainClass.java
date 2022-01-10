package com.te.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {

	Question question = new Question();
	question.setQuestionId(1);
	question.setQuestion("What is java?");
	
	Answer answer = new Answer();
	answer.setQuestion(question);
	answer.setAnswerId(11);
	answer.setAnswer("Java is High level Programing language");
	question.setAnswer(answer);
	
	
	Question question1 = new Question();
	question1.setQuestionId(2);
	question1.setQuestion("What is sql?");
	Answer answer1 = new Answer();
	answer1.setAnswerId(21);
	answer1.setAnswer("sql is structural query language");
	question1.setAnswer(answer1);
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Harshu");
	EntityManager cem = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = cem.getTransaction();
	transaction.begin();
	cem.persist(question);
	cem.persist(answer);
	cem.persist(question1);
	cem.persist(answer1);
	transaction.commit();
}
}
