package com.epam.jdiproject.enums;

import java.util.Objects;

public enum HeaderMenuOptionsEnum {
    HOME,
    CONTACT_FORM,
    SERVICE,
    METALS_COLORS("Metals & Colors");

    private String text;

    HeaderMenuOptionsEnum() {
    }

    HeaderMenuOptionsEnum(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return Objects.isNull(text) ? name().replaceAll("_", " ") : text;
    }
}
