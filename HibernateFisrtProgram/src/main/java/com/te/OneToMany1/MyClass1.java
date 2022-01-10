package com.te.OneToMany1;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.OneToMany.Answer;
import com.te.OneToMany.Question;

public class MyClass1 {
public static void main(String[] args) {
	Question1 question = new Question1();
	question.setQuestionId(1);
	question.setQuestion("What is java?");
	
	Answer1 answer = new Answer1();
	answer.setAnswerId(110);
	answer.setAnswer("Java is High level Programing language");
	answer.setQuestion(question);
	
	Answer1 answer1 = new Answer1();
	answer1.setAnswerId(120);
	answer1.setAnswer("Java is Object oriented programing language");
	answer1.setQuestion(question);
	
	Answer1 answer2 = new Answer1();
	answer2.setAnswerId(130);
	answer2.setAnswer("Java is a platform independant");
	answer2.setQuestion(question);
	 
	ArrayList<Answer1> arrayList = new ArrayList<Answer1>();
	arrayList.add(answer);
	arrayList.add(answer1);
	arrayList.add(answer2);
	
	question.setAnswer1(arrayList);	
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Harshu");
	EntityManager cem = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = cem.getTransaction();
	transaction.begin();
	cem.persist(question);
	transaction.commit();



















}
}
