package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.LogLevelsConfigurationPage;
import static org.testng.Assert.assertEquals;

public class LogLevelsConfigurationPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private LogLevelsConfigurationPage logLevelsConfigurationPage;

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
        this.logLevelsConfigurationPage.closeDriver();
    }

    @Test
    private void validateLogLevelsConfiguration(){
        this.logLevelsConfigurationPage = this.homePage.openLogLevelsConfigurationPage();
        String actualTitle = this.logLevelsConfigurationPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / Log levels configuration";
        assertEquals(expectedTitle, actualTitle);

    }
}
