package com.epam.jdiproject.entities;

import com.epam.commons.DataClass;
import com.epam.jdiproject.enums.metals_colors_page.SummaryEnum;

public class SummaryFormData extends DataClass {
    public String oddsRadios = SummaryEnum.THREE.text;
    public String evenRadios = SummaryEnum.EIGHT.text;
}
