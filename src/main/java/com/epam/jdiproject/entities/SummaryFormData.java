package com.epam.jdiproject.entities;

import com.epam.commons.DataClass;
import com.epam.jdiproject.enums.metals_colors_page.SummaryEnum;

public class SummaryFormData extends DataClass {
    public String oddsRadios = String.valueOf(SummaryEnum.THREE.ordinal());
    public String evenRadios = String.valueOf(SummaryEnum.EIGHT.ordinal());
}
