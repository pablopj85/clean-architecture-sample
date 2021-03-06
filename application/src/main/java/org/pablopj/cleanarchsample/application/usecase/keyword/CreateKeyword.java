package org.pablopj.cleanarchsample.application.usecase.keyword;

import org.pablopj.cleanarchsample.application.usecase.UseCase;
import org.pablopj.cleanarchsample.application.usecase.keyword.param.CreateKeywordParam;
import org.pablopj.cleanarchsample.domain.model.KeywordDTO;
import org.pablopj.cleanarchsample.domain.service.KeywordService;

public class CreateKeyword implements UseCase<CreateKeywordParam> {
	
	public KeywordService keywordService;
	
	public CreateKeyword(KeywordService keywordService) {
		this.keywordService = keywordService;
	}
	
	@Override
	public KeywordDTO execute(CreateKeywordParam param) {
		//some business logic
		return keywordService.insert(param.getKeyword());
	}

}
