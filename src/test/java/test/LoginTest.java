package test;


import config.TestData;
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
    public void setUpBeforeClass(){
        this.loginPage = new LoginPage();
    }

    @AfterMethod
    public void tearDown(){
        this.homePage.logOut();
    }

    @Test()
    public void successfulLoginTest(){
        this.loginPage.enterLogin(TestData.EXIST_LOGIN);
        this.loginPage.enterPassword(TestData.EXIST_PASSWORD);
        this.homePage = this.loginPage.clickLoginButton();
        assertEquals(homePage.getTitle(), "Exadel rVision-Home");
        String homePageActual = homePage.getUrl();
        String homePageExpected = TestData.ENVIRONMENT + "rms-web/";
        assertEquals(homePageActual, homePageExpected);
    }
}
