package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirtPage extends BasePage {
    protected WebDriver driver;

    public TShirtPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@id='viewed-products_block_left']//a[contains (text(), 'Faded Short Sleeve')]")
    public WebElement viewedShirtItem;

    @FindBy (xpath = "//div[@id='viewed-products_block_left']//a[contains (text(), 'Dress')]")
    public WebElement viewedDressItem;

}
