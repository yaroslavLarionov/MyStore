package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    protected WebDriver driver;

    public CartPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "(//tr[@id]//p/a)[1]")
    public WebElement actualShirtITem;

    @FindBy (xpath = "(//tr[@id]//p/a)[2]")
    public WebElement actualDressItem;

    @FindBy (id = "total_price_without_tax")
    public WebElement totalPrice;

}
