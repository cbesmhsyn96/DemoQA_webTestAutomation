package base;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base implements FindElementsInterfaces {
    protected static WebDriver driver;
    @Before
    public void startTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
    }
    @Override
    public WebElement FindElement(By by){
        WebDriverWait wait = new WebDriverWait(driver,10, 1000);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    /*@After
    public void endTest(){
        driver.close();
        driver.quit();
    }*/
}
