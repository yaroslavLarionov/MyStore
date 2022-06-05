package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.TShirtPage;

public class TShirtTest extends BaseTest {
    TShirtPage tShirtPage;
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        tShirtPage = new TShirtPage(getDriver());
        homePage = new HomePage(getDriver());
    }
    @Test(testName = "AUT-6 Recently viewed items", description = "Should see quick view item in View Products section after click")
    public void testQuickView(){
        //view 1st item
        homePage.moveToMyElement(homePage.shirtItem);
        homePage.quickViewBtn.click();
        homePage.closeBtn.click();
        //view 2nd item
        homePage.moveToMyElement(homePage.dressItem);
        homePage.quickViewBtn.click();
        homePage.closeBtn.click();
        //click on t-shirt
        homePage.tshirtsSectionBtn.click();
        Assert.assertTrue(tShirtPage.viewedShirtItem.getAttribute("title").contains(homePage.expectedShirtItemText) &&
                tShirtPage.viewedDressItem.getAttribute("title").contains(homePage.expectedDressItemText));

    }
}
