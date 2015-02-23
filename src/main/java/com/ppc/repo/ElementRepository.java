package com.ppc.repo;

import com.ppc.document.Element;
import com.ppc.document.User;
import com.ppc.dto.FeedRequestDTO;

/**
 * Created by lucasmorano on 2/22/15.
 */
public interface ElementRepository extends GenericRepository<Element> {

    User getFeedFromUser(String login, FeedRequestDTO feedRequestDTO);

    void addElementToUser(String login, Element element);
}
