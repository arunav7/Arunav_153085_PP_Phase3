package com.cg.mypaymentapp.exception;

public class MobileNumberNotRegistered extends RuntimeException{
	private static final long serialVersionUID = 1959911043330276047L;

	public MobileNumberNotRegistered() {
		super();
		
	}

	public MobileNumberNotRegistered(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public MobileNumberNotRegistered(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public MobileNumberNotRegistered(String arg0) {
		super(arg0);
		
	}

	public MobileNumberNotRegistered(Throwable arg0) {
		super(arg0);
		
	}

}
