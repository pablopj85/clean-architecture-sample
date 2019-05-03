package org.pablopj.cleanarchsample.application.usecase.keyword;

import org.pablopj.cleanarchsample.application.usecase.UseCase;
import org.pablopj.cleanarchsample.domain.model.Keyword;
import org.pablopj.cleanarchsample.domain.service.KeywordService;

public class CreateKeyword implements UseCase {
	
	public KeywordService keywordService;
	
	public CreateKeyword(KeywordService keywordService) {
		this.keywordService = keywordService;
	}
	
	public Keyword create(Keyword keyword) {
		//some business logic
		return keywordService.insert(keyword);
	}

}
