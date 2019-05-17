package Testabcd;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfull registrationSuccessfull = new RegistrationSuccessfull();
    ClothingPage clothingPage = new ClothingPage();
    ClothingPriceHighToLow clothingPriceHighToLow = new ClothingPriceHighToLow();
    OversizeShirt oversizeShirt = new OversizeShirt();

    CellPhonePage cellPhonePage = new CellPhonePage();

    HTCOnePhone htcOnePhone = new HTCOnePhone();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    EmailAFriend emailAFriend = new EmailAFriend();

    ReferFriendSuccessfull referFriendSuccessfull = new ReferFriendSuccessfull();

    UnRegisterReferFriend unRegisterReferFriend = new UnRegisterReferFriend();

    @Test //User Should Able to see Homepage in browser
    public void userShouldNavigateToHomePage()
    {

        homePage.verifyUserOnHomePage();
    }

    @Test //User Should able to change currency in left corner of the site Us to Euro
    public void userShouldBeAbleToChangeCurrency()
    {
        //to verity the currency on top left corner showing
        homePage.verityCurrency();
        //To verify the currency Euro is present in dropdown or not
        homePage.verifyCurrencyEuro();
        //After selecting Euro the amount of product shows in Euro currency.
        homePage.userShouldSeeEuroSign();

    }

        //user should able to register to site by filling registration form all mendatory details
    @Test
    public void userShouldBeAbleToRegisterSuccessfully()
    {
        //user clicking to Register to register the user
        homePage.registrationButton();

        //verifying registration page by calling assert from RegistrationPage class
        registrationPage.verifyUserOnRegistrationPage();

        //Filling all compurlsary details to register by calling from .properties...
        registrationPage.userEnterRegistrationDetails();

        //verify user register successfully
        registrationSuccessfull.registerSuccessfullMessage();
    }


    //User Should Able to sort Price of product High to Low
    @Test
    public void userShouldBeAbleToSelectProductPriceHighToLowForClothing()
    {
        homePage.selectApparels();
        homePage.selectClothing();

        clothingPage.userOnClothingCategory();
        clothingPage.userShouldClickOnPosition();
        clothingPage.userShouldSelectPriceHighToLow();
    }

    //User should abel to add 2 products to his shopping cart.
    @Test
    public void userShouldAbleToAdd2ProductsToShoppingBasket()
    {
        homePage.selectApparels();
        homePage.selectClothing();

        clothingPage.userOnClothingCategory();
        clothingPage.userShouldClickOnPosition();
        clothingPage.userShouldSelectPriceHighToLow();

        //new clothing price list high to low
        clothingPriceHighToLow.userShouldSeeClothingPricelistHighToLow();
        clothingPriceHighToLow.userAddProductFirstToCart();

        oversizeShirt.OversizeTshirtAsser();
        oversizeShirt.AddProductToCart1();
        oversizeShirt.userShouldSeeGreenBarOnTop();

        homePage.selectElectronicsToAddAnotherProduct();
        homePage.userShopuldNavigateToCellPhone();

        //new page to navigate to buy mobile phone
        cellPhonePage.userOnCellPhonePage();
        cellPhonePage.userShouldSelectHTCOnePhone();

        //new page HTC one Mini Blue Mobile

        htcOnePhone.userOnHTCOneMiniBluePhonepage();
        htcOnePhone.userShouldAddHTCOneToShoppingCart();
        //user clicking shopping cart to see 2 products add to basket or not....
        htcOnePhone.userCanSeeMessageProductAddtoCartInGreenBarOnTop();

        //user clicking shopping cart to see 2 products add to basket or not....


        shoppingCartPage.userShoulcSeeAllProductAddToCart();

    }

    //Register User should abel to refer product to friend
    @Test
    public void registerUserShouldAbleToReferProductToFriend()
    {
        //user clicking to Register to register the user
        homePage.registrationButton();

        //verifying registration page by calling assert from RegistrationPage class
        registrationPage.verifyUserOnRegistrationPage();

        //Filling all compurlsary details to register by calling from .properties...
        registrationPage.userEnterRegistrationDetails();

        //verify user register successfully
        registrationSuccessfull.registerSuccessfullMessage();


        homePage.selectApparels();
        homePage.selectClothing();


        clothingPage.userOnClothingCategory();
        clothingPage.userShouldClickOnPosition();
        clothingPage.userShouldSelectPriceHighToLow();

        clothingPriceHighToLow.userAddProductFirstToCart();

        oversizeShirt.clickOnEmailFriend();

        emailAFriend.userShouldSeeEmailAFriendPage();
        emailAFriend.userShouldAbleToFillAllDetailsToReferAFriend();

        referFriendSuccessfull.userShouldSeeMessageToFriendSuccessfullySend();

    }
        //Un-Register User cant refer Product to friend

    @Test
    public void unregisterUserShouldNotAbleToReferProductToFreind()
    {
        homePage.selectApparels();
        homePage.selectClothing();


        clothingPage.userOnClothingCategory();
        clothingPage.userShouldClickOnPosition();
        clothingPage.userShouldSelectPriceHighToLow();

        clothingPriceHighToLow.userAddProductFirstToCart();

        oversizeShirt.clickOnEmailFriend();

       unRegisterReferFriend.userEmailAFriendPage();
       unRegisterReferFriend.unRegisterUserShouldAbleToFillAllDetailsToReferAFriend();
       unRegisterReferFriend.userUnsuccessfullToReferProductToFriend();

    }

}
