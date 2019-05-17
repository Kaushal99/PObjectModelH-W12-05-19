package Testabcd;

import org.openqa.selenium.By;

public class UnRegisterReferFriend extends Utils
{
    LoadProp loadProp = new LoadProp();
    private By _emailFriend = By.xpath("//div[@class='page-title']");
    private By _friendemail = By.xpath("//input[@class='friend-email']");
    private By _myemail = By.xpath("//input[@class='your-email']");
    private By _personalmessage = By.xpath("//textarea[@class='your-email']");
    private By _sendEmailButton = By.xpath("//input[@name='send-email']");
    private By _unSuccessfull = By.xpath("//div[@class='message-error validation-summary-errors']");


    private String timeStamp = creatTimeStamp();
    public void userEmailAFriendPage()
    {
        Utils.assertMessagetext(_emailFriend);
    }


    //entering details to refer to friend

    public void unRegisterUserShouldAbleToFillAllDetailsToReferAFriend()
    {
        Utils.enterTextInField(_friendemail,loadProp.getProperty("friendEmail"));
         Utils.enterTextInField(_myemail,loadProp.getProperty("email")+ timeStamp + "@gmail.com");
        Utils.enterTextInField(_personalmessage,loadProp.getProperty("personalMessage"));
        Utils.clickingElement(_sendEmailButton);

    }
    //User Should not refer product to friend and see error message.

    public void userUnsuccessfullToReferProductToFriend()
    {
        Utils.assertMessagetext(_unSuccessfull);
        //Only registered customers can use email a friend feature

    }


}
