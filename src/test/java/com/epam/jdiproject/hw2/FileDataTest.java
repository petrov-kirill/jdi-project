package com.epam.jdiproject.hw2;

import com.epam.jdiproject.entities.JsonDataModel;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class FileDataTest {

    @Test
    public void testDp2() {

    }

    @DataProvider(name = "dp2")
    public Object[][] dp2() {
        return null;
    }


    @Test(dataProvider = "dp1")
    public void testDp1(JsonDataModel data) {
        System.out.println(data);
    }

    @DataProvider(name = "dp1")
    public Object[][] getData() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src\\test\\resources\\test_data.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("jsonData");
        List<JsonDataModel> testData = new Gson().fromJson(dataSet, new TypeToken<List<JsonDataModel>>(){}.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }
}
