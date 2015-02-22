package com.ppc.dto;

import java.util.Date;

/**
 * Created by lucasmorano on 2/22/15.
 */
public class FeedRequestDTO {

    private Date date;
    private Integer limit;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
