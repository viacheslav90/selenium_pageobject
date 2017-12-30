package test.system.info;

import config.WebDriverFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.UserSessionPage;

public class UserSessionTest extends Assert {

    private LoginPage loginPage;
    private HomePage homePage;
    private UserSessionPage userSessionPage;

    @BeforeClass
    private void setUpBeforeClass() {
        this.loginPage = new LoginPage(WebDriverFactory.getWebDriver());
    }


    @BeforeMethod
    private void setUp() {
        this.homePage = loginPage.openHomePage();
    }

    @AfterMethod void tearDown(){
        this.userSessionPage.closeDriver();
    }

    @Test
    private void validateUserSessionPageTest() {
        this.userSessionPage = this.homePage.openUserSessionPage();
        String actualTitle = this.userSessionPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / User Session";
        assertEquals(actualTitle, expectedTitle);
    }

}