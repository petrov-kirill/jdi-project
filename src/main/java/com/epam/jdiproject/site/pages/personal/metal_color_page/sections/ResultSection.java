package com.epam.jdiproject.site.pages.personal.metal_color_page.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.entities.ResultSectionData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashSet;
import java.util.Set;

import static com.epam.web.matcher.testng.Assert.assertEquals;
import static com.epam.web.matcher.testng.Assert.assertTrue;

public class ResultSection extends Section {

    @FindBy(css = ".results li")
    private TextList resultsArea;

    @Step
    public void verifyResults(ResultSectionData data) {
        for (int i = 0; i < data.results.length; i++) {
            assertEquals(data.results[i].text, resultsArea.getTextList().get(i));
        }
    }
}
