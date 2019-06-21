package NopCommerce;

    import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By _registerLink =By.linkText("Register");
    private By _loginLink = By.xpath("//a[@class='ico-login']");
    private By _euro_Currency =By.id("customerCurrency");
   // private By _apparelCategory = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Apparel')]");
    private By _apprel=By.linkText("Apparel");
    private By _clothing=By.linkText("Clothing");
    private By _books=By.linkText("Books");
    private By _computerCatogery= By.linkText("Computers");


    private By _desktops = By.linkText("Desktops");




    public void userIsOnHomepage()
    {
        assertCurrentURL("https://demo.nopcommerce.com/");
     }

    public  void clickOnRegisterButton ()
    {
        clickElements(_registerLink);

    }
    public void clickOnLogin()
    {
        clickElements(_loginLink);
    }
    public void hoverOnCategoryLinks()
    {
        //hoverAndClcikElement();
        hoverElement(_apprel);
        clickElements(_clothing);
    }

    public void selectEuroCurrancy(  )
    {
        selectDropdownText(_euro_Currency,"Euro");
    }

    public void clickOnBookCategory()
    {
        clickElements(_books);
    }
    public void hoverOnComputerCatregory()
    {
        hoverElement(_computerCatogery);

    }
    public void clickOnDesktop()
    {
        clickElements(_desktops);
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
