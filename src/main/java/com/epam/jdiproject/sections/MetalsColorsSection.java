package com.epam.jdiproject.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.entities.MetalsColorsData;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static org.testng.Assert.assertTrue;

public class MetalsColorsSection extends Section {

    @FindBy(css = ".results li")
    private TextList actualResultTextList;

    public void verifyResults(MetalsColorsData metalColorsDataSet) {
        Map<String, String> expectedLogMap = metalColorsDataSet.getResultLog();
        Object[] s = expectedLogMap.values().toArray();
        for (Object value : s) {
            assertTrue(actualResultTextList.getValue().contains((CharSequence) value));
        }
    }
}
