package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class MusalaFacebookPage {



    static final String FACEBOOK_MUSAL_URL = "https://www.facebook.com/MusalaSoft?fref=ts";

    /**
     *
     * @return
     */
    public static String getFacebookMusalUrlExpected() {
        return FACEBOOK_MUSAL_URL;
    }

    /**
     *
     * @return
     */
    public static String musalaFacebookPageUrlActual(){
        String musalaFacebookPageUrl = Browser.driver.getCurrentUrl();
        return musalaFacebookPageUrl;
    }
}
