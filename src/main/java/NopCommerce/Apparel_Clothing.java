package NopCommerce;


//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Apparel_Clothing extends Utils {

    HomePage homePage = new HomePage();

    private By _sortBy = (By.id("products-orderby"));

    public void verifyUserIsOnClothing() {
        assertURLtext("clothing");

    }

    public void sortByHiToLow() {

        selectDropdownText(_sortBy, "Price: High to Low");


        ArrayList<Double> originalpricelist = new ArrayList<Double>();
        ArrayList<Double> sortedpricelist = new ArrayList<Double>();

        List<WebElement> activeprice = driver.findElements(By.xpath("//span[@class='price actual-price']"));
         for (WebElement element : activeprice) {
            String str = element.getText();
          //   System.out.println(str);

            str = str.replaceAll( "[-+]?\\D*\\.\\d+|\\D+", "");
              //System.out.println(str);
            originalpricelist.add(Double.valueOf(str));//add value to arraylist
            sortedpricelist.add(Double.valueOf(str)); // add value to sorthilow arraylist

//             str = str.replaceAll( "^//d.", "");
//             //System.out.println(str);
//             originalpricelist.add(Double.valueOf(str));//add value to arraylist
//             sortedpricelist.add(Double.valueOf(str)); // add value to sorthilow arraylist

         }
        Collections.sort(sortedpricelist,Collections.<Double>reverseOrder());
        System.out.println(originalpricelist);
        System.out.println("sortlist =" + sortedpricelist);
        System.out.println("actual pricelist =" + originalpricelist.equals(sortedpricelist));


    }
}








