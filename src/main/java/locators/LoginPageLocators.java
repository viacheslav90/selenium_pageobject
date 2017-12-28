package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public static By LOGIN_FIELD = new By.ByXPath(".//input[@id='loginForm:login']");
    public static By PASSWORD_FIELD = new By.ByXPath(".//input[@id='loginForm:password']");
    public static By LOGIN_BUTTON = new By.ByXPath(".//input[@type='submit' and @value='Login']");

}

