package tests;

import base.BaseTest;

import data.config.dataProviders.DataProviders;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;
    AccountPage accountPage;


    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        accountPage = new AccountPage(getDriver());

    }

    @Test(testName = "AUT-3 Footer - Information section",
            description = "Information section should have following buttons",
            dataProvider = "info", dataProviderClass = DataProviders.class)
    public void testInfo(String info) {
        getDriver().findElement(By.linkText(info)).click();
        Assert.assertTrue(getDriver().findElement(By.linkText(info)).isEnabled());
    }

    @Test(testName = "AUT-4 Footer - My account section",
            description = "My account section should have following options",
            dataProvider = "account", dataProviderClass = DataProviders.class)
    public void testAccount(String account) {
        getDriver().findElement(By.linkText(account)).click();
        Assert.assertEquals(getDriver().getTitle(), accountPage.expectedTitle);

    }
}

