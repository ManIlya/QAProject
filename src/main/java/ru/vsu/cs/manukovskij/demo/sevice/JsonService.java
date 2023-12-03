package ru.vsu.cs.manukovskij.demo.sevice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonService {
    private final ObjectMapper objectMapper;

    public JsonService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void saveDataToFile(Object data, String filePath)  throws IOException {
        objectMapper.writeValue(new File(filePath), data);
    }
    public <T> T loadDataFromFile(Class<T> valueType, String filePath) throws IOException {
        return objectMapper.readValue(new File(filePath), valueType);
    }
}
