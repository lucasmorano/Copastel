package com.ppc.service;

import com.ppc.repo.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* Created by lucasmorano on 2/21/15.
*/
public class GenericServiceImpl<Document> implements GenericService<Document> {

    @Autowired
    private GenericRepository<Document> repo;

    @Override
    public void remove(String id) {

    }

    @Override
    public Document create(Document document) {
        return repo.create(document);
    }

    @Override
    public Document update(Document document) {
        return null;
    }

    @Override
    public List<Document> findAll() {
        return repo.findAll();
    }

    @Override
    public Document findById(String id) {
        return null;
    }
}
