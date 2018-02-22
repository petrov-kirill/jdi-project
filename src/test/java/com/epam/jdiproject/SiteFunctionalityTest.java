package com.epam.jdiproject;

import com.epam.jdiproject.entities.MetalsColorsData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

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

    @AfterMethod
    public void tearDown() {
        metalsColorsPage.headerSection.logout();
    }

    @DataProvider
    public Object[] getData() throws FileNotFoundException {
        return new DataParser().data;
    }

    @Test(dataProvider = "getData")
    public void metalsColorsPageTest(MetalsColorsData jsonData) {

        //1 Login as Piter Chailovskii
        homePage.headerSection.login(PITER_CHAILOVSKII);

        //2 Open Metals and Colors page and verify that it is opened
        homePage.headerSection.headerMenu.selectHeaderOption(METALS_COLORS);
        metalsColorsPage.checkOpened();

        //3 Fill in Metals Colors form with data
        metalsColorsPage.metalsColorsForm.fillMetalsColorsForm(jsonData);
    }
}
