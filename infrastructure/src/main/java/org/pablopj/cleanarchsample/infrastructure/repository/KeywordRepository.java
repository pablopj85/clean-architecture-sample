package org.pablopj.cleanarchsample.infrastructure.repository;

import org.pablopj.cleanarchsample.infrastructure.repository.entity.KeywordEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeywordRepository extends MongoRepository<KeywordEntity, String> {

}
