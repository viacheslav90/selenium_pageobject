package page.home.system.info;

import org.openqa.selenium.support.ui.ExpectedConditions;
import page.BasePage;

public class UserSessionPage extends BasePage{

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

}
