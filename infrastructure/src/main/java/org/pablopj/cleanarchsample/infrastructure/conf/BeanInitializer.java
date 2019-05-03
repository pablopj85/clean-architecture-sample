package org.pablopj.cleanarchsample.infrastructure.conf;

import org.pablopj.cleanarchsample.application.usecase.keyword.CreateKeyword;
import org.pablopj.cleanarchsample.application.usecase.keyword.GetKeyword;
import org.pablopj.cleanarchsample.infrastructure.service.KeywordServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInitializer {

	@Bean
	public GetKeyword getKeyword(KeywordServiceImpl keywordService) {
		return new GetKeyword(keywordService);
	}
	
	@Bean
	public CreateKeyword createKeyword(KeywordServiceImpl keywordService) {
		return new CreateKeyword(keywordService);
	}
	
}
