package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
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
}
