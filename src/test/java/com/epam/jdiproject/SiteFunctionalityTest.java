package com.epam.jdiproject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdiproject.EpamSite.homePage;
import static com.epam.jdiproject.entities.User.PITER_CHAILOVSKII;

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

    }
}
