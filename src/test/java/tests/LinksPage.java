package tests;

import base.Base;
import base.FindElementsInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LinksPage extends Base implements FindElementsInterfaces {
    public LinksPage() {
        //Buraya test kodları yazılacak
        WebElement brokenLinksImagesItem = FindElement(By.id("item-6"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", brokenLinksImagesItem);
        brokenLinksImagesItem.click();
    }
}
