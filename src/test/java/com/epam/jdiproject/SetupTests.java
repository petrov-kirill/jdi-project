package com.epam.jdiproject;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.testng.annotations.BeforeSuite;

public class SetupTests extends TestNGBase{

    @BeforeSuite
    public static void init() {
        WebSite.init(EpamSite.class);
    }
}
