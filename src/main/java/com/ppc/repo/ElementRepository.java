package com.ppc.repo;

import com.ppc.document.Element;
import com.ppc.dto.FeedRequestDTO;

import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
public interface ElementRepository extends GenericRepository<Element> {

    List<Element> getFeedFromUser(String login, FeedRequestDTO feedRequestDTO);

    void addElementToUser(String login, Element element);
}
