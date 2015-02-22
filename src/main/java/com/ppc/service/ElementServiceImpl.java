package com.ppc.service;

import com.ppc.context.Context;
import com.ppc.document.Element;
import com.ppc.document.User;
import com.ppc.dto.FeedRequestDTO;
import com.ppc.repo.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
@Service
public class ElementServiceImpl extends GenericServiceImpl<Element> implements ElementService {

    @Autowired
    private ElementRepository elementRepository;

    @Autowired
    private Context context;

    @Override
    public List<Element> getFeedFromLoggedUser(FeedRequestDTO feedRequestDTO) {
        User user = elementRepository.getFeedFromUser(context.getLoggedUser().getUsername(), feedRequestDTO);
        return user.getElements();
    }

    @Override
    public void addElementToLoggedUser(Element element) {
        UserDetails loggedUser = context.getLoggedUser();
        elementRepository.addElementToUser(loggedUser.getUsername(), element);
    }
}
