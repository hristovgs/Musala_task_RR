package frontend.positive.TestCase1;

import base.ChromeBaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MusalaHomePage;
import pages.MusalaHomePageContactForm;
import utils.Browser;



public class TC1Chrome extends ChromeBaseTest {

    /**
     *
     */
    @Test
    public void validateEmailField(){
        MusalaHomePage.selectContactForm();
        MusalaHomePageContactForm.typeInContactForm("Georgi Hristov", "test.test","NONE", "none");
        String emailValidationMessage = Browser.driver.findElement(By.xpath("//span[contains(@class, 'your-email')]/span")).getText();
        Assert.assertEquals(emailValidationMessage, "The e-mail address entered is invalid.", "Validation message for incorrect email adress is valid");

    }



}
