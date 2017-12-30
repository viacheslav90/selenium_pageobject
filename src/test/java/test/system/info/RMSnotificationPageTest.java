package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.RMSnotificationPage;
import static org.testng.AssertJUnit.assertEquals;


public class RMSnotificationPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private RMSnotificationPage rmSnotificationPage;

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
        this.rmSnotificationPage.closeDriver();
    }


    @Test
    private void validateRMSnotificationPage() {
        this.rmSnotificationPage = homePage.openRMSnotificationPage();
        String actualTitle = this.rmSnotificationPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / RMS notification";
        assertEquals(expectedTitle, actualTitle);
        this.rmSnotificationPage.clickEventQueuesTab();
        this.rmSnotificationPage.clickRecipientsTab();
        this.rmSnotificationPage.clickEmailDataTab();
        this.rmSnotificationPage.clickBrokerTab();
        this.rmSnotificationPage.clickEmailQueuesTab();
    }
}
