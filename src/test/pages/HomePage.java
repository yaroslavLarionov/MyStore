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

    @FindBy (xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingBtn;

    @FindBy (xpath = "//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")
    public WebElement shirtItem;

    @FindBy (xpath = "//a[@class='product-name' and @title='Printed Dress']")
    public WebElement dressItem;

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    public WebElement viewCart;

    @FindBy (linkText = "Add to cart")
    public WebElement addToCart;

    @FindBy (linkText = "Quick view")
    public WebElement quickViewBtn;

    @FindBy (xpath = "//a[@title='Close']")
    public WebElement closeBtn;

    @FindBy (xpath = "(//a[text()='T-shirts'])[2]")
    public WebElement tshirtsSectionBtn;

    public String expectedShirtItemText = "Faded Short Sleeve T-shirts";

    public String expectedDressItemText = "Printed Dress";







}

