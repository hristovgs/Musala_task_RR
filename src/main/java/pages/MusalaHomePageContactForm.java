package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class MusalaHomePageContactForm {
    private static final By USERNAME_INPUT_FIELD = By.id("cf-1");
    private static final By EMAIL_ADRESS_INPUT_FIELD = By.id("cf-2");
    private static final By MOBILEN_NUMBER_INPUT_FILD = By.id("cf-3");
    private static final By SUBJECT_INPUT_FIELD = By.id("cf-4");
    private static final By MESSAGE_INPUT_FIELD = By.id("cf-5");
    private static final By SUBMIT_BUTTON = By.xpath("//input[@type='submit']");


    public static void typeInContactForm(String customerName, String emailAdress, String contactFormSubject, String contactFormMessage) {
        Browser.driver.findElement(USERNAME_INPUT_FIELD).sendKeys(customerName);
        Browser.driver.findElement(EMAIL_ADRESS_INPUT_FIELD).sendKeys(emailAdress);
        Browser.driver.findElement(SUBJECT_INPUT_FIELD).sendKeys(contactFormSubject);
        Browser.driver.findElement(MESSAGE_INPUT_FIELD).sendKeys(contactFormMessage);
        Browser.driver.findElement(SUBMIT_BUTTON).click();

    }

}
