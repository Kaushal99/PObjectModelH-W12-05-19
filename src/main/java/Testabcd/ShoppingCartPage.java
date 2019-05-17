package Testabcd;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils
{
    private By _shoppingCart =  By.xpath("//div[@class='page-title']");

    //Asserting Shopping cart page

    public void userShoulcSeeAllProductAddToCart()
    {
        Utils.assertMessagetext(_shoppingCart);
    }



}
