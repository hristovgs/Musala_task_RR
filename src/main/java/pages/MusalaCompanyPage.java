package pages;


import org.openqa.selenium.By;
import utils.Browser;

public class MusalaCompanyPage {


    static final String COMPANY_PAGE_URL = "http://www.musala.com/company/";



    static final By LEADERSHIP_SECTION = By.xpath("//div[@class='cm-content']");
    static final By FACEBOOK_LINK_BUTTON = By.xpath("//span[contains(@class, 'musala-icon-facebook')]");

    /**
     * @return Get method, which returns Company Page URL
     */
    public static String getCompanyPageUrl() {
        return COMPANY_PAGE_URL;
    }

    public static By getLeadershipSection() {
        return LEADERSHIP_SECTION;
    }
    /**
     *
     */
    public static String companyPageUrlverification() {
        String currentCompanyPageURL = Browser.driver.getCurrentUrl();
        return currentCompanyPageURL;
    }

    /**
     *
     */
    public static void openFacebooklink() {
        Browser.driver.findElement(FACEBOOK_LINK_BUTTON).click();
    }

    /**
     *
     * @param whatElementToSearch
     * @return
     */
    public static boolean verifyElementIsDisplayed(By whatElementToSearch){
    boolean isElementDisplaed = Browser.driver.findElement(whatElementToSearch).isDisplayed();
      return isElementDisplaed;
    }
}
