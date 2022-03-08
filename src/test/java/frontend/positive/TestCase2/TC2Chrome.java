package frontend.positive.TestCase2;

import java.util.ArrayList;

import base.ChromeBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MusalaCompanyPage;
import pages.MusalaFacebookPage;
import pages.MusalaHomePage;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class TC2Chrome extends ChromeBaseTest {


    @Test
    /**
     * Method which verifies that the correct URL loads
     */
    public void validateCompanyPageURL() {
        MusalaHomePage.selectCompanyLink();
        Assert.assertEquals(MusalaCompanyPage.companyPageUrlverification(), MusalaCompanyPage.getCompanyPageUrl(),
                "Company page URL is correct");
    }

    @Test
    /**
     * Test method which validates if an element is displayed
     */
    public void validateElementIsDisplayed() {
        MusalaHomePage.selectCompanyLink();
        boolean isDisplayed = MusalaCompanyPage.verifyElementIsDisplayed(MusalaCompanyPage.getLeadershipSection());
        if (isDisplayed) {
            System.out.println("The element you are searching is displayed");
        } else {
            System.out.println("The element you are searching is NOT displayed");
        }
    }

    /**
     *
     */
    @Test
    public void validateFacebookUrl() {
        MusalaHomePage.selectCompanyLink();
        String winHandleBefore = Browser.driver.getWindowHandle();
        MusalaCompanyPage.openFacebooklink();
        ArrayList<String> newTab = new ArrayList<String>(Browser.driver.getWindowHandles());
        newTab.remove(winHandleBefore);
        Browser.driver.switchTo().window(newTab.get(0));
        Assert.assertEquals(MusalaFacebookPage.musalaFacebookPageUrlActual(), MusalaFacebookPage.getFacebookMusalUrlExpected());

    }
}


