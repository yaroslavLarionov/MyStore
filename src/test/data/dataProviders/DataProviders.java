package data.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider(name = "info")
    public Object[] testDataInfo() {
        Object[] infoData = {"Specials", "New products",
                "Best sellers", "Our stores", "Contact us",
                "Terms and conditions of use", "About us", "Sitemap"};
        return infoData;
    }

    @DataProvider(name = "account")
    public Object[] testDataAccount() {
        Object[] accountData = {"My orders", "My credit slips", "My addresses", "My personal info"};
        return accountData;
    }

    @DataProvider(name = "socialLink")
    public Object[][] TestSocialLinks(){
        Object[][] socials = new Object[4][2];
        socials[0][0] = "Facebook";
        socials[0][1] = "Selenium Framework | Facebook";
        socials[1][0] = "Twitter";
        socials[1][1] = "Selenium Framework (@seleniumfrmwrk) / Twitter";
        socials[2][0] = "Youtube";
        socials[2][1] = "Selenium Framework - YouTube";
        socials[3][0] = "Google";
        socials[3][1] = "Sign in - Google Accounts";

        return socials;
    }

    @DataProvider (name = "Options list")
    public Object[] cartInfo() {
        Object[] data = {"Customer service", "Webmaster"};
        return  data;
    }


    @DataProvider (name = "Email")
    public Object[] emailInfo() {
        Object[] data = {"testing", "@.com", "", ".com", ".com@test.com"};
        return  data;
    }

    @DataProvider (name = "My account buttons")
    public Object[] myAccountBtns() {
        Object[] data = {"Orders", "My credit slips", "My addresses", "Information", "My wishlists"};
        return  data;
    }



}
