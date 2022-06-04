package data.config.dataProviders;

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
    @DataProvider(name = "AuthenticationLogin")
    public Object[] testAuthentication(){
        Object[] loginPage ={"Login - My Store"};
        return loginPage;
    }
}
