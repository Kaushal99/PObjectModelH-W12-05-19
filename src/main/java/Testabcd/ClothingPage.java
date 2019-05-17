package Testabcd;

import org.openqa.selenium.By;

public class ClothingPage extends Utils
{

    private By _onClothingPage = By.xpath("//div[@class='page-title']");
    private By _position = By.xpath("//select[@id='products-orderby']");
    private By _priceHighToLow = By.xpath("//select[@id='products-orderby']");



    public void userOnClothingCategory()
    {
       Utils.assertMessagetext(_onClothingPage);
    }

    public void userShouldClickOnPosition()
    {
        Utils.clickingElement(_position);
    }

    public void userShouldSelectPriceHighToLow()
    {
        Utils.enterTextName(_priceHighToLow,"Price: High to Low");
    }


}
