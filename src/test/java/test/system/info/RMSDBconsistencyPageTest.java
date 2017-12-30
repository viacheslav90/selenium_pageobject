package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.RMSDBconsistencyPage;
import static org.testng.AssertJUnit.assertEquals;

public class RMSDBconsistencyPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private RMSDBconsistencyPage rmsdBconsistencyPage;

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
        this.rmsdBconsistencyPage.closeDriver();
    }

    @Test
    private void validateRMSDBconsistencyPage() {
        this.rmsdBconsistencyPage = this.homePage.openRMSDBconsistencyPage();
        String actualTitle = this.rmsdBconsistencyPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / RMS DB consistency";
        assertEquals(expectedTitle, actualTitle);
        this.rmsdBconsistencyPage.clickManageTestsTab();
        this.rmsdBconsistencyPage.clickRunTestsTab();
    }
}
