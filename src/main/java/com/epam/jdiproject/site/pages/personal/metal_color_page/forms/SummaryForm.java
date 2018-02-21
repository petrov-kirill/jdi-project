package com.epam.jdiproject.site.pages.personal.metal_color_page.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdiproject.entities.SummaryFormData;
import org.openqa.selenium.support.FindBy;

public class SummaryForm extends Form<SummaryFormData> {

    @FindBy(css = "#odds-selector label")
    private RadioButtons oddsRadios;

    @FindBy(css = "#even-selector label")
    private RadioButtons evenRadios;

    @FindBy(css = "#calculate-button")
    private Button calculateButton;
}
