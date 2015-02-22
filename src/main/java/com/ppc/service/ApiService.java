package com.ppc.service;

import com.ppc.document.Element;
import com.ppc.dto.FeedRequestDTO;

import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
public interface ApiService {

    List<Element> getFeed(FeedRequestDTO feedRequestDTO);

    void addElement(Element element);
}
