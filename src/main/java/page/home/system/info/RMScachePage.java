package page.home.system.info;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class RMScachePage {

    /*
    * RMS Chache page locators
     */
    private static final By LDAP_CACHE_INVALIDATION_TAB  = new By.ByXPath(".//td[contains(@id, 'j_idt167:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By IMAGE_CACHE_INVALIDATION_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt185:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public RMScachePage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 10);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/system/secured/cache/rms-cache.jsf"));
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Open LDAP cashe invalidation tab
     */
    public void clickLDAPCacheInvalidationTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(LDAP_CACHE_INVALIDATION_TAB));
        WebElement brokerTab = this.webDriver.findElement(LDAP_CACHE_INVALIDATION_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
    }

    /*
     * Open Image cache invalidation tab
     */
    public void clickImageCacheInvalidationTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(IMAGE_CACHE_INVALIDATION_TAB));
        WebElement eventQueuesTab = this.webDriver.findElement(IMAGE_CACHE_INVALIDATION_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(eventQueuesTab).click().perform();
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
