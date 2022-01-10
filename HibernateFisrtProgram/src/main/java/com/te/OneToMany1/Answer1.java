package com.te.OneToMany1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Answer1 {
	@Id
private int  answerId;
private  String answer;
@ManyToOne
private Question1 question;


public Answer1(int answerId, String answer, Question1 question) {
	super();
	this.answerId = answerId;
	this.answer = answer;
	this.question = question;
}
public Answer1() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Question1 getQuestion() {
	return question;
}
public void setQuestion(Question1 question) {
	this.question = question;
}
@Override
public String toString() {
	return "Answer1 [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
}

}
