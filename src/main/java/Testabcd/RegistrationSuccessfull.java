package Testabcd;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessfull extends Utils
{
    private By  _registerSuccessful = By.xpath("//div[@class='result']");
    public void registerSuccessfullMessage()
    {
        Utils.assertMessagetext(_registerSuccessful);
    }

}
