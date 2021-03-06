package test.system.info;

import config.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.JavaSystemPropertiesPage;
import static org.testng.AssertJUnit.assertEquals;

public class JavaSystemPropertiesPageTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private JavaSystemPropertiesPage javaSystemPropertiesPage;


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
        this.javaSystemPropertiesPage.closeDriver();
    }

    @Test
    private void validateJavaSystemPropertiesPage(){
        this.javaSystemPropertiesPage = this.homePage.openJavaSystemPropertiesPage();
        String actualTitle = this.javaSystemPropertiesPage.getTitle();
        String expectedTitle = "Exadel rVision-System Info / Java System Properties";
        assertEquals(expectedTitle, actualTitle);
    }
}
