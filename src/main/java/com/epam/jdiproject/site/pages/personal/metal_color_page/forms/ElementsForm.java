package com.epam.jdiproject.site.pages.personal.metal_color_page.forms;

import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdiproject.entities.ElementsFormData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static com.epam.jdiproject.enums.metals_colors_page.Elements.FIRE;
import static com.epam.jdiproject.enums.metals_colors_page.Elements.WATER;

public class ElementsForm extends Form<ElementsFormData> {

    @FindBy(css = ".vertical-group label")
    private CheckList elementList;

    @Step
    public void checkAndVerifyElements() {
        elementList.check(FIRE.text, WATER.text);
        elementList.isSelected(FIRE.text);
        elementList.isSelected(WATER.text);
    }
}
