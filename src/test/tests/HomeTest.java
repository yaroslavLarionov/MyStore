package tests;

import base.BaseTest;

import data.config.dataProviders.DataProviders;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }

    @Test(testName = "AUT-3 Footer - Information section",
            description = "Information section should have following buttons",
            dataProvider = "info", dataProviderClass = DataProviders.class)
    public void testInfo(String info) {
        Assert.assertTrue(getDriver().findElement(By.linkText(info)).isEnabled());
    }

    @Test(testName = "AUT-4 Footer - My account section",
            description = "My account section should have following options",
            dataProvider = "account", dataProviderClass = DataProviders.class)
    public void testAccount(String account) {
        Assert.assertTrue(getDriver().findElement(By.linkText(account)).isEnabled());

    }


//    @Test(testName = "AUT-4 Footer - my account section",
//            description = "All 4 links above will take user to Authentication page if user hasn't signed in yet")
//    public void testAuthentication(String au) {
//        String currentWindow = getDriver().getWindowHandle();
//        homePage.myOrder.click();
//        Assert.assertEquals(getDriver().getTitle(), "");
//        getDriver().switchTo().window(currentWindow);
//        homePage.myCreditSlips.click();
//        Assert.assertEquals(getDriver().getTitle(),"");
//        getDriver().switchTo().window(currentWindow);
//        homePage.myAddresses.click();
//        Assert.assertEquals(getDriver().getTitle(),"");
//        getDriver().switchTo().window(currentWindow);
//        homePage.myPersonalInfo.click();
//        Assert.assertEquals(getDriver().getTitle(),"");
//        getDriver().switchTo().window(currentWindow);
//    }
}

