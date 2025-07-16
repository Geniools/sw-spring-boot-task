package com.alex.sw_task.exception;

public class ServiceNotFoundException extends RuntimeException {
	public ServiceNotFoundException(String message) {
		super(message);
	}
}
