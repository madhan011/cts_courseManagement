package com.learning.management.courseManagement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOCKTEST")
public class CourseMockQA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long QuestionId;
	
	private String Question;
	
	private Long courseId;
	
	private String answerOne;
	private String answerTwo;
	private String answerThree;
	private String answerFour;
	
	private String crtAnswer;
	
	private boolean isValid;

	public Long getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(Long questionId) {
		QuestionId = questionId;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getAnswerOne() {
		return answerOne;
	}

	public void setAnswerOne(String answerOne) {
		this.answerOne = answerOne;
	}

	public String getAnswerTwo() {
		return answerTwo;
	}

	public void setAnswerTwo(String answerTwo) {
		this.answerTwo = answerTwo;
	}

	public String getAnswerThree() {
		return answerThree;
	}

	public void setAnswerThree(String answerThree) {
		this.answerThree = answerThree;
	}

	public String getAnswerFour() {
		return answerFour;
	}

	public void setAnswerFour(String answerFour) {
		this.answerFour = answerFour;
	}

	public String getCrtAnswer() {
		return crtAnswer;
	}

	public void setCrtAnswer(String crtAnswer) {
		this.crtAnswer = crtAnswer;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "CourseMockQA [QuestionId=" + QuestionId + ", Question=" + Question + ", courseId=" + courseId
				+ ", answerOne=" + answerOne + ", answerTwo=" + answerTwo + ", answerThree=" + answerThree
				+ ", answerFour=" + answerFour + ", crtAnswer=" + crtAnswer + ", isValid=" + isValid + "]";
	}


}
