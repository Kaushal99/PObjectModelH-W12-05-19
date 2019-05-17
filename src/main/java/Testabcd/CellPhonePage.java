package Testabcd;

import org.openqa.selenium.By;

public class CellPhonePage extends Utils
{
    private By _cellPhone = By.xpath("//div[@class='page-title']");
    private By _HTCOne = By.xpath("//a[@href='/htc-one-mini-blue']");

    public void userOnCellPhonePage()
    {

        Utils.assertMessagetext(_cellPhone);
    }

    public void userShouldSelectHTCOnePhone()
    {
        Utils.clickingElement(_HTCOne);
    }

}
