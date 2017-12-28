package test.system.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.home.HomePage;
import page.home.system.info.OfficePlansAdministrationPage;
import page.home.system.info.RMScachePage;

public class RMScacheTest {

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
    public void validateRMScachePage() {
        RMScachePage rmScachePage = this.homePage.openRMScachePage();
    }

}
