package com.cg.mypaymentapp.exception;

public class ZeroBalanceException  extends RuntimeException {
	private static final long serialVersionUID = -2255278867389525273L;

	public ZeroBalanceException() {
		super();
		
	}

	public ZeroBalanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ZeroBalanceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ZeroBalanceException(String message) {
		super(message);
		
	}

	public ZeroBalanceException(Throwable cause) {
		super(cause);
		
	}
	
}
