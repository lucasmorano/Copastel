package com.ppc.service;

import com.ppc.document.Element;
import com.ppc.dto.FeedRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by lucasmorano on 2/22/15.
 */
@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ElementService elementService;

    @Override
    public List<Element> getFeed(FeedRequestDTO feedRequestDTO) {
        if(feedRequestDTO == null){
           feedRequestDTO = new FeedRequestDTO();
        }
        if (feedRequestDTO.getDate() == null) {
            feedRequestDTO.setDate(getDefaultFeedDate());
        }
        return elementService.getFeedFromLoggedUser(feedRequestDTO);
    }

    @Override
    public void addElement(Element element) {
        elementService.addElementToLoggedUser(element);
    }

    public Date getDefaultFeedDate() {
        Calendar instance = GregorianCalendar.getInstance();
        instance.setTime(new Date());
        instance.add(Calendar.MONTH, -1);
        return instance.getTime();
    }
}
