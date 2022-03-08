package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Browser {

    public static WebDriver driver;


    /**
     * This method opens a chrome browser in maximize mode, deletes all cookies and sets an implicit wait of 5 sec.
     */
    public static void openChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\98\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    /**
     * This method quits chrome browser
     */
    public static void quitChrome() {
        driver.quit();
    }


    /**
     * This method opens a firefox browser in maximize mode, deletes all cookies and sets an implicit wait of 5 sec.
     */
    public static void openFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     * This method quits the firefox browser
     */
    public static void quitFirefox() {
        driver.quit();
    }


    public static void openMusalaHomePage() {
        driver.get("http://musala.com/");
        driver.findElement(By.id("wt-cli-accept-all-btn")).click();
    }
}


