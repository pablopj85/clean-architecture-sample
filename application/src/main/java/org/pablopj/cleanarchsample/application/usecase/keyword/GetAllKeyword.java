package org.pablopj.cleanarchsample.application.usecase.keyword;

import java.util.List;

import org.pablopj.cleanarchsample.application.usecase.UseCase;
import org.pablopj.cleanarchsample.application.usecase.UseCaseParam;
import org.pablopj.cleanarchsample.domain.model.KeywordDTO;
import org.pablopj.cleanarchsample.domain.service.KeywordService;

public class GetAllKeyword implements UseCase<UseCaseParam> {

	public KeywordService keywordService;
	
	public GetAllKeyword(KeywordService keywordService) {
		this.keywordService = keywordService;
	}
	
	@Override
	public List<KeywordDTO> execute(UseCaseParam param) {
		return keywordService.getAll();
	}

}
