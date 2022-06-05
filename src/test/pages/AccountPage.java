package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.XpiDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {
    protected WebDriver driver;

    public AccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//button[@id='SubmitCreate']")
    public WebElement createAccBtn;

    @FindBy (xpath = "//input[@id='email_create']")
    public WebElement createEmail;

    @FindBy (xpath = "//input[@id='customer_firstname']")
    public WebElement firstNameInfo;

    @FindBy (xpath = "//input[@id='customer_lastname']")
    public WebElement lastNameInfo;

    @FindBy (xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstNameAddressBox;

    @FindBy (xpath = "//input[@id='lastname']")
    public WebElement lastNameAddressBox;

    @FindBy (xpath = "//input[@id='address1']")
    public WebElement address;

    @FindBy (xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy (xpath = "//select[@id='id_state']")
    public WebElement state;

    @FindBy (xpath = "//input[@id='postcode']")
    public WebElement zipCode;

    @FindBy (xpath = "//input[@id='phone_mobile']")
    public WebElement phoneNumber;

    @FindBy (id = "submitAccount")
    public WebElement registerBtn;

    @FindBy (xpath = "//div[@class='header_user_info']//span")
    public WebElement userInfo;

    @FindBy (xpath = "//a[@class='logout']")
    public WebElement signOutBtn;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement registeredEmail;

    @FindBy (xpath = "//input[@id='passwd']")
    public WebElement registeredPassword;

    @FindBy (id = "SubmitLogin")
    public WebElement registeredUserLoginBtn;

    @FindBy (linkText = "My account")
    public WebElement myAccountText;

    public String expectedTitle = "Login - My Store";


}
