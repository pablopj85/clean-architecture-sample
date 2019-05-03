package org.pablopj.cleanarchsample.infrastructure.mapper;

import org.pablopj.cleanarchsample.domain.model.Keyword;
import org.pablopj.cleanarchsample.infrastructure.repository.entity.KeywordEntity;
import org.springframework.stereotype.Component;

@Component
public class KeywordMapper {
	
	public Keyword entityToDto(KeywordEntity entity) {
		Keyword dto = null; 
		if(entity != null) {
			dto = new Keyword();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
		}
				
		return dto;
	}
	
	public KeywordEntity dtoToEntity(Keyword dto) {
		KeywordEntity entity = null; 
		if(dto != null) {
			entity = new KeywordEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
		}
				
		return entity;
	}

}
