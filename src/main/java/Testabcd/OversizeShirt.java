package Testabcd;

import org.openqa.selenium.By;

public class OversizeShirt extends Utils
{
    private By _OversizeShirt = By.xpath("//div[@class='product-name']");
    private By _AddToCart = By.xpath("//input[@id='add-to-cart-button-28']");
    private By _greenBarOnTop = By.xpath("//div[@id='bar-notification']");

    //for refering item to friend
    private  By _emailFriend = By.xpath("//input[@value='Email a friend']");



    public void OversizeTshirtAsser()
    {
        Utils.assertMessagetext(_OversizeShirt);

    }
    public void AddProductToCart1()
    {
        Utils.clickingElement(_AddToCart);
    }

    // asserting the green bar of product add to cart conformation

    public void userShouldSeeGreenBarOnTop()
    {
        Utils.assertMessagetext(_greenBarOnTop);

    }
        //Refering Item to friend
    public void clickOnEmailFriend()
    {
        Utils.clickingElement(_emailFriend);
    }
    



}
