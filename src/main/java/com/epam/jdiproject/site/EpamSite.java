package com.epam.jdiproject.site;


import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdiproject.enums.HeaderMenu;
import com.epam.jdiproject.site.pages.shared.sections.Header;
import com.epam.jdiproject.site.pages.personal.index_page.IndexPage;
import com.epam.jdiproject.site.pages.personal.metal_color_page.MetalsColorsPage;
import org.openqa.selenium.support.FindBy;

//@JSite("https://jdi-framework.github.io/tests/")
@JSite("https://epam.github.io/JDI")
public class EpamSite extends WebSite {

    @FindBy(css = ".m-18")
    public static Menu<HeaderMenu> headerMenu;

    @JPage(url = "index.htm", title = "Index Page")
    public static IndexPage indexPage;

    @JPage(url = "page2.htm", title = "Metal and Colors")
    public static MetalsColorsPage metalsColorsPage;
}
