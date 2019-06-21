package NopCommerce;
import org.testng.TestNG;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.rmi.server.ExportException;

public class TestSuit extends BaseTest
{
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage=new RegistrationSuccessPage();
    LoginPage login =new LoginPage();
    LoginSuccessPage loginSuccessPage=new LoginSuccessPage();
    Euro_Currancy euro_currancy=new Euro_Currancy();
    Apparel_Clothing apparel_clothing=new Apparel_Clothing();
    Books books=new Books();
    ProductFirstPricePie productFirstPricePie=new ProductFirstPricePie();
    EmailAFriend emailAFriend=new EmailAFriend();
    Computer_Desktop computer_desktop=new Computer_Desktop();





    @Test
    public void userIsOnHomepage(){

         homePage.userIsOnHomepage();

    }
    @Test
    public void userShouldBeRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterButton();
        Thread.sleep(3000);
        registrationPage.userEnterRegistrationDetail();
        Thread.sleep(3000);
        registrationSuccessPage.verifyUserSeeRegistrationSuccessMessage();
      //  takeScreenShot(driver,"registration");

    }

    @Test
    public void userShouldBeLoginSuccessfully()
    {
        homePage.clickOnLogin();
        login.loginToNopCommerce();
        loginSuccessPage.verifyUserSeeLoginSuccessfulMessage();
    }
    @Test
    public void userShouldSeeEuroCurrancy()
    {
        homePage.selectEuroCurrancy();
       euro_currancy.userSeeEuroCurrencyProduct();
     }
    @Test
    public void userShouldSeePriceHiToLow()
    {
        homePage.hoverOnCategoryLinks();
        apparel_clothing.sortByHiToLow();
        apparel_clothing.verifyUserIsOnClothing();
    }
    @Test
    public void userShouldAdd2ProductToCart() throws InterruptedException {
        homePage.clickOnBookCategory();
       books.userSelectProductFirstprizepies();
       books.userClickOnAddToCart();
       books.verifyUserIsAbleToAddProduct();
       homePage.hoverOnComputerCatregory();
       homePage.clickOnDesktop();
       computer_desktop.clickOnProductdigitalStormVANQUISH3CustomPerformancePC();
       computer_desktop.clickOnAddToCart();
       computer_desktop.verifyUserIsAbleToAddProduct();

      // assertTextMessage("Shopping cart (2)",By.xpath("//a[@class='ico-cart']") );


    }


    @Test
    public void userShouldReferFriend() throws InterruptedException {
        homePage.clickOnBookCategory();
        books.userSelectProductFirstprizepies();
        productFirstPricePie.userClickOnReferFriend();
        productFirstPricePie.verifyUserIsOnEmailFriendPage();
    }

    @Test
    public void userEnterReferAFriendDetails() throws InterruptedException {
        homePage.clickOnLogin();
        login.loginToNopCommerce();
        loginSuccessPage.verifyUserSeeLoginSuccessfulMessage();
        homePage.clickOnBookCategory();
        books.userSelectProductFirstprizepies();
        Thread.sleep(1000);
        productFirstPricePie.userClickOnReferFriend();
        Thread.sleep(1000);
        emailAFriend.registerUserEnterDetailOfReferFriend();
        emailAFriend.verifyUserCanReferFriendProcut();

    }
    @Test
    public void notRegisterUserEnterReferAFriendDetails() throws InterruptedException {
        homePage.clickOnBookCategory();
        books.userSelectProductFirstprizepies();
        Thread.sleep(1000);
        productFirstPricePie.userClickOnReferFriend();
        Thread.sleep(1000);
        emailAFriend.notRegisterUserEnterDetailOfReferFriend();
        emailAFriend.verifyUserCannotReferFriend();

    }


}

