package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.OfficePlansAdministrationPage;
import static org.testng.Assert.assertEquals;

public class OfficePlansAdministrationTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private OfficePlansAdministrationPage officePlansAdministrationPage;

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
        this.officePlansAdministrationPage.closeDriver();
    }

    @Test
    private void validateOfficePlansAdministration(){
        this.officePlansAdministrationPage = this.homePage.openOfficePlansAdministrationPage();
        String actualTitle = this.officePlansAdministrationPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / Office plans administration";
        assertEquals(expectedTitle, actualTitle);
        this.officePlansAdministrationPage.clickCheckPlacesConsistencyTab();
        this.officePlansAdministrationPage.clickManageOfficePlansTab();
    }
}
