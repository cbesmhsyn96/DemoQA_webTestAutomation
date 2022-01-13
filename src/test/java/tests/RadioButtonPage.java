package tests;
import base.Base;
import base.FindElementsInterfaces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonPage extends Base implements FindElementsInterfaces {
    public RadioButtonPage(){
        List<WebElement> radios = driver.findElements(By.className("custom-control-label"));
        for (WebElement radio : radios) {
            radio.click();
            if (radio.getAttribute("for")=="yesRadio"){
                Assert.assertEquals("Text i Yes olan radio button seçildiğinde alttaki cümledeki son kelime Yes olmuyor.",FindElement(By.className("text-success")).getText(),"Yes");
            }
            else if (radio.getAttribute("for")=="impressiveRadio"){
                Assert.assertEquals("Text i Impressive olan radio button seçildiğinde alttaki cümledeki son kelime Impressive olmuyor.",FindElement(By.className("text-success")).getText(),"Impressive");
            }
        }
        WebElement webTablesMenuItem = FindElement(By.id("item-3"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webTablesMenuItem);
        webTablesMenuItem.click();
    }
}