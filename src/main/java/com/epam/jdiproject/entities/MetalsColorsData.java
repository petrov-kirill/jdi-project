package com.epam.jdiproject.entities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static com.epam.jdiproject.enums.MetalsColorsEnum.*;

public class MetalsColorsData {

    private Integer[] summary;
    private String[] elements;
    private String color;
    private String metals;
    private String[] vegetables;

    public Integer[] getSummary() {
        return summary;
    }

    public String[] getElements() {
        return elements;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }

    public Map<String, String> getResultLog() {
        Map<String, String> result = new HashMap<>();
        result.put(SUMMARY.text, Integer.toString(summary[0] + summary[1]));
        result.put(ELEMENTS.text, Arrays.stream(elements).collect(Collectors.joining(", ")));
        result.put(COLOR.text, color);
        result.put(METAL.text, metals);
        result.put(VEGETABLES.text, Arrays.stream(vegetables).collect(Collectors.joining(", ")));
        return result;
    }
}
