package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPage extends BasePage {
    protected WebDriver driver;

    public ContactPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='id_contact']")
    public WebElement options;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailField;

    @FindBy (xpath = "//div[@class='alert alert-danger']")
    public WebElement invalidEmail;

    @FindBy (xpath = "//input[@id='id_order']")
    public WebElement orderRefField;

    @FindBy (id = "submitMessage")
    public WebElement submitBtn;

    @FindBy (xpath = "//span[@class='filename' and contains (text(),'.jpg')]")
    public WebElement attachedFileElement;

    @FindBy (xpath = "//textarea[@id='message']")
    public WebElement textMessage;

    @FindBy (xpath = "//p[@class='alert alert-success']")
    public WebElement successMsg;

    public void fileUpload(WebDriver driver) {
        String filePath = "C:\\Users\\yaril\\Desktop\\1.jpg";
        WebElement uploadFileField = driver.findElement(By.xpath("//input[@id='fileUpload']"));
        uploadFileField.sendKeys(filePath);
    }


}
