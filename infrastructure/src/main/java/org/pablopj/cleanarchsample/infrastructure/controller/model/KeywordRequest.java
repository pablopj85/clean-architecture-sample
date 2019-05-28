package org.pablopj.cleanarchsample.infrastructure.controller.model;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class KeywordRequest {
	
	private String id;
	
	@NotEmpty
	private String name;

}
