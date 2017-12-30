package page.home.system.info;

import config.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class TTSsynchronizationPage {

    private final WebDriver webDriver;

    /*
     * Constructor
     */
    public TTSsynchronizationPage(WebDriver webDriver){
        this.webDriver = webDriver;
        WebDriverWait webDriverWait = new WebDriverWait(this.webDriver, 10);
        webDriverWait.until(ExpectedConditions.urlToBe(TestData.ENVIRONMENT + "rms-web/pages/system/secured/tts-synchronization.jsf"));
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
     * Close current driver
     */
    public void closeDriver(){
        this.webDriver.close();
    }


}
