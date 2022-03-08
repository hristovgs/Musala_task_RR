package frontend.positive.TestCase2;

import base.FireFoxBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MusalaCompanyPage;
import pages.MusalaHomePage;

public class TC2FireFox extends FireFoxBaseTest {


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


    public void validateFacebookUrlAdnPic() {
        MusalaHomePage.selectCompanyLink();

    }
}
