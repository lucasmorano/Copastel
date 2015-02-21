package com.ppc.repo;

import java.util.List;

/**
* Created by lucasmorano on 2/21/15.
*/
public interface GenericRepository<Document> {

    void remove(String id);

    Document create(Document document);

    Document update(Document document);

    List<Document> findAll();

    Document findById(String id);
}
