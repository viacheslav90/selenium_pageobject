package page.home;

import locators.homepage.SystemInfoMenuLocators;
import locators.homepage.TopMenuLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.BasePage;
import page.home.system.info.*;


public class HomePage extends BasePage {

    public HomePage(){
        this.webDriver = super.webDriver;
        this.webDriverWait = super.webDriverWait;
    }

    public UserSessionPage openUserSessionPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.moveToElement(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.USER_SESSION))
                .click().perform();
        return new UserSessionPage();
    }

    public JavaSystemPropertiesPage openJavaSystemPropertiesPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.JAVA_SYSTEM_PROPERTIES))
                .click().perform();
        return new JavaSystemPropertiesPage();
    }

    public SystemEnvironment openSystemEnvironment(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.SYSTEM_ENVIRONMENT))
                .click().perform();
        return new SystemEnvironment();
    }

    public TTSsynchronizationPage openTTSsynchronizationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.TTS_SYNCHRONIZATION))
                .click().perform();
        return new TTSsynchronizationPage();
    }

    public RMSnotificationPage openRMSnotificationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_NOTIFICATION))
                .click().perform();
        return new RMSnotificationPage();
    }

    public RMSsettingsPage openRMSsettingsPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_SETTINGS))
                .click().perform();
        return new RMSsettingsPage();
    }

    public RMScachePage openRMScachePage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_CACHE))
                .click().perform();
        return new RMScachePage();
    }

    public RMSDBconsistencyPage openRMSDBconsistencyPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.RMS_DB_CONSISTENCY))
                .click().perform();
        return new RMSDBconsistencyPage();
    }

    public OfficePlansAdministrationPage openOfficePlansAdministrationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.OFFICE_PLANS_ADMINISTRATION))
                .click().perform();
        return new OfficePlansAdministrationPage();
    }


    public BadgesAdministrationPage openBadgesAdministrationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.BADGES_ADMINISTRATION))
                .click().perform();
        return new BadgesAdministrationPage();
    }

    public LogLevelsConfigurationPage openLogLevelsConfigurationPage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.LOG_LEVELS_CONFIGURATION))
                .click().perform();
        return new LogLevelsConfigurationPage();
    }

    public EHCacheStatePage openEHCacheStatePage(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.SYSTEM_INFO)));
        Actions bulder = new Actions(this.webDriver);
        bulder.click(this.findElement(TopMenuLocators.SYSTEM_INFO)).pause(80)
                .moveToElement(this.findElement(SystemInfoMenuLocators.EH_CHACHE_STATE))
                .click().perform();
        return new EHCacheStatePage();
    }

    public void logOut(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(this.findElement(TopMenuLocators.LOG_OUT)));
        this.webDriver.findElement(TopMenuLocators.LOG_OUT).click();
    }

    public String getTitle(){
        return this.webDriver.getTitle();
    }

    public String getUrl(){
        return this.webDriver.getCurrentUrl();
    }
}
