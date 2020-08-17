package com.learning.management.courseManagement.model;

public class QAResponse {
	
	private Long id;
	
	private String answer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QAResponse [id=" + id + ", answer=" + answer + "]";
	}

	public QAResponse(Long id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}

	public QAResponse() {
		super();
	}
	
	

}
