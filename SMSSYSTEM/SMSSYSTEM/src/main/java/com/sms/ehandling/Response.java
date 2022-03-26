package com.sms.ehandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class Response {

	private String Message;
	private HttpStatus Status;
	private LocalDateTime dateTime;
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public HttpStatus getStatus() {
		return Status;
	}
	public void setStatus(HttpStatus status) {
		Status = status;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		return "Response [Message=" + Message + ", Status=" + Status + ", dateTime=" + dateTime + "]";
	}
	
}
