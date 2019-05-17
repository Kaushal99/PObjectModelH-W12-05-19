package Testabcd;

import org.openqa.selenium.By;

public class ClothingPriceHighToLow extends Utils
{
    private By _oversizeTShirt = By.xpath("//a[contains(text(),'Oversized')]");



    public void userShouldSeeClothingPricelistHighToLow()
    {
        //asserting the price hight to low page for clothing category
        Utils.assertCurrrentURL("http://demo.nopcommerce.com/clothing?orderby=11");
    }

    public void userAddProductFirstToCart()
    {

        Utils.clickingElement(_oversizeTShirt);

    }

}
