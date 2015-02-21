package com.ppc.repo;

import org.springframework.data.repository.Repository;

import java.util.List;

/**
* Created by lucasmorano on 2/21/15.
*/
public interface GenericRepository<Document> { //extends Repository<Document, String> {

    void remove(String id);

    Document create(Document document);

    Document update(Document document);

    List<Document> findAll();

    Document findById(String id);
}
