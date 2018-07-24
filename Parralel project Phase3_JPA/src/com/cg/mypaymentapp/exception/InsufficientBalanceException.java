package com.cg.mypaymentapp.exception;

public class InsufficientBalanceException extends RuntimeException{
	private static final long serialVersionUID = -8671436944182184872L;

	public InsufficientBalanceException(String msg) {
		super(msg);
	}

	public InsufficientBalanceException() {
		super();
		
	}

	public InsufficientBalanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InsufficientBalanceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InsufficientBalanceException(Throwable cause) {
		super(cause);
		
	}
	
}
