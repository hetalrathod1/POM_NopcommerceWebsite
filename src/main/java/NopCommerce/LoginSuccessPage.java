package NopCommerce;

import org.openqa.selenium.By;

public class LoginSuccessPage extends Utils
{
    LoadProp loadProp=new LoadProp();
    private By _loginSuccessMessage=By.linkText("Log out");

    public void verifyUserSeeLoginSuccessfulMessage()
    {
        assertURLtext("loginresult");
        assertTextMessage("Login Succeessfully",_loginSuccessMessage);
    }
}
