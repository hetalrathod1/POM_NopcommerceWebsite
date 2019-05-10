package NopCommerce;

import org.apache.commons.io.FileUtils;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils extends BasePage {
    //1). clicking elements
    public static void clickElements(By by) {
        driver.findElement(by).click();

    }
    //2). entering elements

    public static void enterElements(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    //3).clear Text from inout box/area
    public static void clearElements(By by) {
        driver.findElement(by).clear();
    }

    //4). clear and enter text in input field
    public static void clear_enter_text(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
//-----------------------------
    //5).get selected value from dropdown
    public static void selectDropdownValue(By by, String data) {
        Select dob = new Select(driver.findElement(by));
        dob.selectByValue(data);
    }
         public static void selectDropdownText(By by, String text) {
             Select dob = new Select(driver.findElement(by));
             dob.selectByVisibleText(text);
         }
        public static void selectDropdownIndex(By by, int index){
                 Select dob = new Select(driver.findElement(by));
                 dob.selectByIndex(index);
             }
//------------------------------------------
    //6). (actual result) wait for visibility of element with given time
    public void   waitForElementDisplay(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    //7).Wait for locator to be clickable for given time in seconds
    public static void waitForLocatorTobeClickable(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //8).Wait for fixed time given in seconds
    public static void waitForElementToBeClickable(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //9).Take a ScrenShot and store as file format
    public static void takeScreenShot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source, new File("./ScreenShots/" + screenshotName + ".png"));
            System.out.println("screenshot taken");

        } catch (IOException e)
        {
            System.out.println("Exception while taking screenshot" + e.getMessage());

        }
    }
//.........................................
    //10). create Timestamp method with current day-month-year-minute-second
   public static String currentdatetime()
   {
        //create date format object
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHss");
        return dateFormat.format(new Date());
    }

    //create Timestamp method with current day-month-hour-minute-
    public static String currentdaymonth()
    {
        //create date format object
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmm");
        return dateFormat.format(new Date());
    }

    //..................................................................
    //11). actual result - getting text from web
    public static void assertTextMessage(String expected,By by)
    {
         String actual= getTextFromElement(by);
         Assert.assertEquals(expected,actual);
    }
    // method for getting text from web(so getting text from assertTextMessage method)
    public static String getTextFromElement(By by) {
        return  driver.findElement(by).getText();
    }

    //12) if url contain specific word
    public static void assertURLtext(String text)
    {

        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
    //
    public static void assertCurrentURL(String text)
    {
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,text);
    }
    //-------------------------------------------------------
    //13) mouse hover method
    public void hoverElement(By by) {
        WebElement ele = driver.findElement(by); //xpath store in ele or you can use direct
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();// single element .perform if multiple we use build.perform
    }
    //mouse hover selecting element
    public void hoverAndClcikElement(By by,String elementname)
    {List<WebElement> links=driver.findElements(by);//xpath of multiple element(all link) so store in list

        //counting total number of link
        int count_link=links.size();

        //print all link
        for (int i=0; i<count_link; i++)
        {
            WebElement element=links.get(i);
            String text=element.getAttribute("innerHTML");//that means link name(can use gettext() as wellubstead if getattrubute

            boolean status=element.isEnabled(); //to check link is enable or not when performing

            System.out.println("Link name is "+text+"and the link status is "+status);// print all link name and checking enable or not

            if (text.equalsIgnoreCase(elementname))// selecting appium link n click
            {
                element.click();
                break; // just break loop to go tp further link
            }
        }
    }
    }

