package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class CartTest extends BaseTest {
    HomePage homePage;
    CartPage cartPage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        cartPage = new CartPage(getDriver());
    }

    @Test(testName = "AUT-1", description = "adding items to cart and verifying them in full cart")
    public void fullCartTest() {
        //adding 1st item
        homePage.moveToMyElement(homePage.shirtItem);
        homePage.addToCart.click();
        String firstAddedItem = homePage.shirtItem.getText();
        homePage.click(homePage.continueShoppingBtn);
        //adding 2nd item
        homePage.moveToMyElement(homePage.dressItem);
        homePage.addToCart.click();
        String secondAddedItem = homePage.dressItem.getText();
        homePage.click(homePage.continueShoppingBtn);
        //click the cart button and verify if the info matches
        homePage.cartBtn.click();
        Assert.assertTrue(cartPage.actualShirtITem.getText().equals(firstAddedItem) && cartPage.actualDressItem.getText().equals(secondAddedItem) &&
                cartPage.totalPrice.getText().equals(homePage.expectedTotalPrice));

    }
}
