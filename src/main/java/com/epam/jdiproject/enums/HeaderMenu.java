package com.epam.jdiproject.enums;

public enum HeaderMenu {
    HOME, CONTACT_FORM, SERVICE, METALSANDCOLORS;

    @Override
    public String toString() {
        return name().replaceAll("_", " ").replaceAll("AND", " ");
    }
}
