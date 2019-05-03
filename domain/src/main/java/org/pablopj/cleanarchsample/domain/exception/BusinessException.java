package org.pablopj.cleanarchsample.domain.exception;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = -4286049874575172563L;

	public BusinessException() {
		super();
	}
	
	public BusinessException(String message) {
		super(message);
	}
	
	public BusinessException(Throwable cause) {
		super(cause);
	}
	
	public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
