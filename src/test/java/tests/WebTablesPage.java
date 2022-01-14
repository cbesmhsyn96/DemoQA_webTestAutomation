package tests;
import base.Base;
import base.FindElementsInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends Base implements FindElementsInterfaces {
    public WebTablesPage(){
        WebElement closeAdsElement = FindElement(By.id("close-fixedban"));
        if (closeAdsElement.isDisplayed())closeAdsElement.click();
        //yazılacak
        WebElement buttonsMenuItem = FindElement(By.id("item-4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonsMenuItem);
        buttonsMenuItem.click();
    }
}