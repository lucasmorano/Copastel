package com.ppc.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by lucasmorano on 2/21/15.
 */
public class CustomOmmitSerializer extends StdSerializer<String> {

    public CustomOmmitSerializer(Class<String> t) {
        super(t);
    }

    @Override
    public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException {
        jgen.writeString(value);
    }
}
