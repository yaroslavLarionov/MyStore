package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {
    HomePage homePage;
    AccountPage accountPage;
    SeleniumUtils seleniumUtils;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        accountPage = new AccountPage(getDriver());
        seleniumUtils = new SeleniumUtils();
    }

    @Test (testName = "AUT-1", description = "adding items to cart and verifying them in mini cart")
    public void miniCartTest() {
        //adding 1st item
        homePage.moveToMyElement(homePage.shirtItem);
        homePage.addToCart.click();
        homePage.click(homePage.continueShoppingBtn);
        //adding 2nd item
        homePage.moveToMyElement(homePage.dressItem);
        homePage.addToCart.click();
        homePage.click(homePage.continueShoppingBtn);
        //checking mini cart info if it matches
        homePage.moveToMyElement(homePage.viewCart);
        Assert.assertTrue(homePage.shirtItem.getText().equals(homePage.actualShirtItem.getAttribute("title")) &&
                homePage.dressItem.getText().equals(homePage.actualDressItem.getAttribute("title")) &&
                homePage.expectedTotalPrice.equals(homePage.miniCartTotalPrice.getText()));
    }


}
