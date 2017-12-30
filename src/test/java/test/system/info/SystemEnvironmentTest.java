package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.SystemEnvironment;
import static org.testng.Assert.assertEquals;

public class SystemEnvironmentTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private SystemEnvironment systemEnvironment;

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
        this.systemEnvironment.closeDriver();
    }

    @Test
    private void validateSystemEnvironment() {
        this.systemEnvironment = homePage.openSystemEnvironment();
        String actualTitle = this.systemEnvironment.getTitle();
        String expectedTitle = "Exadel rVision-System Info / System Environment";
        assertEquals(expectedTitle, actualTitle);
    }
}
