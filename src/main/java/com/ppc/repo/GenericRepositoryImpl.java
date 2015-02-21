package com.ppc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
* Created by lucasmorano on 2/21/15.
*/
public abstract class GenericRepositoryImpl<Document> implements GenericRepository<Document> {

    abstract Class<Document> getClazz();

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void remove(String id) {
        //mongoTemplate.findAndRemove();
    }

    @Override
    public Document create(Document document) {
        mongoTemplate.save(document);
        return document;
    }

    @Override
    public Document update(Document document) {
        mongoTemplate.save(document);
        return document;
    }

    @Override
    public List<Document> findAll() {
        return mongoTemplate.findAll(getClazz());
    }

    @Override
    public Document findById(String id) {
        return null;
    }


}
