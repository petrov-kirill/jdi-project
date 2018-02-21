package com.epam.jdiproject.enums.metals_colors_page;

public enum Result {
    SUMMARY("Summary: 11"),
    ELEMENTS("Elements: Water, Fire"),
    COLOR("Color: Red"),
    METAL("Metal: Selen"),
    VEGETABLES("Vegetables: Cucumber, Tomato");

    public String text;

    Result(String text) {
        this.text = text;
    }
}
