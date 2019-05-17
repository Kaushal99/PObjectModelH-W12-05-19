package Testabcd;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils
{
    LoadProp loadProp = new LoadProp();
    private By _emailFriend = By.xpath("//div[@class='page-title']");
    private By _friendemail = By.xpath("//input[@class='friend-email']");

    private By _personalmessage = By.xpath("//textarea[@class='your-email']");
    private By _sendEmailButton = By.xpath("//input[@name='send-email']");


    private String timeStamp = creatTimeStamp();
    public void userShouldSeeEmailAFriendPage()
    {
        Utils.assertMessagetext(_emailFriend);
    }
    //entering details to refer to friend

    public void userShouldAbleToFillAllDetailsToReferAFriend()
    {
        Utils.enterTextInField(_friendemail,loadProp.getProperty("friendEmail"));

        Utils.enterTextInField(_personalmessage,loadProp.getProperty("personalMessage"));
        Utils.clickingElement(_sendEmailButton);


    }



}
