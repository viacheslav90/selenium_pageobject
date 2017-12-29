package page;

import config.TestData;
import locators.LoginPageLocators;
import org.openqa.selenium.WebElement;
import page.home.HomePage;


public class LoginPage extends BasePage {

    /*
    * Enter Login field
     */
    public void enterLogin(String login){
        WebElement loginField = this.findElement(LoginPageLocators.LOGIN_FIELD);
        loginField.sendKeys(login);
    }

    /*
    * Enter Password field
     */
    public void enterPassword(String password){
        WebElement passwordField = this.findElement(LoginPageLocators.PASSWORD_FIELD);
        passwordField.sendKeys(password);
    }

    /*
    * Click Login button
     */
    public HomePage clickLoginButton(){
        WebElement loginButton = this.findElement(LoginPageLocators.LOGIN_BUTTON);
        loginButton.click();
        return new HomePage();
    }

    /*
    * Log in
     */
    public HomePage openHomePage(){
        this.enterLogin(TestData.EXIST_LOGIN);
        this.enterPassword(TestData.EXIST_PASSWORD);
        return this.clickLoginButton();
    }

}
