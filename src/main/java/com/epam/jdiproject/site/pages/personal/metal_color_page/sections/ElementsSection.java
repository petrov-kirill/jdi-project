package com.epam.jdiproject.site.pages.personal.metal_color_page.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.site.pages.personal.metal_color_page.forms.ElementsForm;
import ru.yandex.qatools.allure.annotations.Step;

public class ElementsSection extends Section {

    ElementsForm elementsForm;

    @Step
    public void checkElements() {
        elementsForm.checkAndVerifyElements();
    }

}
