package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.TTSsynchronizationPage;
import static org.testng.AssertJUnit.assertEquals;

public class TTSsynchronizationPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private TTSsynchronizationPage ttSsynchronizationPage;

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
        this.homePage.logOut();
        this.ttSsynchronizationPage.closeDriver();
    }

    @Test
    private void validateTTSsynchronizationPage() {
        this.ttSsynchronizationPage = homePage.openTTSsynchronizationPage();
        String actualTitle = this.ttSsynchronizationPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / TTS Synchronization";
        assertEquals(expectedTitle, actualTitle);
    }

}
