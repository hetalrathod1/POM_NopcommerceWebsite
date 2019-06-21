package NopCommerce;


//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Euro_Currancy extends Utils
{

    HomePage homePage=new HomePage();
    By _euroCurrancy=By.id("customerCurrency");

    public void verityUseriIsOnEuroCurrency()
    {
        assertTextMessage("Euro",_euroCurrancy);
    }
    public void userSeeEuroCurrencyProduct()
    {

        for (int i=1; i<4; i++)

        {
            //store xpath text in actresult to continue loop
            String actresult=driver.findElement(By.xpath("(//span[@class='price actual-price'])["+i+"]")).getText();

            // expected n actual result verify. so actresult we r taking first character value "Ђ"
            Assert.assertEquals("Ђ",String.valueOf(actresult.charAt(0)) );

            System.out.println(actresult);


        }


       // list.stream().forEach(System.out::println);
        //for (WebElement e: list )
        //List<WebElement> list = driver.findElement(By.xpath("(//span[@class='price actual-price'])"));
//        List<WebElement> list =driver.findElements(By.xpath("(//span[@class='product-item'])"));
//        for(int i=0;i<list.size();i++)
//        {
//            //List<WebElement> list =driver.findElements(By.xpath("(//span[@class='price actual-price'])"));
//            //list.add(By.xpath("(//span[@class='product-item'])["+i+"]"));
//
//            // assertTextMessage(e.getText().contains("Ђ"),);
//             //List<WebElement> elements =driver.findElements(By.xpath("(//span[@class='price actual-price'])["+e+"]"));
//             System.out.println(list.get(i).getText());
//
//
//
//         }


    }


}
