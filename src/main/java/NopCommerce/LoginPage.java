package NopCommerce;

import org.openqa.selenium.By;

public class LoginPage extends Utils
    //This class will store all the locater and method of login page
{
    LoadProp loadProp=new LoadProp();
    private By _Email_Id = By.xpath("//input[@name='Email']");
    private By _Password = By.xpath("//input[@name='Password']");
    private By _LoginButton    = By.xpath("//input[@class='button-1 login-button']");

    public void verifyUserIsOnLoginPage()
    {
        assertCurrentURL("login");
    }
    public void loginToNopCommerce(String id,String pass)
    {
        enterElements(_Email_Id,id);
        enterElements(_Password,pass);
        clickElements(_LoginButton);
    }

//    public void typeEmailID(String id)
//    {
//        driver.findElement(Email_Id).sendKeys(id);
//
//    }
//    public void typePassword(String password)
//    {
//        driver.findElement(Password).sendKeys(password);
//    }
//    public void clickOnLoginButton()
//    {
//        driver.findElement(Login).click();
//    }
}
