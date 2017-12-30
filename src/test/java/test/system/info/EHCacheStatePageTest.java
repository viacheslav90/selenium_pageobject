package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.*;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.EHCacheStatePage;
import static org.testng.Assert.assertEquals;

public class EHCacheStatePageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private EHCacheStatePage ehCacheStatePage;

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
        this.ehCacheStatePage.closeDriver();
    }

    @Test
    private void validateEHCacheStatePage(){
        this.ehCacheStatePage = this.homePage.openEHCacheStatePage();
        String actualTitle = this.ehCacheStatePage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / EHCache state";
        assertEquals(expectedTitle, actualTitle);
    }
}
