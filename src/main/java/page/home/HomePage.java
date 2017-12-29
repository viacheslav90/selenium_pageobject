package page.home;

import locators.homepage.SystemInfoMenuLocators;
import locators.homepage.TopMenuLocators;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.BasePage;
import page.home.system.info.*;


public class HomePage extends BasePage {

    /*
    * Open User Session page from System Info tab
     */
    public UserSessionPage openUserSessionPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.moveToElement(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.USER_SESSION))
                .click().perform();
        return new UserSessionPage();
    }

    /*
     * Open Java System Properties page from System Info tab
     */
    public JavaSystemPropertiesPage openJavaSystemPropertiesPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.JAVA_SYSTEM_PROPERTIES))
                .click().perform();
        return new JavaSystemPropertiesPage();
    }

    /*
    * Open System Environment page from System Info tab
     */
    public SystemEnvironment openSystemEnvironment(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.SYSTEM_ENVIRONMENT))
                .click().perform();
        return new SystemEnvironment();
    }

    /*
    * Open TTS Synchronization page from System Info tab
     */
    public TTSsynchronizationPage openTTSsynchronizationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.TTS_SYNCHRONIZATION))
                .click().perform();
        return new TTSsynchronizationPage();
    }

    /*
    * Open RMS Notification page from System Info tab
     */
    public RMSnotificationPage openRMSnotificationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_NOTIFICATION))
                .click().perform();
        return new RMSnotificationPage();
    }

    /*
    * Open RMS Settings page from System Info tab
     */
    public RMSsettingsPage openRMSsettingsPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_SETTINGS))
                .click().perform();
        return new RMSsettingsPage();
    }

    /*
    * Open RMS Cache page from System Info tab
     */
    public RMScachePage openRMScachePage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_CACHE))
                .click().perform();
        return new RMScachePage();
    }

    /*
    * Open RMS DB Consistency page from System Info tab
     */
    public RMSDBconsistencyPage openRMSDBconsistencyPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_DB_CONSISTENCY))
                .click().perform();
        return new RMSDBconsistencyPage();
    }

    /*
    * Open Office Plans Administration page from System Info tab
     */
    public OfficePlansAdministrationPage openOfficePlansAdministrationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.OFFICE_PLANS_ADMINISTRATION))
                .click().perform();
        return new OfficePlansAdministrationPage();
    }


    /*
    * Open Badges Administration page from System Info tab
     */
    public BadgesAdministrationPage openBadgesAdministrationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.BADGES_ADMINISTRATION))
                .click().perform();
        return new BadgesAdministrationPage();
    }

    /*
    * Open Log Levels Configuration page from System Info tab
     */
    public LogLevelsConfigurationPage openLogLevelsConfigurationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.LOG_LEVELS_CONFIGURATION))
                .click().perform();
        return new LogLevelsConfigurationPage();
    }

    /*
    * Open EH Cache State page from System Info tab
     */
    public EHCacheStatePage openEHCacheStatePage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.EH_CHACHE_STATE))
                .click().perform();
        return new EHCacheStatePage();
    }

    /*
    * Logout from rVision
     */
    public void logOut(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.LOG_OUT)));
        this.webDriver.findElement(TopMenuLocators.LOG_OUT).click();
    }

}
