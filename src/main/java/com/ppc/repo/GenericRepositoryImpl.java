package com.ppc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* Created by lucasmorano on 2/21/15.
*/
@Repository
public class GenericRepositoryImpl<Document> implements GenericRepository<Document> {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void remove(String id) {
        //mongoTemplate.findAndRemove();
    }

    @Override
    public Document create(Document document) {
        return null;
    }

    @Override
    public Document update(Document document) {
        return null;
    }

    @Override
    public List<Document> findAll() {
        return null;
    }

    @Override
    public Document findById(String id) {
        return null;
    }
}
