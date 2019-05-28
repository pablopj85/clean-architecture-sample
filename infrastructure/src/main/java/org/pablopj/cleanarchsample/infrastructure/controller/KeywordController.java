package org.pablopj.cleanarchsample.infrastructure.controller;

import java.util.List;

import javax.validation.Valid;

import org.pablopj.cleanarchsample.application.usecase.UseCaseParam;
import org.pablopj.cleanarchsample.application.usecase.keyword.CreateKeyword;
import org.pablopj.cleanarchsample.application.usecase.keyword.GetAllKeyword;
import org.pablopj.cleanarchsample.application.usecase.keyword.GetKeyword;
import org.pablopj.cleanarchsample.application.usecase.keyword.param.CreateKeywordParam;
import org.pablopj.cleanarchsample.application.usecase.keyword.param.GetKeywordParam;
import org.pablopj.cleanarchsample.domain.model.KeywordDTO;
import org.pablopj.cleanarchsample.infrastructure.controller.model.KeywordRequest;
import org.pablopj.cleanarchsample.infrastructure.mapper.KeywordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/keyword", produces = MediaType.APPLICATION_JSON_VALUE)
public class KeywordController {

	@Autowired
	CreateKeyword createKeyword;
	
	@Autowired
	GetKeyword getKeyword;
	
	@Autowired
	GetAllKeyword getAllKeyword;
	
	@Autowired
	KeywordMapper mapper;
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<KeywordDTO> getAll() {
		return getAllKeyword.execute(new UseCaseParam() {
		});
	}
	
	@GetMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public KeywordDTO getById(@PathVariable("id") String id) {
		return getKeyword.execute(new GetKeywordParam(id));
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public KeywordDTO insert(@RequestBody @Valid KeywordRequest keyword) {
		return createKeyword.execute(new CreateKeywordParam(mapper.requestToDto(keyword)));
	}
	
}
