package tests;
import base.Base;
import base.FindElementsInterfaces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ButtonsPage extends Base implements FindElementsInterfaces {
    public ButtonsPage(){
        Actions action = new Actions(driver);
        WebElement doubleClickButton = FindElement(By.id("doubleClickBtn"));
        action.doubleClick(doubleClickButton).perform();
        WebElement doubleClickBtnMessage = FindElement(By.id("doubleClickMessage"));
        String messageDoubleClick = doubleClickBtnMessage.getText();
        Assert.assertEquals("Double click olayında beklenen sonuç 'You have done a double click' yazısı görülmedi.","You have done a double click",messageDoubleClick);
        WebElement rightClickButton = FindElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();
        WebElement rightClickBtnMessage = FindElement(By.id("rightClickMessage"));
        String messageRightClick = rightClickBtnMessage.getText();
        Assert.assertEquals("Right click olayında beklenen sonuç 'You have done a right click' yazısı görülmedi.","You have done a right click",messageRightClick);
        WebElement clickBtn = FindElement(By.xpath("//div/button[starts-with(text(),'Click Me')]"));
        clickBtn.click();
        String clickBtnText = FindElement(By.id("dynamicClickMessage")).getText();
        Assert.assertEquals("Click Me bottonuna tıklandığında beklenen yazı 'You have done a dynamic click' yazmadı.","You have done a dynamic click",clickBtnText);
        WebElement linksMenuItem = FindElement(By.id("item-5"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linksMenuItem);
        linksMenuItem.click();
    }
}