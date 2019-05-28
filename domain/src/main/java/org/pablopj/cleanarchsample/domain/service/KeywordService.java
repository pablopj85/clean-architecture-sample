package org.pablopj.cleanarchsample.domain.service;

import java.util.List;

import org.pablopj.cleanarchsample.domain.model.KeywordDTO;

public interface KeywordService {
	
	public List<KeywordDTO> getAll();
	
	public KeywordDTO getById(String id);
	
	public KeywordDTO insert(KeywordDTO keyword);

}
