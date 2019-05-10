package NopCommerce;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TestSuit extends BaseTest
{
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage=new RegistrationSuccessPage();
    LoginPage login =new LoginPage();
    LoginSuccessPage loginSuccessPage=new LoginSuccessPage();
    Euro_Currancy euro_currancy=new Euro_Currancy();
    Apparel_Clothing apparel_clothing=new Apparel_Clothing();


    @Test
    public void userShouldBeRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registrationPage.userEnterRegistrationDetail("hetal","rathod","1","February","1983","hetal@gmail.com","123","123");
        registrationSuccessPage.verifyUserSeeRegistrationSuccessMessage();
    }
    @Test
    public void userShouldBeLoginSuccessfully()
    {
        homePage.clickOnLogin();
        login.loginToNopCommerce("hetal1@gmail.com","hetal123");
        loginSuccessPage.verifyUserSeeLoginSuccessfulMessage();
    }
    @Test
    public void userShouldSeeEuroCurrancy()
    {
        homePage.selectEuroCurrancy();
       euro_currancy.verifyUserSeeEuroCurrency();
    }
    @Test
    public void userShouldBeOnHiToLow()
    {
        apparel_clothing.sortByHiToLow();
        apparel_clothing.verifyUserIsOnClothing();
    }
}
