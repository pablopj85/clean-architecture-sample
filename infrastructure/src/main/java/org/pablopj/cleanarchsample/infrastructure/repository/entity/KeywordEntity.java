package org.pablopj.cleanarchsample.infrastructure.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "keyword")
public class KeywordEntity {
	
	@Id
	private String id;
	
	private String name;

}
