package NopCommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSelector extends Utils
{
    LoadProp loadProp = new LoadProp();
    public void setUpBrowser()
    {
       String browser = loadProp.getPropety("browser");
    //   String setUpBrowser=System.getProperty("browser");

       if (browser.equalsIgnoreCase("firefox"))
       {
           System.setProperty("webdriver.gecko.driver","src\\test\\java\\BrowserDriver\\geckodriver");
           System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
           System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
           driver = new FirefoxDriver();
           driver.manage().window().fullscreen();
       }
       else if (browser.equalsIgnoreCase("Chrome"))
       {
        System.setProperty("webdriver.Chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("-disable-extensions");
        options.addArguments("-disable-setUpBrowser-side-navigation");
        options.addArguments("-incognito");
        options.addArguments("-disable-blink-feature=BlockCredentialedSubresources");
        driver=new ChromeDriver(options);
        driver.manage().window().fullscreen();
       }
       else if (browser.equalsIgnoreCase("ie"))
       {
//           System.setProperty("webdriver.ie.driver","src\\test\\java\\BrowserDriver\\IEDriverServer.exe");
//           InternetExplorerOptions options=new InternetExplorerOptions();
//           options.setCapability(InternetExplorerDriver.IE_SWITCHES,"-private");
//           options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
//           driver=new InternetExplorerDriver(options);
//           driver.manage().window().fullscreen();
       }
       else
       {
           System.out.println("Browser name is empty or typed wrong"+browser);
       }
    }
}
