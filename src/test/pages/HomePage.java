package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")
    public WebElement shirtItem;
    @FindBy (xpath = "//a[@class='fancybox-item fancybox-close']")
    public WebElement closeBtn;
    @FindBy (linkText = "Quick view")
    public WebElement quickViewBtn;
    @FindBy (xpath = "//a[@class='product-name' and @title='Printed Dress']")
    public WebElement dressItem;
    @FindBy (xpath = "(//a[text()='T-shirts'])[2]")
    public WebElement tshirtsSectionBtn;
    public String expectedShirtItemText = "Faded Short Sleeve T-shirts";

    public String expectedDressItemText = "Printed Dress";
}
