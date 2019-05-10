package NopCommerce;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils
{

     BrowserSelector browserSelector=new BrowserSelector();
     @Before
     public void openBrowser()
     {
         browserSelector.setUpBrowser();
         driver.get("https://demo.nopcommerce.com/");
     }
    @After

    public void closeBrowser()
    {
        driver.quit();
    }
}

