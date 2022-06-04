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

}
