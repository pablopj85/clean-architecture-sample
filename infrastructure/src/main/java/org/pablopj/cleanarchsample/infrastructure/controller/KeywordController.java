package org.pablopj.cleanarchsample.infrastructure.controller;

import javax.validation.Valid;

import org.pablopj.cleanarchsample.application.usecase.keyword.CreateKeyword;
import org.pablopj.cleanarchsample.application.usecase.keyword.GetKeyword;
import org.pablopj.cleanarchsample.domain.model.Keyword;
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
	private CreateKeyword createKeyword;
	
	@Autowired
	private GetKeyword getKeyword;
	
	@GetMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Keyword getById(@PathVariable("id") String id) {
		return getKeyword.get(id);
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Keyword insert(@RequestBody @Valid Keyword keyword) {
		return createKeyword.create(keyword);
	}
	
}
