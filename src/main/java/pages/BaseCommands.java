package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class BaseCommands {


    /**
     * javadoc
     *
     * @param locator
     * @param whatToType
     */
    protected static void type(By locator, String whatToType) {
        Browser.driver.findElement(locator).sendKeys(whatToType);
    }

    /**
     * @param locator
     */
    public static void findWebelement(By locator) {
        Browser.driver.findElement(locator);

    }

    /**
     *
     * @param locator
     */
    public static void click(By locator) {
        Browser.driver.findElement(locator).click();
    }
}




