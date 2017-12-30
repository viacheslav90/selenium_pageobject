package page.home.system.info;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class RMSDBconsistencyPage {

    /*
    * RMS DB Consistency page locators
     */
    private static final By RUN_TESTS_TAB  = new By.ByXPath(".//td[contains(@id, 'j_idt167:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By MANAGE_TESTS_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt186:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");

    private final WebDriver webDriver;

    /*
    * Constructor
     */
    public RMSDBconsistencyPage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 10);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/system/secured/dbconsistency/rms-db-consistency.jsf"));
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Open Run tests tab
     */
    public void clickRunTestsTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(RUN_TESTS_TAB));
        WebElement brokerTab = this.webDriver.findElement(RUN_TESTS_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
    }

    /*
     * Open Manage tests tab
     */
    public void clickManageTestsTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(MANAGE_TESTS_TAB));
        WebElement eventQueuesTab = this.webDriver.findElement(MANAGE_TESTS_TAB);
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
