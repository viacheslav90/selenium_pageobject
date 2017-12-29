package page.home.system.info;

import page.BasePage;

public class SystemEnvironment extends BasePage {

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
