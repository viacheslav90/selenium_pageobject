package page.home.system.info;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class OfficePlansAdministrationPage {

    /*
     * Office Plans Administration page locators
     */
    private static final By MANAGE_OFFICE_PLANS_TAB  = new By.ByXPath(".//td[contains(@id, 'j_idt167:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By CHECK_PLACES_CONSISTENCY_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt259:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public OfficePlansAdministrationPage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/system/secured/officePlan/office-plans-administration.jsf"));
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Open Manage office plans tab
     */
    public void clickManageOfficePlansTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(MANAGE_OFFICE_PLANS_TAB));
        WebElement brokerTab = this.webDriver.findElement(MANAGE_OFFICE_PLANS_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
    }

    /*
     * Open Check places consistency tab
     */
    public void clickCheckPlacesConsistencyTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(CHECK_PLACES_CONSISTENCY_TAB));
        WebElement eventQueuesTab = this.webDriver.findElement(CHECK_PLACES_CONSISTENCY_TAB);
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
