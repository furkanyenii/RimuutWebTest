package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InvoiceGeneratorForFreelancerPage.InvoiceGeneratorForFreelancerPage;
import pages.InvoiceGeneratorForFreelancerPage.InvoiceGeneratorForFreelancerPageConstants;

public class InvoiceGeneratorForFreelancerTest extends BaseTest {

    @Test
    public void invoiceGeneratorForFreelancerPageTest(){
        driver.get(InvoiceGeneratorForFreelancerPageConstants.URL);
        InvoiceGeneratorForFreelancerPage invoiceGenerator = new InvoiceGeneratorForFreelancerPage(driver);
        log.info("Invoice generator for freelancer test started.");
        invoiceGenerator.acceptCookie();

        //invoiceGenerator.clickUploadButtonAndUploadFile(InvoiceGeneratorForFreelancerPageConstants.Upload_File_Path);

        invoiceGenerator.clearAreaAndSetYourBusinessName();
        invoiceGenerator.clearAreaAndSetCompanyInformation(
                InvoiceGeneratorForFreelancerPageConstants.Company_Street,
                InvoiceGeneratorForFreelancerPageConstants.Company_Town,
                InvoiceGeneratorForFreelancerPageConstants.Company_Country,
                InvoiceGeneratorForFreelancerPageConstants.Company_Number,
                InvoiceGeneratorForFreelancerPageConstants.Vat);

        invoiceGenerator.clearAreaAndSetClientCompanyInformation(
                InvoiceGeneratorForFreelancerPageConstants.Client_Company_Street,
                InvoiceGeneratorForFreelancerPageConstants.Client_Company_Town,
                InvoiceGeneratorForFreelancerPageConstants.Client_Company_Country,
                InvoiceGeneratorForFreelancerPageConstants.Client_Company_Number,
                InvoiceGeneratorForFreelancerPageConstants.Client_Vat
        );

        invoiceGenerator.setBankAccountAndInvoiceNo(
                InvoiceGeneratorForFreelancerPageConstants.Bank_Account,
                InvoiceGeneratorForFreelancerPageConstants.Invoice_No);

        invoiceGenerator.setFooterInformation(
                InvoiceGeneratorForFreelancerPageConstants.Email,
                InvoiceGeneratorForFreelancerPageConstants.Website,
                InvoiceGeneratorForFreelancerPageConstants.Phone
        );

        //invoiceGenerator.downloadPdf();

        log.info("Invoice generator for freelancer test passed");
    }
}
