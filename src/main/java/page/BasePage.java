package page;

import config.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage(){
        this.webDriver = TestData.WEB_DRIVER;
        this.webDriver.manage().window().maximize();
        this.webDriver.get(TestData.ENVIRONMENT);
        this.webDriverWait = new WebDriverWait(this.webDriver, 10);

    }

    public WebElement findElement(By locator){
        return this.webDriver.findElement(locator);
    }

    public void closeBrowser(){
        this.webDriver.close();
    }
}

