package tests;

import base.BaseTest;
import data.dataProviders.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.HomePage;

public class ContactTest extends BaseTest {
    HomePage homePage;
    ContactPage contactPage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        contactPage = new ContactPage(getDriver());
    }

    @Test(testName = "AUT-2", description = "Verifying subject heading on contact us page", dataProvider = "Options list", dataProviderClass = DataProviders.class)
    public void contactUsSubject(String option) {
        homePage.contactUsBtn.click();
        Assert.assertTrue(contactPage.options.getText().contains(option));
    }

    @Test (testName = "AUT-2", description = "verify email field doesn't accept wrong inputs", dataProvider = "Email", dataProviderClass = DataProviders.class)
    public void emailVerification(String data) {
        homePage.contactUsBtn.click();
        contactPage.emailField.sendKeys(data);
        contactPage.submitBtn.click();
        contactPage.waitForElementVisibility(contactPage.invalidEmail);
        Assert.assertTrue(contactPage.invalidEmail.getText().contains("Invalid email address."));
    }

    @Test (testName = "AUT-2", description = "verify email field using correct data")
    public void emailVerification2() {
        homePage.contactUsBtn.click();
        contactPage.emailField.sendKeys("data@yahoo.com");
        contactPage.submitBtn.click();
        contactPage.waitForElementVisibility(contactPage.invalidEmail);
        Assert.assertFalse(contactPage.invalidEmail.getText().contains("Invalid email address."));
    }

    @Test (testName = "AUT-2", description = "Verify order reference field is displayed")
    public void orderRef() {
        homePage.contactUsBtn.click();
        Assert.assertTrue(contactPage.orderRefField.isDisplayed());
    }

    @Test (testName = "AUT-2", description = "Verify file attachment is possible")
    public void testAttachment() {
        homePage.contactUsBtn.click();
        contactPage.fileUpload(getDriver());
        Assert.assertTrue(contactPage.attachedFileElement.isDisplayed());
    }

    @Test (testName = "AUT-2", description = "Verify text message area")
    public void textArea() {
        homePage.contactUsBtn.click();
        Assert.assertTrue(contactPage.textMessage.isDisplayed());
    }

    @Test (testName = "AUT-2", description = "Verify user can succesfully send a message after filling out all fields")
    public void testAll() {
        homePage.contactUsBtn.click();
        contactPage.options.sendKeys("Customer service");
        contactPage.emailField.sendKeys("test@test.com");
        contactPage.orderRefField.sendKeys("12234");
        contactPage.fileUpload(getDriver());
        contactPage.textMessage.sendKeys("Test message");
        contactPage.submitBtn.click();
        contactPage.waitForElementVisibility(contactPage.successMsg);
        Assert.assertTrue(contactPage.successMsg.isDisplayed() &&
                contactPage.successMsg.getText().contains("Your message has been successfully sent to our team."));
    }


}
