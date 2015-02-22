package com.ppc.service;

import com.ppc.repo.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* Created by lucasmorano on 2/21/15.
*/
public abstract class GenericServiceImpl<Document> implements GenericService<Document> {

    @Autowired
    protected GenericRepository<Document> repo;

    @Override
    public void remove(String id) {
        repo.remove(id);
    }

    @Override
    public Document create(Document document) {
        return repo.create(document);
    }

    @Override
    public Document update(Document document) {
        return repo.update(document);
    }

    @Override
    public List<Document> findAll() {
        return repo.findAll();
    }

    @Override
    public Document findById(String id) {
        return repo.findById(id);
    }

}
