package NopCommerce;

import org.openqa.selenium.By;

public class RegistrationSuccessPage extends Utils
{
    LoadProp loadProp=new LoadProp();
    private By _registerSuccessMessage=By.xpath("//div[@class='result']");

    public void verifyUserSeeRegistrationSuccessMessage()
    {
        assertURLtext("registerresult");
        assertTextMessage("Your registration completed",_registerSuccessMessage);
    }
}
