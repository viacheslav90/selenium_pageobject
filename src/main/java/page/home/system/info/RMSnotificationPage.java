package page.home.system.info;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class RMSnotificationPage {

    private static final By BROKER_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt167:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By EVENT_QUEUES_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt315:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By EMAIL_QUEUES_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt315:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By USER_MESSAGES_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt427:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By RECIPIENTS_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt457:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");
    private static final By EMAIL_DATA_TAB = new By.ByXPath(".//td[contains(@id, 'j_idt547:header:') and @class='rf-tab-hdr rf-tab-hdr-inact rf-tab-hdr-top']");

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public RMSnotificationPage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/system/secured/notification/rms-notification.jsf"));
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
     * Open Broker tab
     */
    public void clickBrokerTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(BROKER_TAB));
        WebElement brokerTab = this.webDriver.findElement(BROKER_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(brokerTab).click().perform();
    }

    /*
     * Open Event queues tab
     */
    public void clickEventQueuesTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(EVENT_QUEUES_TAB));
        WebElement eventQueuesTab = this.webDriver.findElement(EVENT_QUEUES_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(eventQueuesTab).click().perform();
    }

    /*
     * Open Email queues tab
     */
    public void clickEmailQueuesTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(EMAIL_QUEUES_TAB));
        WebElement emailQueuesTab = this.webDriver.findElement(EMAIL_QUEUES_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(emailQueuesTab).click().perform();
    }

    /*
     * Open User messages tab
     */
    public void clickUserMessagesTab(){
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(USER_MESSAGES_TAB));
        WebElement emailQueuesTab = this.webDriver.findElement(USER_MESSAGES_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(emailQueuesTab).click().perform();
    }

    /*
     * Open Recipients tab
     */
    public void clickRecipientsTab() {
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(RECIPIENTS_TAB));
        WebElement emailQueuesTab = this.webDriver.findElement(RECIPIENTS_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(emailQueuesTab).click().perform();
    }

    /*
     * Open Email data tab
     */
    public void clickEmailDataTab() {
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(EMAIL_DATA_TAB));
        WebElement emailQueuesTab = this.webDriver.findElement(EMAIL_DATA_TAB);
        Actions builder = new Actions(this.webDriver);
        builder.moveToElement(emailQueuesTab).click().perform();
    }

    /*
     * Close current driver
     */
    public void closeDriver(){
        this.webDriver.close();
    }

}
