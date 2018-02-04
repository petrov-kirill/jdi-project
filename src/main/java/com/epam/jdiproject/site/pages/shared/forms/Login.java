package com.epam.jdiproject.site.pages.shared.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdiproject.entities.User;
import org.openqa.selenium.support.FindBy;

public class Login extends Form<User> {
    @FindBy(css = "#Login")
    private TextField login;

    @FindBy(css = "#Password")
    private TextField password;

    @FindBy(css = "div ~ [type='submit']")
    private Button loginButton;
}
