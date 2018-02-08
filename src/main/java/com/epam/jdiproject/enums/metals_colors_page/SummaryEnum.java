package com.epam.jdiproject.enums.metals_colors_page;

// TODO great !! Why did you do this enum ? Integer::toString is not enough ?
public enum SummaryEnum {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8");

    public String text;

    SummaryEnum(String text) {
        this.text = text;
    }
}
