package pages.HourlyRatePage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HourlyRatePage extends BasePage
{
    public HourlyRatePage(WebDriver driver) {
        super(driver);
    }

    private final By currencyHeadingLocator = By.id("currency");
    private final By expensesHeadingLocator = By.id("headingExpenses");
    private final By othersHeadingLocator = By.id("headingOthers");

    // Expenses Field locators
    private final By monthlyRentOrRoomCostLocator = By.id("expense_0");
    private final By cellPhoneBillLocator = By.id("expense_1");
    private final By utilitiesCostLocator = By.id("expense_2");
    private final By foodDrinkCostLocator = By.id("expense_3");
    private final By softwareServiceCostLocator = By.id("expense_4");
    private final By travelExpensesLocator = By.id("expense_5");
    private final By financialPaymentsLocator = By.id("expense_6");
    private final By creditCardPaymentLocator = By.id("expense_7");
    private final By insuranceCostLocator = By.id("expense_8");
    private final By accountingFeesLocator = By.id("expense_9");
    private final By professionalMembershipCostLocator = By.id("expense_10");
    private final By leiusureCostsLocator = By.id("expense_11");
    private final By careerSkillBasedCostLocator = By.id("expense_12");

    // Others field locators
    private final By taxationCostLocator = By.id("taxation");
    private final By yourProfitMarginLocator = By.id("profit");
    private final By workHoursWeeklyLocator = By.id("work_hours_weekly");
    private final By vacationDaysMonthly = By.id("vacation_days_monthly");
    private final By sickDaysMonthlyLocator = By.id("sick_days_monthly");
    private final By workTravelsMonthlyLocator = By.id("work_travels_monthly");


    public void selectCurrency(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyHeadingLocator));
        Select select = new Select(driver.findElement(currencyHeadingLocator));
        select.selectByValue("TRY");
    }

    public void clickExpensesField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(expensesHeadingLocator)).click();
    }

    public void enterMonthlyRentOrRoomCost(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(monthlyRentOrRoomCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterCellphoneBill(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cellPhoneBillLocator))
                .sendKeys(cost.toString());
    }

    public void enterUtilitiesCost(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(utilitiesCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterFoodDrinkCost(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(foodDrinkCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterSoftwareServiceCosts(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(softwareServiceCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterTravelExpenses(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(travelExpensesLocator))
                .sendKeys(cost.toString());
    }

    public void enterFinancialPayments(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(financialPaymentsLocator))
                .sendKeys(cost.toString());
    }

    public void enterCreditCarPayment(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(creditCardPaymentLocator))
                .sendKeys(cost.toString());
    }

    public void enterInsuranceCost(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(insuranceCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterAccountingFees(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountingFeesLocator))
                .sendKeys(cost.toString());
    }

    public void enterProfessionalMembershipCosts(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(professionalMembershipCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterLeisureCosts(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(leiusureCostsLocator))
                .sendKeys(cost.toString());
    }

    public void enterCareerSkillBasedCosts(Double cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(careerSkillBasedCostLocator))
                .sendKeys(cost.toString());
    }

    public void clickOthersField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(othersHeadingLocator)).click();
    }

    public void enterTaxationCosts(Integer cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(taxationCostLocator))
                .sendKeys(cost.toString());
    }

    public void enterYourProfitMargin(Integer cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(yourProfitMarginLocator))
                .sendKeys(cost.toString());
    }

    public void enterWorkHoursWeekly(Integer cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(workHoursWeeklyLocator))
                .sendKeys(cost.toString());
    }

    public void enterVacationDayMonthly(Integer cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(vacationDaysMonthly))
                .sendKeys(cost.toString());
    }

    public void enterSickDaysMonthly(Integer cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(sickDaysMonthlyLocator))
                .sendKeys(cost.toString());
    }

    public void enterWorkTravelsMonthly(Integer cost){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(workTravelsMonthlyLocator))
                .sendKeys(cost.toString());
    }

    public String getYourHourlyRate(){
        WebElement result = driver.findElement(By.id("result"));
        return result.getText();
    }



}
