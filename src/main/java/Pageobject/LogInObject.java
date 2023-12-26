package Pageobject;

import org.openqa.selenium.By;

public class LogInObject {

    protected By
            emailField = By.name("email"),
            passwordField = By.name("password"),
            logInButton = By.xpath("//*[@id=\"form\"]/div[3]/button/span");


}
