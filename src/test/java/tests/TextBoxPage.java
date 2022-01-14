package tests;

import base.Base;
import base.FindElementsInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends Base implements FindElementsInterfaces {
    public TextBoxPage() {
        WebElement userNameInput = FindElement(By.id("userName"));
        userNameInput.sendKeys("asdsadas");
        WebElement userEmailInput = FindElement(By.id("userEmail"));
        userEmailInput.sendKeys("sdfsdfsdsdsgdsfg");
        WebElement currentAddressInput = FindElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("Adress buraya gelecek");
        WebElement permanentAddressInput = FindElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("permanentAddress te buraya");
        WebElement closeAdsElement = FindElement(By.id("close-fixedban"));
        if (closeAdsElement.isDisplayed())closeAdsElement.click();
        WebElement submitButton = FindElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.submit();
        WebElement checkBoxMenuItem = FindElement(By.id("item-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkBoxMenuItem);
        checkBoxMenuItem.click();
    }
}
