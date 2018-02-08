package com.epam.jdiproject.site.pages.personal.metal_color_page.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.entities.ElementsAndDropdownsFormData;
import com.epam.jdiproject.site.pages.personal.metal_color_page.forms.ElementsAndDropdownsForm;
import ru.yandex.qatools.allure.annotations.Step;

public class ElementsAndDropdownsSection extends Section {

    ElementsAndDropdownsForm elementsAndDropdownsForm;

    @Step
    public void checkAndSelectElements(ElementsAndDropdownsFormData data) {
        elementsAndDropdownsForm.checkAndVerifyElements(data);
        elementsAndDropdownsForm.selectColor(data);
        elementsAndDropdownsForm.selectMetal(data);
        elementsAndDropdownsForm.selectVegetables(data);
        elementsAndDropdownsForm.submit(data);
    }

}
