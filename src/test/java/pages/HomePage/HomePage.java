package pages.HomePage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private int brokenImageCount;

    public void findBrokenImage(){
        try {
            brokenImageCount = 0;
            List<WebElement> imageList = driver.findElements(By.tagName("img"));
            log.info("Number of images checked on the page : " + imageList.size());
            for (WebElement imgElement : imageList) {
                if (imgElement != null) {
                    verifyImageActive(imgElement);
                }
            }
            log.info("Number of broken images on the page : "	+ brokenImageCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void verifyImageActive(WebElement imgElement) {
        try {
            if (imgElement.getAttribute("naturalWidth").equals("0")){
                log.info(imgElement.getAttribute("outerHTML") + " is broken.");
                brokenImageCount++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }





}
