package com.epam.jdiproject;

import com.epam.jdiproject.entities.MetalsColorsData;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class DataParser {

    public Object[] data;

    DataParser() throws FileNotFoundException {
        JsonObject jsonObject = new JsonParser()
                .parse(new FileReader("src/main/resources/test_data.json")).getAsJsonObject();
        Map<String, MetalsColorsData> mapData =
                new Gson().fromJson(jsonObject, new TypeToken<Map<String, MetalsColorsData>>() {
                }.getType());

        data = mapData.values().toArray();
    }
}
