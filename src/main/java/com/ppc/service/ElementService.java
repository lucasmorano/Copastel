package com.ppc.service;

import com.ppc.document.Element;
import com.ppc.dto.FeedRequestDTO;

import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
public interface ElementService extends GenericService<Element> {

    List<Element> getFeedFromLoggedUser(FeedRequestDTO feedRequestDTO);

    void addElementToLoggedUser(Element element);
}
