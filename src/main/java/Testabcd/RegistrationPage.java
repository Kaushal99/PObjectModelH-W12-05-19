package Testabcd;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadProp = new LoadProp();
    private By _firstname = By.xpath("//input[@id='FirstName']");
    private By _lastname = By.xpath("//input[@id='LastName']");
    private By _email = By.xpath("//input[@type='email']");
    private By _password = By.xpath("//input[@name='Password']");
    private By _confirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    private By _registerButton = By.xpath("//input[@id='register-button']");

    private String timeStamp = creatTimeStamp();
    public void verifyUserOnRegistrationPage()
    {
        Utils.assertURL("register");
    }

    public void userEnterRegistrationDetails()
    {
       Utils.enterTextInField(_firstname,loadProp.getProperty("firstname"));
       Utils.enterTextInField(_lastname,loadProp.getProperty("lastname"));
       Utils.enterTextInField(_email,loadProp.getProperty("email")+ timeStamp + "@gmail.com");
       Utils.enterTextInField(_password,loadProp.getProperty("password"));
       Utils.enterTextInField(_confirmPassword,loadProp.getProperty("confirmpassword"));

       Utils.clickingElement(_registerButton);


    }


}
