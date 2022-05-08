package base;

import log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver driver;
    public static Log log = new Log();
    private final By acceptCookiesButtonLocator = By.className("cookieControl__BarButtons");

    public void acceptCookie(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(acceptCookiesButtonLocator)).click();
        log.info("Allowed cookies");
    }
}
