package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class MusalaHomePage extends BaseCommands{

    public static WebDriver driver;
    static final By CONTACT_FORM_BUTTON = By.xpath("//button[contains(@class,'contact-label')]");
static final By COMPANY_LINK_TAB = By.xpath("//ul[@id='menu-main-nav-1']/li[1]/a");


   public static void selectContactForm (){
       Browser.driver.findElement(CONTACT_FORM_BUTTON).click();
       Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       }

       public static void selectCompanyLink (){
       Browser.driver.findElement(COMPANY_LINK_TAB).click();
       Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       }
   }



