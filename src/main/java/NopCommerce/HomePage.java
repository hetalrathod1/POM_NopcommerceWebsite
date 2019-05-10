package NopCommerce;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
     By registerLink =By.linkText("Register");
     By loginLink = By.linkText("Log in");
      By euro_Currency =By.id("customerCurrency");
     By apparelCategory = By.linkText("Apparel");

    public  void clickOnRegisterButton ()
    {
        clickElements(registerLink);

    }
    public void clickOnLogin()
    {
        clickElements(loginLink);
    }
    public void hoverOnCategoryLinks()
    {
        hoverAndClcikElement(apparelCategory,"Clothing");
    }

    public void selectEuroCurrancy(  )
    {
        selectDropdownText(euro_Currency,"Euro");
    }





















    //    public void clickOnComputerLink()
//    {
//        clickElements(computerLink);
//    }
//    public void clickOnElectonics()
//    {
//        clickElements(electonicsLink);
//    }
//    public void clickOnApparel()
//    {
//        clickElements(apparelLink);
//    }

}
