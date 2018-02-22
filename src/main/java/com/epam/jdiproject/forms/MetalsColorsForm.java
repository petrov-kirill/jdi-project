package com.epam.jdiproject.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdiproject.entities.MetalsColorsData;
import org.openqa.selenium.support.FindBy;

public class MetalsColorsForm extends Form {

    @FindBy(css = "#odds-selector p")
    private RadioButtons oddRadios;

    @FindBy(css = "#even-selector p")
    private RadioButtons evenRadios;

    @FindBy(css = "#submit-button")
    private Button submitButton;

    @FindBy(css = "#elements-checklist p label")
    private CheckList elementsCheckList = new CheckList() {
        @Override
        protected void selectListAction(String... names) {
            if (names.length != 0) {
                super.selectListAction(names);
            }
        }
    };

    @JDropdown(
            root = @FindBy(css = ".colors"),
            value = @FindBy(css = ".filter-option"),
            list = @FindBy(tagName = "li")
    )
    private Dropdown colorsDropdown = new Dropdown() {
        @Override
        protected void selectAction(String name) {
            if (!name.equals("")) {
                super.selectAction(name);
            }
        }
    };

    @JComboBox(
            root = @FindBy(css = ".metals"),
            list = @FindBy(tagName = "li"),
            expand = @FindBy(css = ".caret")
    )
    private ComboBox metalsComboBox = new ComboBox() {
        @Override
        protected void selectAction(String name) {
            if (!name.equals("")) {
                super.selectAction(name);
            }
        }
    };

    @JDropdown(
            root = @FindBy(css = "#salad-dropdown"),
            value = @FindBy(css = ".btn"),
            list = @FindBy(css = ".checkbox"),
            expand = @FindBy(css = ".caret")
    )
    private Dropdown vegetablesDropdown = new Dropdown() {
        @Override
        protected void selectAction(String name) {
            if (!name.equals("")) {
                super.selectAction(name);
            }
        }
    };

    public void fillMetalsColorsForm(MetalsColorsData metalsColorsData) {
        if (metalsColorsData.getSummary().length == 2) {
            oddRadios.select(metalsColorsData.getSummary()[0].toString());
            evenRadios.select(metalsColorsData.getSummary()[1].toString());
        }

        elementsCheckList.check(metalsColorsData.getElements());

        colorsDropdown.select(metalsColorsData.getColor());

        metalsComboBox.select(metalsColorsData.getMetals());

        for (String vegetable : vegetablesDropdown.getText().split(", ")) {
            vegetablesDropdown.select(vegetable);
        }
        for (String vegetable : metalsColorsData.getVegetables()) {
            vegetablesDropdown.select(vegetable);
        }
        submitButton.click();
    }
}
