package test.system.info;

import org.testng.annotations.*;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.BadgesAdministrationPage;

public class BadgesAdministrationPageTest {

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

    @AfterMethod
    void tearDown(){
        this.homePage.logOut();
    }

    @Test
    public void validateBadgesAdministratorPageTest(){
        BadgesAdministrationPage badgesAdministrationPage = this.homePage.openBadgesAdministrationPage();

    }
}
