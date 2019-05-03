package org.pablopj.cleanarchsample.infrastructure.service;

import org.pablopj.cleanarchsample.domain.model.Keyword;
import org.pablopj.cleanarchsample.domain.service.KeywordService;
import org.pablopj.cleanarchsample.infrastructure.mapper.KeywordMapper;
import org.pablopj.cleanarchsample.infrastructure.repository.KeywordRepository;
import org.pablopj.cleanarchsample.infrastructure.repository.entity.KeywordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeywordServiceImpl implements KeywordService {

	@Autowired
	KeywordRepository keywordRepository;
	
	@Autowired
	KeywordMapper mapper;
	
	@Override
	public Keyword getById(String id) {
		return mapper.entityToDto(keywordRepository.findById(id).orElse(null));
	}

	@Override
	public Keyword insert(Keyword keyword) {
		KeywordEntity KeywordCreated = keywordRepository.save(mapper.dtoToEntity(keyword));
		return mapper.entityToDto(KeywordCreated);
	}

}
