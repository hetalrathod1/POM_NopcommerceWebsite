package NopCommerce;

import org.openqa.selenium.By;

public class LoginPage extends Utils
    //This class will store all the locater and method of login page
{
    LoadProp loadProp=new LoadProp();
    private By _loginEmailId = By.xpath("//input[@name='Email']");
    private By _loginPassword = By.xpath("//input[@name='Password']");
    private By _loginButton    = By.xpath("//input[@class='button-1 login-button']");

    public void verifyUserIsOnLoginPage()
    {
        assertURLtext("login");
    }
    public void loginToNopCommerce()
    {
        enterElements(_loginEmailId,loadProp.getPropety("Email"));
        enterElements(_loginPassword,loadProp.getPropety("Password"));
        clickElements(_loginButton);

    }
    public void userEnterEmailId()
    {
        enterElements(_loginEmailId,loadProp.getPropety("Email"));

    }
    public void userEnterPassword()
    {
        enterElements(_loginPassword,loadProp.getPropety("Password"));
    }
    public void userClickOnLoginButton()
    {
        clickElements(_loginButton);

    }
















//    public void clickOnLoginButton()
//    {
//        clickElements(_LoginButton);
//    }

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
