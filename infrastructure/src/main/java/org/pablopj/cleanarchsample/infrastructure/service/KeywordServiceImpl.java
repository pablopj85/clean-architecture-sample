package org.pablopj.cleanarchsample.infrastructure.service;

import java.util.List;
import java.util.stream.Collectors;

import org.pablopj.cleanarchsample.domain.model.KeywordDTO;
import org.pablopj.cleanarchsample.domain.service.KeywordService;
import org.pablopj.cleanarchsample.infrastructure.mapper.KeywordMapper;
import org.pablopj.cleanarchsample.infrastructure.repository.KeywordRepository;
import org.pablopj.cleanarchsample.infrastructure.repository.entity.KeywordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class KeywordServiceImpl implements KeywordService {

	@Autowired
	KeywordRepository keywordRepository;
	
	@Autowired
	KeywordMapper mapper;
	
	@Override
	public List<KeywordDTO> getAll() {
		List<KeywordEntity> keywords = keywordRepository.findAll();
		if(!CollectionUtils.isEmpty(keywords)) {
			return keywords.stream().map(mapper::entityToDto).collect(Collectors.toList());
		}
		return null;
	}
	
	@Override
	public KeywordDTO getById(String id) {
		return mapper.entityToDto(keywordRepository.findById(id).orElse(null));
	}

	@Override
	public KeywordDTO insert(KeywordDTO keyword) {
		KeywordEntity KeywordCreated = keywordRepository.save(mapper.dtoToEntity(keyword));
		return mapper.entityToDto(KeywordCreated);
	}

}
