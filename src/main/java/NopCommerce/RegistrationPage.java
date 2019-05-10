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
    private By _emailID =By.xpath("//input[@name='Email']");
    private By _password =By.xpath("//input[@name='Password']");
    private By _confirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    private By _registerButton = By.xpath("//input[@name='register-button']");


    private static String timestamp=currentdatetime();

    public void verifyUserIsOnRegisterPage()
    {
        assertURLtext("register");
       }
    public void userEnterRegistrationDetail(String fname,String lname,
                                            String day,String month,String year,String id,String pass,String cpass)
    {
        clickElements(_maleClick);
        clickElements( _femaleClick);
        enterElements(_firstName,fname);
        enterElements(_lastName, lname);
        selectDropdownValue(_dayDOB,day);
        selectDropdownValue(_monthDOB,month);
        selectDropdownValue(_yearDOB,year);
        enterElements(_emailID,id);
        enterElements(_password,pass);
        enterElements(_confirmPassword,cpass);
        clickElements(_registerButton);
    }
}


