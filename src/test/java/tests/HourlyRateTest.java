package tests;

import base.BaseTest;
import log.Log;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.HourlyRatePage.HourlyRatePageConstants;
import pages.HourlyRatePage.HourlyRatePage;

public class HourlyRateTest extends BaseTest {

    @Test
    public void hourlyRateCalculatorTest() {
        driver.get(HourlyRatePageConstants.URL);
        HourlyRatePage hourlyRatePage = new HourlyRatePage(driver);
        log.info("Hourly rate calculator test started.");
        hourlyRatePage.acceptCookie();
        hourlyRatePage.selectCurrency();

        hourlyRatePage.clickExpensesField();
        hourlyRatePage.enterMonthlyRentOrRoomCost(HourlyRatePageConstants.Monthly_Rent_Or_Room_Cost);
        hourlyRatePage.enterCellphoneBill(HourlyRatePageConstants.Cell_Phone_Bill);
        hourlyRatePage.enterUtilitiesCost(HourlyRatePageConstants.Utilities_Cost);
        hourlyRatePage.enterFoodDrinkCost(HourlyRatePageConstants.Food_Drinks_Cost);
        hourlyRatePage.enterSoftwareServiceCosts(HourlyRatePageConstants.Software_Service_Cost);
        hourlyRatePage.enterTravelExpenses(HourlyRatePageConstants.Travel_Expenses);
        hourlyRatePage.enterFinancialPayments(HourlyRatePageConstants.Financial_Payments);
        hourlyRatePage.enterCreditCarPayment(HourlyRatePageConstants.Credit_Card_Payment);
        hourlyRatePage.enterInsuranceCost(HourlyRatePageConstants.Insurance_Cost);
        hourlyRatePage.enterAccountingFees(HourlyRatePageConstants.Accounting_Fees);
        hourlyRatePage.enterProfessionalMembershipCosts(HourlyRatePageConstants.Professional_Membership_Costs);
        hourlyRatePage.enterLeisureCosts(HourlyRatePageConstants.Leisure_Costs);
        hourlyRatePage.enterCareerSkillBasedCosts(HourlyRatePageConstants.Career_Skill_Based_Costs);

        hourlyRatePage.clickOthersField();
        hourlyRatePage.enterTaxationCosts(HourlyRatePageConstants.Taxation_Costs);
        hourlyRatePage.enterYourProfitMargin(HourlyRatePageConstants.Your_Profit_Margin);
        hourlyRatePage.enterWorkHoursWeekly(HourlyRatePageConstants.Work_Hours_Weekly);
        hourlyRatePage.enterVacationDayMonthly(HourlyRatePageConstants.Vacation_Day_Monthly);
        hourlyRatePage.enterSickDaysMonthly(HourlyRatePageConstants.Sick_Days_Monthly);
        hourlyRatePage.enterWorkTravelsMonthly(HourlyRatePageConstants.Work_Travels_Monthly);
        AssertJUnit.assertEquals("Actual value not equal expected value.",hourlyRatePage.getYourHourlyRate(), HourlyRatePageConstants.Actual_Value);
        log.info("Hourly rate calculate test passed \n");
    }
}
