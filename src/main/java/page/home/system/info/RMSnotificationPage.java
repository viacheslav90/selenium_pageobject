package page.home.system.info;

import locators.homepage.system.info.RMSNotificationLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.BasePage;

public class RMSnotificationPage extends BasePage {

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
        return this.webDriver.getTitle();
    }

    public void clickBrokerTab(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(RMSNotificationLocators.BROKER_TAB));
        WebElement brokerTab = this.findElement(RMSNotificationLocators.BROKER_TAB);
        brokerTab.click();
    }

    public void clickEventQueuesTab(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(RMSNotificationLocators.EVENT_QUEUES_TAB));
        WebElement eventQueuesTab = this.findElement(RMSNotificationLocators.EVENT_QUEUES_TAB);
        eventQueuesTab.click();
    }

    public void clickEmailQueuesTab(){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(RMSNotificationLocators.EMAIL_QUEUES_TAB));
        WebElement emailQueuesTab = this.findElement(RMSNotificationLocators.EMAIL_QUEUES_TAB);
        emailQueuesTab.click();
    }

}
