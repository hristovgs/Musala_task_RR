package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;


public class ChromeBaseTest {

    /**
     *
     */
    @BeforeMethod
    public void setupChrome() {
        Browser.openChrome();
        Browser.openMusalaHomePage();
    }

    /**
     *
     */
//    @AfterMethod
//    public void tearDownChrome() {
//        Browser.quitChrome();
//    }

}



