package com.epam.jdiproject.hw1;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdiproject.InitTests;
import com.epam.jdiproject.entities.ElementsAndDropdownsFormData;
import com.epam.jdiproject.entities.ResultSectionData;
import com.epam.jdiproject.entities.SummaryFormData;
import com.epam.jdiproject.entities.User;
import com.epam.jdiproject.site.EpamSite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.jdiproject.enums.Users.PITER_CHAILOVSKII;
import static com.epam.jdiproject.site.EpamSite.indexPage;

public class MetalsColorsPageTest extends InitTests {

    @BeforeClass
    public void setup() {
        WebSite.init(EpamSite.class);
        indexPage.open();
    }

    @Test
    public void verifyElementsBehaviour() {
        //1 perform and verify login
        EpamSite.indexPage.headerSection.performLogin(new User(PITER_CHAILOVSKII.login, PITER_CHAILOVSKII.password));

        //2 open and check is MetalsColorsPage opened
        EpamSite.indexPage.headerSection.openMetalsColorsPage();

        //3 check radio buttons
        EpamSite.metalsColorsPage.summarySection.checkSummaryFormRadios(new SummaryFormData());

        //4 check elements, select color, metal and vegetables
        EpamSite.metalsColorsPage.elementsAndDropdownsSection.checkAndSelectElements(new ElementsAndDropdownsFormData());

        //5 verify results
        EpamSite.metalsColorsPage.resultSection.verifyResults(new ResultSectionData());
    }
}
