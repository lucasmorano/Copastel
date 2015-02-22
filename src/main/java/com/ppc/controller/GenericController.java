package com.ppc.controller;

import com.ppc.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lucasmorano on 2/21/15.
 */
public class GenericController<Document> {

    @Autowired
    private GenericService<Document> service;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Document create(@RequestBody Document document) {
        return service.create(document);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Document> list() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void remove(@PathVariable String id) {
        service.remove(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Document retrieve(@PathVariable String id) {
        return service.findById(id);
    }

}
