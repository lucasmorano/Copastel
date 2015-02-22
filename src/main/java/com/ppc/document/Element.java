package com.ppc.document;

import java.util.Date;
import java.util.UUID;

/**
 * Created by lucasmorano on 2/21/15.
 */
public class Element {

    private String id = UUID.randomUUID().toString();

    private ElementType elementType = ElementType.TEXT;

    private String value;

    private Date createdDate = new Date();

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
