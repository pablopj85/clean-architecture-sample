package org.pablopj.cleanarchsample.application.usecase.keyword;

import org.pablopj.cleanarchsample.application.usecase.UseCase;
import org.pablopj.cleanarchsample.domain.exception.NotFoundException;
import org.pablopj.cleanarchsample.domain.model.Keyword;
import org.pablopj.cleanarchsample.domain.service.KeywordService;

public class GetKeyword implements UseCase {
	
	public KeywordService keywordService;
	
	public GetKeyword(KeywordService keywordService) {
		this.keywordService = keywordService;
	}
	
	public Keyword get(String id) {
		Keyword keyword = keywordService.getById(id);
		if(keyword == null) {
			throw new NotFoundException("keyword not found") ;
		}
		return keyword;
	}

}
