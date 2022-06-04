package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div/ul[@class='bullet']/li")
    public List<WebElement> myAccountLink;

    @FindBy(xpath = "//a[@title='My orders']")
    public WebElement myOrder;
    @FindBy(xpath = "//a[@title='My credit slips']")
    public WebElement myCreditSlips;
    @FindBy(xpath = "//a[@title='My addresses']")
    public WebElement myAddresses;
    @FindBy(xpath = "//a[@title='My personal info']")
    public WebElement myPersonalInfo;
}
