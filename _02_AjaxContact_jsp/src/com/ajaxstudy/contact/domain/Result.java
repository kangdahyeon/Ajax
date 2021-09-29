package com.ajaxstudy.contact.domain;
/* 1. 소스 -> 게터세터 -> 둘다체크 -> After 'message'*/

public class Result {
	 public String status;
	 public String message;
	 
	 
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(String status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + "]";
	}
}
