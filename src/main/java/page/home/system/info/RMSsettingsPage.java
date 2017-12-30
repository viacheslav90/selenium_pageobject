package page.home.system.info;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class RMSsettingsPage {

    /*
    *  RMS Settings page locators
     */
    private static final By APPLICATION_SETTINGS = new By.ByXPath(".//td[contains(@id, 'j_idt167:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By USER_SETTINGS = new By.ByXPath(".//td[contains(@id, 'j_idt187:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By VERIFICATION = new By.ByXPath(".//td[contains(@id, 'j_idt221:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public RMSsettingsPage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 10);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/system/secured/settings/rms-settings.jsf"));
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Open Application settings tab
     */
    public void clickApplicationSettingsTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(APPLICATION_SETTINGS));
        WebElement brokerTab = this.webDriver.findElement(APPLICATION_SETTINGS);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
    }

    /*
     * Open User settings tab
     */
    public void clickUserSettingsTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(USER_SETTINGS));
        WebElement brokerTab = this.webDriver.findElement(USER_SETTINGS);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
    }

    /*
     * Open Verification tab
     */
    public void clickVerificationTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(VERIFICATION));
        WebElement brokerTab = this.webDriver.findElement(VERIFICATION);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
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
     * Close current driver
     */
    public void closeDriver(){
        this.webDriver.close();
    }
}
