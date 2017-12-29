package test.system.info;

import config.TestData;
import org.testng.Assert;
import org.testng.annotations.*;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.UserSessionPage;

import static java.lang.Thread.sleep;


public class UserSessionTest extends Assert {

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    private void setUpBeforeClass() {
        this.loginPage = new LoginPage();
    }


    @BeforeMethod
    private void setUp() {
        this.homePage = loginPage.openHomePage();
    }

    //@AfterMethod void tearDown(){
    //    this.homePage.logOut();
    //}

    @Test
    private void validateUserSessionPageTest() {
        UserSessionPage userSessionPage = this.homePage.openUserSessionPage();
        String actualTitle = userSessionPage.getTitle();
        String expectedTitle = "System Info / User Session";
        assertEquals(actualTitle, expectedTitle);
    }

}