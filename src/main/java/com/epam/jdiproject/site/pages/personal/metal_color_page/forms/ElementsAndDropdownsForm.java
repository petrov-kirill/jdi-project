package com.epam.jdiproject.site.pages.personal.metal_color_page.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdiproject.entities.ElementsAndDropdownsFormData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static com.epam.jdiproject.enums.metals_colors_page.Elements.FIRE;
import static com.epam.jdiproject.enums.metals_colors_page.Elements.WATER;
import static com.epam.jdiproject.enums.metals_colors_page.Vegetables.*;

public class ElementsAndDropdownsForm extends Form<ElementsAndDropdownsFormData> {

    @FindBy(css = ".vertical-group label")
    private CheckList elementsList;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    private Dropdown colorsDropdown;

//    @JDropdown(jroot = @JFindBy(css = ".metals"),
//            jlist = @JFindBy(css = "li"),
//            jvalue = @JFindBy(css = ".filter-option")
//    )
//    private Dropdown metalsDropdown;

    @FindBy(css = "[type='text']")
    private TextField metalsDropdown;

    @FindBy(css = "#salad-dropdown button")
    private Button vegetablesButton;

    @FindBy(css = "#salad-dropdown label")
    private CheckList vegetables;

    @FindBy(css = "#submit-button")
    private Button submitButton;

    @Step
    public void checkAndVerifyElements() {
        elementsList.check(ElementsAndDropdownsFormData.elementsList);
        elementsList.isSelected(FIRE.text);
        elementsList.isSelected(WATER.text);
    }

    @Step
    public void selectColor() {
        colorsDropdown.select(ElementsAndDropdownsFormData.colorsDropdown);
    }

    @Step
    public void selectMetal() {
        metalsDropdown.newInput(ElementsAndDropdownsFormData.metalsDropdown);
    }

    @Step
    public void selectVegetables() {
        vegetablesButton.click();
        vegetables.check(ElementsAndDropdownsFormData.vegetablesList);
        vegetables.check(SALAD.text);
        vegetables.isSelected(TOMATO.text);
        vegetables.isSelected(CUCUMBER.text);
    }
}
