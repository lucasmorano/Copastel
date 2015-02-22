package com.ppc.repo;

import com.ppc.document.Element;
import com.ppc.document.User;
import com.ppc.dto.FeedRequestDTO;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by lucasmorano on 2/22/15.
 */
@Repository
public class ElementRepositoryImpl extends GenericRepositoryImpl<Element> implements ElementRepository{

    private static final String LOGIN = "login";
    private static final String ELEMENT_DATE = "elements.createdDate";
    private static final String ELEMENTS = "elements";

    @Override
    Class<Element> getType() {
        return Element.class;
    }

    private int getLimit(Integer limit) {
        return limit != null ? limit : 30;
    }

    @Override
    public User getFeedFromUser(String login, FeedRequestDTO feedRequestDTO) {
        Query query = Query.query(Criteria.where(LOGIN).is(login).and(ELEMENT_DATE).gte(feedRequestDTO.getDate())).limit(getLimit(feedRequestDTO.getLimit()));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public void addElementToUser(String login, Element element) {
        Query query = Query.query(Criteria.where(LOGIN).is(login));
        mongoTemplate.updateFirst(query, new Update().addToSet(ELEMENTS).value(element), User.class);
    }
}
