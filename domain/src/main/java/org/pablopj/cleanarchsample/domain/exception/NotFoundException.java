package org.pablopj.cleanarchsample.domain.exception;

public class NotFoundException extends BusinessException {

	private static final long serialVersionUID = 3616803913814255165L;

	public NotFoundException(String message) {
		super(message);
	}
	
	public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
