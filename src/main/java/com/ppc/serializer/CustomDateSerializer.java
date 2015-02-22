package com.ppc.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lucasmorano on 2/21/15.
 */
public class CustomDateSerializer extends StdSerializer<Date> {

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

    public CustomDateSerializer(Class<Date> t) {
        super(t);
    }

    @Override
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String format = formatter.format(value);
        jgen.writeString(format);
    }
}
