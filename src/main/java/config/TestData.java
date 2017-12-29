package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestData {

    // Working environment
    public static String ENVIRONMENT = "https://rvision-int.exadel.by/";

    //Web driver
    public static WebDriver WEB_DRIVER = new FirefoxDriver();

    // Username/password of existing user
    public static String EXIST_USERNAME = "Akomolov";
    public static String EXIST_PASSWORD = "123";

}
