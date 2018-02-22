package com.epam.jdiproject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdiproject.EpamSite.homePage;
import static com.epam.jdiproject.EpamSite.metalsColorsPage;
import static com.epam.jdiproject.entities.User.PITER_CHAILOVSKII;
import static com.epam.jdiproject.enums.HeaderMenuOptionsEnum.METALS_COLORS;

public class SiteFunctionalityTest extends SetupTests {

    @BeforeMethod
    public void setUp() {
        homePage.open();
        homePage.checkOpened();
    }

    @Test
    public void metalsColorsPageTest() {

        //1 Login as Piter Chailovskii
        homePage.headerSection.login(PITER_CHAILOVSKII);

        //2 Open Metals and Colors page and verify that it is opened
        homePage.headerSection.headerMenu.selectHeaderOption(METALS_COLORS);
        metalsColorsPage.checkOpened();

    }
}
