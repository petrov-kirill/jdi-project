package com.epam.jdiproject.enums.metals_colors_page;

public enum Result {
    SUMMARY("Summary: 11"),
    COLOR("Color: Red"),
    METAL("Metal: Selen"),
    ELEMENTS("Elements: Water, Fire"),
    VEGETABLES("Vegetables: Cucumber, Tomato");

    public String text;

    Result(String text) {
        this.text = text;
    }
}
