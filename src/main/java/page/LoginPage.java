package page;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.home.HomePage;


public class LoginPage{

    /*
    * Login page locators
     */
    private static final By LOGIN_FIELD = new By.ByXPath(".//input[@id='loginForm:login']");
    private static final By PASSWORD_FIELD = new By.ByXPath(".//input[@id='loginForm:password']");
    private static final By LOGIN_BUTTON = new By.ByXPath(".//input[@type='submit' and @value='Login']");

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriver.get(TestData.ENVIRONMENT);
        this.webDriver.manage().window().maximize();
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 10);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/login/login.jsf"));
    }

    /*
     * Get page title
     */
    public String getTitle(){
        return this.webDriver.getTitle();
    }

    /*
     * Get page URL
     */
    public String getUrl(){
        return this.webDriver.getCurrentUrl();
    }

    /*
    * Enter Login field
     */
    public void enterLogin(String login){
        WebElement loginField = this.webDriver.findElement(LOGIN_FIELD);
        loginField.sendKeys(login);
    }

    /*
    * Enter Password field
     */
    public void enterPassword(String password){
        WebElement passwordField = this.webDriver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys(password);
    }

    /*
    * Click Login button
     */
    public HomePage clickLoginButton(){
        WebElement loginButton = this.webDriver.findElement(LOGIN_BUTTON);
        loginButton.click();
        return new HomePage(this.webDriver);

    }

    /*
    * Open Home page
     */
    public HomePage openHomePage(){
        this.enterLogin(TestData.EXIST_USERNAME);
        this.enterPassword(TestData.EXIST_PASSWORD);
        return clickLoginButton();
    }

    /*
     * Close current driver
     */
    public void closeDriver(){
        this.webDriver.close();
    }

}
