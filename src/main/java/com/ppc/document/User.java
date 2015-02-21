package com.ppc.document;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by lucasmorano on 2/21/15.
 */
@Document
public class User {

    private ObjectId id;

    private String login;

    private String password;

}
