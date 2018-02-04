package com.epam.jdiproject;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.jdiproject.site.EpamSite;
import org.testng.annotations.BeforeSuite;

public class InitTests extends TestNGBase{

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(EpamSite.class);
    }
}
