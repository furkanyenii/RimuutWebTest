package tests;

import base.BaseTest;
import log.Log;
import org.testng.annotations.Test;
import pages.HomePage.HomePage;
import pages.HomePage.HomePageConstants;

public class HomePageTest extends BaseTest {

    @Test
    public void brokenImageTest(){
        driver.get(HomePageConstants.URL);
        HomePage homePage = new HomePage(driver);
        log.info("Broken image test started.");
        homePage.acceptCookie();
        homePage.findBrokenImage();
        log.info("Broken ımage test passed \n");
    }
}
