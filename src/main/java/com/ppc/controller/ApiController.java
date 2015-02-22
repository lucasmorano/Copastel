package com.ppc.controller;

import com.ppc.document.Element;
import com.ppc.dto.FeedRequestDTO;
import com.ppc.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
@Controller
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping(value = "/GetFeed", method = RequestMethod.POST)
    @ResponseBody
    public List<Element> getFeed(@RequestBody FeedRequestDTO feedRequestDTO){
        return apiService.getFeed(feedRequestDTO);
    }

    @RequestMapping(value = "/AddElement", method = RequestMethod.POST)
    @ResponseBody
    public void addElement(@RequestBody Element element){
        apiService.addElement(element);
    }
}
