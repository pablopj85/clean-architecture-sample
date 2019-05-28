package org.pablopj.cleanarchsample.application.usecase.keyword;

import org.pablopj.cleanarchsample.application.usecase.UseCase;
import org.pablopj.cleanarchsample.application.usecase.keyword.param.GetKeywordParam;
import org.pablopj.cleanarchsample.domain.exception.NotFoundException;
import org.pablopj.cleanarchsample.domain.model.KeywordDTO;
import org.pablopj.cleanarchsample.domain.service.KeywordService;

public class GetKeyword implements UseCase<GetKeywordParam> {
	
	public KeywordService keywordService;
	
	public GetKeyword(KeywordService keywordService) {
		this.keywordService = keywordService;
	}
	
	@Override
	public KeywordDTO execute(GetKeywordParam param) {
		KeywordDTO keyword = keywordService.getById(param.getId());
		if(keyword == null) {
			throw new NotFoundException("keyword not found") ;
		}
		return keyword;
	}

}
