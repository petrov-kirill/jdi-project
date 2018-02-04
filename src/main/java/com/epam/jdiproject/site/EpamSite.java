package com.epam.jdiproject.site;


import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdiproject.site.pages.shared.sections.Header;
import com.epam.jdiproject.site.pages.personal.index_page.IndexPage;
import com.epam.jdiproject.site.pages.personal.metal_color_page.MetalsColorsPage;

@JSite("https://jdi-framework.github.io/tests/")
public class EpamSite extends WebSite {

    @JPage(url = "index.htm", title = "Index Page")
    public static IndexPage indexPage;

    @JPage(url = "page2.htm", title = "Metal and Colors")
    public static MetalsColorsPage metalsColorsPage;

    public static Header header;
}
