package com.sms.ehandling;

public class InternalServerErr extends RuntimeException{
	private static final long serialVersionUID = 1L;
    public InternalServerErr(String msg) {
    	super(msg);
    }
}
