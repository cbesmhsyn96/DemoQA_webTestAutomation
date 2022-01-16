package tests;

import base.Base;
import base.FindElementsInterfaces;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrokenLinksImagesPage extends Base implements FindElementsInterfaces {
    public BrokenLinksImagesPage() throws IOException {
        /*
        Link ve resimleri test etme
        try-cath kullanmamın nedeni fail aldığı zaman durmaması ve sonrakileri de test etmesi için
        HttpClient
        WebElement
        HttpGet request
        HttpResponse
        int statusCode
        */
        HttpClient client2 = HttpClientBuilder.create().build();
        WebElement brokenImageControllElement = FindElement(By.xpath("//div/img[@src='/images/Toolsqa_1.jpg']"));
        String linkOfBrokenImange = brokenImageControllElement.getAttribute("src");
        HttpGet request2 = new HttpGet(linkOfBrokenImange);
        HttpResponse response2 = client2.execute(request2);
        int statusCode2 = response2.getStatusLine().getStatusCode();
        try {
            Assert.assertEquals("Broken Image",200,statusCode2);
        }catch (AssertionError error1){
            System.out.println("Kırık image dosyası. Hata ==>"+error1);
        }
        HttpClient client = HttpClientBuilder.create().build();
        WebElement validLinkControllElement = FindElement(By.xpath("//div/a[contains(text(),'Click Here for Valid Link')]"));
        String url=validLinkControllElement.getAttribute("href");
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        Assert.assertEquals("Broken Link",200,statusCode);
        HttpClient client1 = HttpClientBuilder.create().build();
        WebElement brokenLinkControllElement = FindElement(By.xpath("//div/a[starts-with(text(),'Click Here for Broken Link')]"));
        String brokenLinkText = brokenLinkControllElement.getText();
        String url1 = brokenLinkControllElement.getAttribute("href");
        HttpGet request1 = new HttpGet(url1);
        HttpResponse response1 = client1.execute(request1);
        int statusCode1 = response1.getStatusLine().getStatusCode();
        try{
            Assert.assertEquals("Broken Link",200,statusCode1);
        }catch (AssertionError error){
            System.out.println(brokenLinkText+" yazılı link kırık. Hata ==>"+error);
        }
        WebElement uploadAndDownloadMenuItem = FindElement(By.id("item-7"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadAndDownloadMenuItem);
        uploadAndDownloadMenuItem.click();
    }
}
