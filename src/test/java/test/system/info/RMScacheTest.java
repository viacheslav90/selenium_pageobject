package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.RMScachePage;
import static org.testng.Assert.assertEquals;

public class RMScacheTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private  RMScachePage rmScachePage;

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
        this.rmScachePage.closeDriver();
    }

    @Test
    private void validateRMScachePage() {
        this.rmScachePage = this.homePage.openRMScachePage();
        String actualTitle = this.rmScachePage.getTitle();
        String expectedTitle = "Exadel rVision-Home";
        assertEquals(expectedTitle, actualTitle);
        this.rmScachePage.clickImageCacheInvalidationTab();
        this.rmScachePage.clickLDAPCacheInvalidationTab();
    }

}
