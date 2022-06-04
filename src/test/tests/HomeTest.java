package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        homePage = new HomePage(getDriver());
    }
    @DataProvider(name = "footer")
        public Object[] testData() {
        Object[] footerData ={""};
        return footerData;
    }
    @Test(testName = "AUT-3 Footer - Information section", description = "Information section should have following buttons")

