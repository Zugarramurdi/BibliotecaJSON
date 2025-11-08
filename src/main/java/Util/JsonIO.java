package Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;



public class JsonIO {

    private static final ObjectMapper MAPPER = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    private JsonIO() {}

    public static <T> void write(File file, T data) throws IOException {

        file.getParentFile().mkdirs();

        MAPPER.writeValue(file, data);
    }

    public static <T> T read(File file, Class<T> type) throws IOException {

        return MAPPER.readValue(file, type);

    }


}
