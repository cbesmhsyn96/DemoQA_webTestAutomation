package tests;
import base.Base;
import base.FindElementsInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends Base implements FindElementsInterfaces {
    public CheckBoxPage() {
        WebElement checkBoxElement = FindElement(By.className("rct-checkbox"));
        checkBoxElement.click();
        WebElement radioButtonMenuItem = FindElement(By.id("item-2"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButtonMenuItem);
        radioButtonMenuItem.click();
    }
}