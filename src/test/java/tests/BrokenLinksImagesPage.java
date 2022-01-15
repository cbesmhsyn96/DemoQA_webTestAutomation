package tests;

import base.Base;
import base.FindElementsInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrokenLinksImagesPage extends Base implements FindElementsInterfaces {
    public BrokenLinksImagesPage() {
        //Buraya test kodları gelecek
        WebElement uploadAndDownloadMenuItem = FindElement(By.id("item-7"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadAndDownloadMenuItem);
        uploadAndDownloadMenuItem.click();
    }
}
