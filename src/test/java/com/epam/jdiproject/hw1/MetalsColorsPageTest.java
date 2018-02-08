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
        // TODO it is not really essential to use ENUM and Class, make your choice. Use both of them is not make a sense
        EpamSite.indexPage.headerSection.performLogin(new User(PITER_CHAILOVSKII.login, PITER_CHAILOVSKII.password));

        //2 open and check is MetalsColorsPage opened
        // TODO you should open pages by Menu class from JDI framework
        EpamSite.indexPage.headerSection.openMetalsColorsPage();

        // TODO same comments, nothing changed.
        // TODO take a look on Test steps carefully...
        //3 check radio buttons
        EpamSite.metalsColorsPage.summarySection.checkSummaryFormRadios(new SummaryFormData());

        //4 check elements, select color, metal and vegetables
        EpamSite.metalsColorsPage.elementsAndDropdownsSection.checkAndSelectElements(new ElementsAndDropdownsFormData());
        // !TODO

        // TODO what the point ??? You should REMEMBER the data that has been used for filling form !!!
        //5 verify results
        EpamSite.metalsColorsPage.resultSection.verifyResults(new ResultSectionData());
    }
}
