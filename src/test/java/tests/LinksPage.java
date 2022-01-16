package tests;

import base.Base;
import base.FindElementsInterfaces;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;

public class LinksPage extends Base implements FindElementsInterfaces {
    public LinksPage(){
        //Buraya kodlar yazılacak.
        WebElement brokenLinksImagesItem = FindElement(By.id("item-6"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", brokenLinksImagesItem);
        brokenLinksImagesItem.click();
    }
}
