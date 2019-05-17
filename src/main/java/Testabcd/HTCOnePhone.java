package Testabcd;

import org.openqa.selenium.By;

public class HTCOnePhone extends Utils
{
    private By _AddCart2 = By.xpath("//input[@id='add-to-cart-button-19']");
    private By _greenBar2 = By.xpath("//a[@href='/cart']");
   // private By _shoppingCart = By.xpath("//span[@class='cart-label']");

    //span[@title='Close']
    //Assert the page user on Htc One Nini Blue page
    public void userOnHTCOneMiniBluePhonepage()
    {
        Utils.currentURL("http://demo.nopcommerce.com/htc-one-mini-blue");
    }

    //adding HTC One Mini Blur to shopping Cart
    public void userShouldAddHTCOneToShoppingCart()
    {
        Utils.clickingElement(_AddCart2);

    }

    public void userCanSeeMessageProductAddtoCartInGreenBarOnTop()
    {
        Utils.clickingElement(_greenBar2);
    }

   // public void userCanClickToShoppingCartToOpenBAsket()
    {
      //  Utils.clickingElement(_shoppingCart);
    }
}
