package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class SeleniumUtils {
    public void switchToNextWindow(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String eachWindow : allWindows) {
            if (!eachWindow.equals(currentWindow)) {
                driver.switchTo().window(eachWindow);
            }
        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
