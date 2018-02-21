package com.epam.jdiproject.site.pages.shared.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.entities.User;
import com.epam.jdiproject.enums.HeaderMenu;
import com.epam.jdiproject.site.pages.shared.forms.LoginForm;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static com.epam.jdiproject.enums.HeaderMenu.METALSANDCOLORS;
import static com.epam.jdiproject.enums.Users.PITER_CHAILOVSKII;
import static com.epam.jdiproject.site.EpamSite.headerMenu;
import static com.epam.jdiproject.site.EpamSite.metalsColorsPage;
import static org.testng.Assert.assertEquals;

public class Header extends Section {

    @FindBy(css = ".profile-photo")
    private Button userName;

    @FindBy(css = "li[class*='drop'] ~ li")
    private Button metalsAndColorsButton;

    @FindBy(css = ".profile-photo")
    private Button profilePhoto;

    private LoginForm loginForm;


    @Step
    public void performLogin(User user) {
        profilePhoto.click();
        loginForm.loginAs(user);
    }

    @Step
    public void openMetalsColorsPage() {
        headerMenu.select(METALSANDCOLORS);
//        metalsAndColorsButton.click();
//        metalsColorsPage.checkOpened();
    }
}
