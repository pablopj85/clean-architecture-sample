package org.pablopj.cleanarchsample.application.usecase;

public interface UseCase<T extends UseCaseParam> {
	
	Object execute(T param);
}
