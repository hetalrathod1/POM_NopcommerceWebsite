package NopCommerce;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Euro_Currancy extends Utils
{
    HomePage homePage=new HomePage();
    public void verifyUserSeeEuroCurrency()
    {

        for (int i=1; i<4; i++)
        {
            String actresult=driver.findElement(By.xpath("(//span[@class='price actual-price'])["+i+"]")).getText();
             Assert.assertEquals("Ђ",String.valueOf(actresult.charAt(0)) );

        }


    }


}
