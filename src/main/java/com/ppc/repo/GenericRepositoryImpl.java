package com.ppc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by lucasmorano on 2/21/15.
 */
public abstract class GenericRepositoryImpl<Document> implements GenericRepository<Document> {

    private static final String ID = "id";

    abstract Class<Document> getType();

    @Autowired
    protected MongoTemplate mongoTemplate;

    @Override
    public void remove(String id) {
        Query query = Query.query(Criteria.where(ID).is(id));
        mongoTemplate.remove(query, getType());
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
        return mongoTemplate.findAll(getType());
    }

    @Override
    public Document findById(String id) {
        return mongoTemplate.findById(id, getType());
    }


}
