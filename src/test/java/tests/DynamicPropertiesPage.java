package tests;
import base.Base;
import base.FindElementsInterfaces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage extends Base implements FindElementsInterfaces {
    public DynamicPropertiesPage(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement enableAfterFiveSecButton = FindElement(By.xpath("//div/button[contains(text(),'Will')]"));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfterFiveSecButton));
        enableAfterFiveSecButton.click();
        WebElement changeTextColorAfterFiveSecButton = FindElement(By.xpath("//div/button[contains(text(),'Color Change')]"));
        wait.until(ExpectedConditions.attributeToBe(changeTextColorAfterFiveSecButton,"class","mt-4 text-danger btn btn-primary"));
        String classValue = changeTextColorAfterFiveSecButton.getAttribute("class");
        Assert.assertEquals("Color Change buttonu yazısı kırmızıya dönmedi.","mt-4 text-danger btn btn-primary",classValue);
        WebElement visibleAfterFiveSecButton = FindElement(By.xpath("//div/button[contains(text(),'Vis')]"));
        wait.until(ExpectedConditions.visibilityOf(visibleAfterFiveSecButton));
        visibleAfterFiveSecButton.click();
    }
}