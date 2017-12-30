package page.home;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.home.system.info.*;

import static java.lang.Thread.sleep;

public class HomePage{

    /*
     * Top menu locators
     */
    private static By SYSTEM_INFO = new By.ByXPath(".//span[@class='rf-ddm-itm-lbl' and text()='System Info']");
    private static By LOG_OUT = new By.ByXPath(".//a[text()='Log out']");

    /*
     * System info menu locators
     */
    private static final By USER_SESSION = new By.ById("mainMenuForm:UserSession");
    private static final By JAVA_SYSTEM_PROPERTIES = new By.ById("mainMenuForm:JavaProp");
    private static final By SYSTEM_ENVIRONMENT = new By.ById("mainMenuForm:SystemEnv");
    private static final By TTS_SYNCHRONIZATION = new By.ById("mainMenuForm:TtsSync");
    private static final By RMS_NOTIFICATION = new By.ById("mainMenuForm:RmsNotification");
    private static final By RMS_SETTINGS = new By.ById("mainMenuForm:RmsSettings");
    private static final By RMS_CACHE = new By.ById("mainMenuForm:RmsCache");
    private static final By RMS_DB_CONSISTENCY = new By.ById("mainMenuForm:RmsDBConsistency");
    private static final By OFFICE_PLANS_ADMINISTRATION = new By.ById("mainMenuForm:OfficePlanAdmin");
    private static final By BADGES_ADMINISTRATION = new By.ById("mainMenuForm:BadgesAdmin");
    private static final By LOG_LEVELS_CONFIGURATION = new By.ById("mainMenuForm:LoggerAdmin");
    private static final By EH_CHACHE_STATE = new By.ById("mainMenuForm:EHCacheState");

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 10);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/index.jsf"));
    }

    /*
     * Get page title
     */
    public String getTitle(){
        return this.webDriver.getTitle();
    }

    /*
     * Get page URL
     */
    public String getUrl(){
        return this.webDriver.getCurrentUrl();
    }

    /*
    * Open User Session page from System Info tab
     */
    public UserSessionPage openUserSessionPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.moveToElement(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(USER_SESSION))
                .click().perform();
        return new UserSessionPage(this.webDriver);
    }

    /*
     * Open Java System Properties page from System Info tab
     */
    public JavaSystemPropertiesPage openJavaSystemPropertiesPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SYSTEM_INFO));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(JAVA_SYSTEM_PROPERTIES))
                .click().perform();
        return new JavaSystemPropertiesPage(this.webDriver);
    }

    /*
    * Open System Environment page from System Info tab
     */
    public SystemEnvironment openSystemEnvironment(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(SYSTEM_ENVIRONMENT))
                .click().perform();
        return new SystemEnvironment(this.webDriver);
    }

    /*
    * Open TTS Synchronization page from System Info tab
     */
    public TTSsynchronizationPage openTTSsynchronizationPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(TTS_SYNCHRONIZATION))
                .click().perform();
        return new TTSsynchronizationPage(this.webDriver);
    }

    /*
    * Open RMS Notification page from System Info tab
     */
    public RMSnotificationPage openRMSnotificationPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(RMS_NOTIFICATION))
                .click().perform();
        return new RMSnotificationPage(this.webDriver);
    }

    /*
    * Open RMS Settings page from System Info tab
     */
    public RMSsettingsPage openRMSsettingsPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(RMS_SETTINGS))
                .click().perform();
        return new RMSsettingsPage(this.webDriver);
    }

    /*
    * Open RMS Cache page from System Info tab
     */
    public RMScachePage openRMScachePage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(RMS_CACHE))
                .click().perform();
        return new RMScachePage(this.webDriver);
    }

    /*
    * Open RMS DB Consistency page from System Info tab
     */
    public RMSDBconsistencyPage openRMSDBconsistencyPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(RMS_DB_CONSISTENCY))
                .click().perform();
        return new RMSDBconsistencyPage(this.webDriver);
    }

    /*
    * Open Office Plans Administration page from System Info tab
     */
    public OfficePlansAdministrationPage openOfficePlansAdministrationPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(OFFICE_PLANS_ADMINISTRATION))
                .click().perform();
        return new OfficePlansAdministrationPage(this.webDriver);
    }


    /*
    * Open Badges Administration page from System Info tab
     */
    public BadgesAdministrationPage openBadgesAdministrationPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(BADGES_ADMINISTRATION))
                .click().perform();
        return new BadgesAdministrationPage(this.webDriver);
    }

    /*
    * Open Log Levels Configuration page from System Info tab
     */
    public LogLevelsConfigurationPage openLogLevelsConfigurationPage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(200)
                .moveToElement(this.webDriver.findElement(LOG_LEVELS_CONFIGURATION))
                .click().perform();
        return new LogLevelsConfigurationPage(this.webDriver);
    }

    /*
    * Open EH Cache State page from System Info tab
     */
    public EHCacheStatePage openEHCacheStatePage(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.webDriver.findElement(SYSTEM_INFO)).pause(1000)
                .moveToElement(this.webDriver.findElement(EH_CHACHE_STATE))
                .click().perform();
        return new EHCacheStatePage(this.webDriver);
    }

    /*
    * Logout from rVision
     */
    public void logOut(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((LOG_OUT)));
        this.webDriver.findElement(LOG_OUT).click();
    }

    /*
    * Close current driver
     */
    public void closeDriver(){
        this.webDriver.close();
    }

}
