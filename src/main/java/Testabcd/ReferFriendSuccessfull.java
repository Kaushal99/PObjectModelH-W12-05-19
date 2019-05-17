package Testabcd;

import org.openqa.selenium.By;

public class ReferFriendSuccessfull extends Utils
{
    private By _referFriendSuccess = By.xpath("//div[@class='result']");

        //asserting the page messange sent successfully


    public void userShouldSeeMessageToFriendSuccessfullySend()
    {
        Utils.assertMessagetext(_referFriendSuccess); //Your message has been sent

    }
}
