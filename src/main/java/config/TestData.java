package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestData {

    public static String ENVIRONMENT = "https://rvision-int.exadel.by/";
    public static WebDriver WEB_DRIVER = new FirefoxDriver();
    public static String EXIST_LOGIN = "Akomolov";
    public static String EXIST_PASSWORD = "123";


}
