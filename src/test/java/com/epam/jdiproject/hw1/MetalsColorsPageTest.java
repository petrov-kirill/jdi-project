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
        header.verifyUserName();

        //2 open MetalsColorsPage
        header.openMetalsColorsPage();
        metalsColorsPage.checkOpened();

        //3 check radio buttons
        metalsColorsPage.summarySection.checkSummaryFormRadios();

        //4 check elements
        metalsColorsPage.elementsSection.checkElements();



        try {
            Thread.currentThread().sleep(2222);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
