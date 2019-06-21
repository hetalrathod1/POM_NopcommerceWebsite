package NopCommerce;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadProp=new LoadProp();
    private By _maleClick= By.id("gender-male");
    private By _femaleClick  =By.id("gender-female");
    private By _firstName =By.xpath("//input[@name='FirstName']");
    private By _lastName =By.xpath("//input[@name='LastName']");
    private By _dayDOB = By.xpath("//select[@name='DateOfBirthDay']");
    private By _monthDOB =By.xpath("//select[@name='DateOfBirthMonth']");
    private By _yearDOB =By.xpath(" //select[@name='DateOfBirthYear']");
    private By _registEmailID =By.xpath("//input[@name='Email']");
    private By _registPassword =By.xpath("//input[@name='Password']");
    private By _regsterConfirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    private By _registerButton = By.xpath("//input[@name='register-button']");


    private static String timestamp=currentdatetime();

    public void verifyUserIsOnRegisterPage()

    {
        assertURLtext("register");
       }
    public void userEnterRegistrationDetail() throws InterruptedException {

      // String FirstName = loadProp.getPropety("FirstName");
        clickElements(_maleClick);
        clickElements( _femaleClick);
        enterElements(_firstName,loadProp.getPropety("FirstName"));
        enterElements(_lastName,loadProp.getPropety("LastName"));
        selectDropdownText(_dayDOB,loadProp.getPropety("Day"));
        Thread.sleep(1000);
         selectDropdownText(_monthDOB,loadProp.getPropety("Month"));
         Thread.sleep(1000);
        selectDropdownText(_yearDOB,loadProp.getPropety("Year"));
        Thread.sleep(1000);
        String firstemail=loadProp.getPropety("firstemail");
        String  secondemail=loadProp.getPropety("secondemail");
        String Email= firstemail+currentdatetime()+secondemail;
        enterElements(_registEmailID,Email);

        Thread.sleep(1000);
        enterElements(_registPassword,loadProp.getPropety("Password"));
        Thread.sleep(1000);
        enterElements(_regsterConfirmPassword,loadProp.getPropety("Cpassword"));
        Thread.sleep(1000);
        clickElements(_registerButton);
    }
}


