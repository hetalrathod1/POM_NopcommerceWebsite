package NopCommerce;


import net.bytebuddy.utility.JavaModule;
import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class BaseTest extends Utils
{
    LoadProp loadProp=new LoadProp();
     BrowserSelector browserSelector=new BrowserSelector();
     @BeforeMethod
     public void openBrowser()
     {
         browserSelector.setUpBrowser();

         driver.get("https://demo.nopcommerce.com/");
     }
    @AfterMethod
    public void tearDown(ITestResult result) {

// Here will compare if test is failing then only it will enter into if condition
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
// Create refernce of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) driver;

// Call method to capture screenshot
                File source = ts.getScreenshotAs(OutputType.FILE);

// Copy files to specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./CaptureScreenshots/" + result.getName() + ".png"));

                System.out.println("Screenshot taken");
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot " + e.getMessage());
            }


        }
        driver.quit();
    }
}