package com.example.userexample.util;


import org.springframework.http.HttpStatus;

public class Response<T> {

	private String status = HttpStatus.OK.getReasonPhrase();
	private String message = "Execution Successful!";
	private Integer statusCode = HttpStatus.OK.value();

	private T output;

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

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public T getOutput() {
		return output;
	}

	public void setOutput(T output) {
		this.output = output;
	}

}
