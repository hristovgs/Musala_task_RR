package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class FireFoxBaseTest {

    /**
     *
     */
    @BeforeMethod
    public void setupFireFox() {
        Browser.openFirefox();
        Browser.openMusalaHomePage();
    }

    /**
     *
     */
    @AfterMethod
    public void tearDownFireFox() {
        Browser.quitFirefox();
    }

}


