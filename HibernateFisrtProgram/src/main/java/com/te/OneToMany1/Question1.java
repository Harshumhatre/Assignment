package com.te.OneToMany1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Question1 {
	
	@Id
private int questionId;
	
private String question;

@OneToMany
private List<Answer1> answer1;


public Question1(int questionId, String question, List<Answer1> answer1) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer1 = answer1;
}
public Question1() {
	super();
	// TODO Auto-generated constructor stub
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer1> getAnswer1() {
	return answer1;
}
public void setAnswer1(List<Answer1> answer1) {
	this.answer1 = answer1;
}
@Override
public String toString() {
	return "Question1 [questionId=" + questionId + ", question=" + question + ", answer1=" + answer1 + "]";
}

}
