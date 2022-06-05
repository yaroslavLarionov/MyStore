package data.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

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
