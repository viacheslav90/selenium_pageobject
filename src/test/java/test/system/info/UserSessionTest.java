package test.system.info;

import org.testng.annotations.*;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.JavaSystemPropertiesPage;
import page.home.system.info.UserSessionPage;

import static java.lang.Thread.sleep;


public class UserSessionTest {

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setUpBeforeClass(){
        this.loginPage = new LoginPage();
    }

    @BeforeMethod
    public void setUp(){
        this.homePage = loginPage.openHomePage();
    }

    @AfterMethod void tearDown(){
        this.homePage.logOut();
    }

    @Test
    public void validateUserSessionPageTest(){
        UserSessionPage userSessionPage = this.homePage.openUserSessionPage();

    }
}
