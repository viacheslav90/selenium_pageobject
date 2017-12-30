package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.RMSsettingsPage;
import static org.testng.AssertJUnit.assertEquals;

public class RMSsettingsPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private RMSsettingsPage rmSsettingsPage;

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
        this.rmSsettingsPage.closeDriver();
    }

    @Test
    private void validateRMSsettingsPage() {
        this.rmSsettingsPage = this.homePage.openRMSsettingsPage();
        String actualTitle = this.rmSsettingsPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / RMS settings";
        assertEquals(expectedTitle, actualTitle);
        this.rmSsettingsPage.clickUserSettingsTab();
        this.rmSsettingsPage.clickVerificationTab();
        this.rmSsettingsPage.clickApplicationSettingsTab();
    }

}
