package com.epam.jdiproject.site.pages.personal.metal_color_page.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.entities.ResultSectionData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashSet;
import java.util.Set;

import static com.epam.web.matcher.testng.Assert.assertTrue;

public class ResultSection extends Section {

    @FindBy(css = ".results li")
    private TextList resultsArea;

    @Step
    public void verifyResults(ResultSectionData data) {
        // TODO TextList has a method that allow you to get List of the results at once
        // TODO what is the point to use Set ?
        Set<String> set = new HashSet<>();
        for (int i = 0; i < data.results.length; i++) {
            set.add(resultsArea.getText(i));
        }

        // TODO what happened if we have a different size of the set and data.results ?
        // TODO as far as you know, in 8 hw we have a lot of data, thi approach might be useless...
        for (int i = 0; i < set.size(); i++) {
            assertTrue(set.contains(data.results[i].text));
        }
    }
}
