package tests;

import base.Base;
import base.FindElementsInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class UploadAndDownloadPage extends Base implements FindElementsInterfaces {
    public UploadAndDownloadPage() {
        //Buraya test kodları gelecek.
        WebElement dynamicPropertiesMenuItem = FindElement(By.id("item-8"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dynamicPropertiesMenuItem);
        dynamicPropertiesMenuItem.click();
    }
}
