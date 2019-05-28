package org.pablopj.cleanarchsample.application.usecase.keyword.param;

import org.pablopj.cleanarchsample.application.usecase.UseCaseParam;
import org.pablopj.cleanarchsample.domain.model.KeywordDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateKeywordParam implements UseCaseParam {
	
	private KeywordDTO keyword;

}
