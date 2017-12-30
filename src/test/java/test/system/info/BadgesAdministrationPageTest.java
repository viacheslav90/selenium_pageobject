package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.*;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.BadgesAdministrationPage;
import static org.testng.Assert.assertEquals;

public class BadgesAdministrationPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private BadgesAdministrationPage badgesAdministrationPage;


    @BeforeClass
    private void setUpBeforeClass(){
        this.loginPage = new LoginPage(WebDriverFactory.getWebDriver());
    }

    @BeforeMethod
    private void setUp(){
        this.homePage = loginPage.openHomePage();
    }

    @AfterMethod
    private void tearDown(){
        this.badgesAdministrationPage.closeDriver();
    }

    @Test
    private void validateBadgesAdministratorPage(){
        this.badgesAdministrationPage = this.homePage.openBadgesAdministrationPage();
        String actualTitle = this.badgesAdministrationPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / Badges administration";
        assertEquals(expectedTitle, actualTitle);
    }
}
