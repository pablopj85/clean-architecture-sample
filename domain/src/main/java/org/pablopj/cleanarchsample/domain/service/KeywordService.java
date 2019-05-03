package org.pablopj.cleanarchsample.domain.service;

import org.pablopj.cleanarchsample.domain.model.Keyword;

public interface KeywordService {
	
	public Keyword getById(String id);
	
	public Keyword insert(Keyword keyword);

}
