package com.epam.jdiproject.sections.common;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdiproject.enums.HeaderMenuOptionsEnum;

public class HeaderMenu extends Menu{

    public void selectHeaderOption(HeaderMenuOptionsEnum option) {
        super.select(option.toString());
    }
}
