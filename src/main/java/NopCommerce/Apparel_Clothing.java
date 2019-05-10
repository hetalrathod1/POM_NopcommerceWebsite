package NopCommerce;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Apparel_Clothing extends Utils
{
    LoadProp loadProp=new LoadProp();
    HomePage homePage=new HomePage();

    private By _sortBy= (By.id("products-orderby"));

    public void verifyUserIsOnClothing()
    {
        assertURLtext("clothing");
        assertCurrentURL("clothing");
    }
    public void sortByHiToLow()
    {
        selectDropdownText(_sortBy,"Price: High to Low");

        String actresult1;
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> arr1 = new ArrayList<String>();

        String actresult=driver.findElement(By.xpath("//span[contains(text(),'35.00')]")).getText();
        System.out.println(actresult);

        for(int i=0;i<1;i++)
        {
            //arr.add(actresult);
            // System.out.println(arr.get(i));
//            for (i = 0; i < arr.size(); i++)
            {
                actresult = actresult.replaceAll("[-+]?\\D*\\.\\d+|\\D+", "");
                arr1.add(actresult);
                System.out.println(arr1.get(i));
            }

        }
          Assert.assertEquals("From $35.00",actresult);
        System.out.println(actresult);



    }


}
