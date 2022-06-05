package tests;

import base.BaseTest;
import data.dataProviders.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;

public class AccountTest extends BaseTest {
    HomePage homePage;
    AccountPage accountPage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        accountPage = new AccountPage(getDriver());
    }

    @Test (testName = "AUT-7", description = "user should be able to create an account")
    public void createAccount() {
        homePage.signInBtn.click();
        accountPage.createEmail.sendKeys("testing@wqowww.com");
        accountPage.createAccBtn.click();
        //creating new user
        accountPage.waitForElementVisibility(accountPage.firstNameInfo);
        accountPage.firstNameInfo.sendKeys("John");
        accountPage.lastNameInfo.sendKeys("Smith");
        accountPage.password.sendKeys("testNG");
        accountPage.firstNameAddressBox.sendKeys("John");
        accountPage.lastNameAddressBox.sendKeys("Smith");
        accountPage.address.sendKeys("123 High St");
        accountPage.city.sendKeys("Austin");
        accountPage.state.sendKeys("Texas");
        accountPage.zipCode.sendKeys("45317");
        accountPage.phoneNumber.sendKeys("12345677454");
        accountPage.registerBtn.click();
        //verify the information is correct
        accountPage.waitForElementVisibility(accountPage.userInfo);
        Assert.assertTrue(accountPage.userInfo.getText().equals("John Smith") && accountPage.signOutBtn.isEnabled());
    }

    @Test (testName = "AUT-8", description = "Verify buttons after sign in", dataProvider = "My account buttons", dataProviderClass = DataProviders.class)
    public void signInBtns(String button) {
        homePage.signInBtn.click();
        //input valid info to log in
        accountPage.registeredEmail.sendKeys("test1111@test1111.com");
        accountPage.registeredPassword.sendKeys("qwerty123");
        accountPage.registeredUserLoginBtn.click();
        //verifying buttons
        accountPage.waitForElementVisibility(accountPage.myAccountText);
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@title='" + button + "']")).isEnabled());
    }
}
