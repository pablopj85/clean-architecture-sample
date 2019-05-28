package org.pablopj.cleanarchsample.application.usecase.keyword.param;

import org.pablopj.cleanarchsample.application.usecase.UseCaseParam;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetKeywordParam implements UseCaseParam {
	
	private String id;

}
