package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class CartTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }
}
