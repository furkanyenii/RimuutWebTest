package pages.InvoiceGeneratorForFreelancerPage;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InvoiceGeneratorForFreelancerPage extends BasePage {
    public InvoiceGeneratorForFreelancerPage(WebDriver driver) {
        super(driver);
    }

    private final By uploadYourOwnLogoButtonLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > label");
    private final By nameOfYourBusinessLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > h3");
    private final By companyInformationAreaLocator = By.xpath("//*[@id=\"__layout\"]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]");
    private final By clientCompanyInformationAreaLocator = By.xpath("//*[@id=\"__layout\"]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/p[1]");

    private final By bankAccountLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > div > span:nth-of-type(2)");
    private final By invoiceNoLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(2) > span:nth-of-type(2)");
    private final By emailAddressLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > p");
    private final By websiteLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > p:nth-of-type(2)");
    private final By phoneLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > p:nth-of-type(3)");
    private final By saveToPdfButtonLocator = By.cssSelector("div#__layout > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(6) > button");

    public void clickUploadButtonAndUploadFile(String uploadFilePath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadYourOwnLogoButtonLocator)).sendKeys(uploadFilePath);
        log.info("File uploaded");
    }

    public void clearAreaAndSetYourBusinessName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfYourBusinessLocator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfYourBusinessLocator))
                .sendKeys("Teknobahce");
        log.info("Area cleared and entered your business name.");
    }

    public void clearAreaAndSetCompanyInformation(String companyStreet, String companyTown, String companyCountry, String companyNumber, String vat){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyInformationAreaLocator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyInformationAreaLocator))
                .sendKeys(
                        companyStreet + "\n"
                        + companyTown + "\n"
                        + companyCountry + "\n\n"
                        + companyNumber + "\n"
                        + vat);
        log.info("Area cleared and entered company informations.");
    }

    public void clearAreaAndSetClientCompanyInformation(
            String clientCompanyStreet, String clientCompanyTown,
            String clientCompanyCountry,String clientCompanyNumber,String clientCompanyVat){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(clientCompanyInformationAreaLocator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(clientCompanyInformationAreaLocator))
                .sendKeys(
                        clientCompanyStreet + "\n"
                                + clientCompanyTown + "\n"
                                + clientCompanyCountry + "\n\n"
                                + clientCompanyNumber + "\n"
                                + clientCompanyVat);
        log.info("Area cleared and entered client company informations.");
    }

    public void setBankAccountAndInvoiceNo(String bankAccount, String invoiceNo){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(bankAccountLocator)).clear();
        driver.findElement(bankAccountLocator).sendKeys(bankAccount);

        wait.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoLocator)).clear();
        driver.findElement(invoiceNoLocator).sendKeys(invoiceNo);

        log.info("Entered bank account and invoice number.");
    }

    public void setFooterInformation(String emailAddress, String website, String phone){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressLocator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressLocator))
                .sendKeys(
                        emailAddress);
        wait.until(ExpectedConditions.visibilityOfElementLocated(websiteLocator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(websiteLocator))
                .sendKeys(
                        website);
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneLocator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneLocator))
                .sendKeys(
                        phone);
        log.info("Entered footer informations.");
    }

    public void downloadPdf() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveToPdfButtonLocator)).click();
        log.info("Downloaded pdf file.");
    }
}
