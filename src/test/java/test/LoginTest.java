package test;


import config.TestData;
import config.WebDriverFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;

public class LoginTest extends Assert {

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    private void setUpBeforeClass(){
        this.loginPage = new LoginPage(WebDriverFactory.getWebDriver());
    }

    @AfterMethod
    private void tearDown(){
        this.homePage.logOut();
        this.loginPage.closeDriver();
    }

    @Test()
    private void successfulLoginTest(){
        this.loginPage.enterLogin(TestData.EXIST_USERNAME);
        this.loginPage.enterPassword(TestData.EXIST_PASSWORD);
        this.homePage = this.loginPage.clickLoginButton();
        String actualTitle = this.homePage.getTitle();
        String expectedTitle = "Exadel rVision-Home";
        assertEquals(expectedTitle, actualTitle);
    }

}
