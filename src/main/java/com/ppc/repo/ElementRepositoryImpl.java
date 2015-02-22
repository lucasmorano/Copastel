package com.ppc.repo;

import com.ppc.document.Element;
import com.ppc.dto.FeedRequestDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
@Repository
public class ElementRepositoryImpl extends GenericRepositoryImpl<Element> implements ElementRepository{

    @Override
    Class<Element> getType() {
        return Element.class;
    }

    @Override
    public List<Element> getFeedFromUser(String login, FeedRequestDTO feedRequestDTO) {
        return null;
    }

    @Override
    public void addElementToUser(String login, Element element) {

    }
}
