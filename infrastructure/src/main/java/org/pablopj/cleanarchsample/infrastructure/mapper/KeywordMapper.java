package org.pablopj.cleanarchsample.infrastructure.mapper;

import org.pablopj.cleanarchsample.domain.model.KeywordDTO;
import org.pablopj.cleanarchsample.infrastructure.controller.model.KeywordRequest;
import org.pablopj.cleanarchsample.infrastructure.repository.entity.KeywordEntity;
import org.springframework.stereotype.Component;

@Component
public class KeywordMapper {
	
	public KeywordDTO entityToDto(KeywordEntity entity) {
		KeywordDTO dto = null; 
		if(entity != null) {
			dto = new KeywordDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
		}
				
		return dto;
	}
	
	public KeywordDTO requestToDto(KeywordRequest request) {
		KeywordDTO dto = null; 
		if(request != null) {
			dto = new KeywordDTO();
			dto.setId(request.getId());
			dto.setName(request.getName());
		}
				
		return dto;
	}
	
	public KeywordEntity dtoToEntity(KeywordDTO dto) {
		KeywordEntity entity = null; 
		if(dto != null) {
			entity = new KeywordEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
		}
				
		return entity;
	}

}
