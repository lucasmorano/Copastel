package com.ppc.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by lucasmorano on 2/21/15.
 */
@Document
public class Device {

    @Id
    private ObjectId id;

    private String imei;

    private String model;

    private String gcmKey;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGcmKey() {
        return gcmKey;
    }

    public void setGcmKey(String gcmKey) {
        this.gcmKey = gcmKey;
    }
}
