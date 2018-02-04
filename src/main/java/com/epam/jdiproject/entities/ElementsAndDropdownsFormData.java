package com.epam.jdiproject.entities;

import com.epam.commons.DataClass;
import com.epam.jdiproject.enums.metals_colors_page.Elements;
import com.epam.jdiproject.enums.metals_colors_page.Vegetables;

import static com.epam.jdiproject.enums.metals_colors_page.Colors.RED;
import static com.epam.jdiproject.enums.metals_colors_page.Elements.FIRE;
import static com.epam.jdiproject.enums.metals_colors_page.Elements.WATER;
import static com.epam.jdiproject.enums.metals_colors_page.Metals.SELEN;
import static com.epam.jdiproject.enums.metals_colors_page.Vegetables.CUCUMBER;
import static com.epam.jdiproject.enums.metals_colors_page.Vegetables.TOMATO;

public class ElementsAndDropdownsFormData extends DataClass {
    public static Elements[] elementsList = {WATER, FIRE};
    public static Vegetables[] vegetablesList = {CUCUMBER, TOMATO};
    public static String colorsDropdown = RED.text;
    public static String metalsDropdown = SELEN.text;
}
