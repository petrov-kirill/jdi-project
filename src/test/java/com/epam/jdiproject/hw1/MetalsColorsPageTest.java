package com.epam.jdiproject.hw1;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdiproject.InitTests;
import com.epam.jdiproject.site.EpamSite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.jdiproject.site.EpamSite.header;
import static com.epam.jdiproject.site.EpamSite.indexPage;
import static com.epam.jdiproject.site.EpamSite.metalsColorsPage;

public class MetalsColorsPageTest extends InitTests {

    @BeforeClass
    public void setup() {
        WebSite.init(EpamSite.class);
        indexPage.open();
    }

    @Test
    public void verifyElementsBehaviour() {
        //1 perform and assert login
        header.performLogin();

        // TODO Wrapper common error
        header.verifyUserName();

        //2 open MetalsColorsPage
        header.openMetalsColorsPage();
        metalsColorsPage.checkOpened();

        // TODO the best approach is exactly the same as Login.submit(user).
        // TODO take a look on the last ore previous presentation, UI Objects...
        // TODO for example: Site.page.form.submit(Entity)
        //3 check radio buttons
        metalsColorsPage.summarySection.checkSummaryFormRadios();

        //4 check elements, select color, metal and vegetables
        // TODO same ^
        metalsColorsPage.elementsAndDropdownsSection.checkAndSelectElements();

        //5 verify results
        // TODO same. What kind of entity you would like to verify there ??? Pass it throw the method..
        metalsColorsPage.resultSection.verifyResults();
    }
}
