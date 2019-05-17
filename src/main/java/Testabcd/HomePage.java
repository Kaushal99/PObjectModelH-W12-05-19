package Testabcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _homepage = By.xpath("//div[@class='menu-toggle']");
    private By _currencyUSDollar = By.xpath("//select[@name='customerCurrency']");
    private By _currencyEuro = By.xpath("//select[@name='customerCurrency']");
    private By _euroSign = By.xpath("//*[contains(text(),'Ђ')]");

    private By _register = By.xpath("//a[@class='ico-register']");

    private By _apparel = By.xpath("//a[@href='/apparel']");
    private By _clothing = By.xpath("//a[@href='/clothing']");

    private By _electronics = By.xpath("//a[@href ='/electronics']");
    private By _cellPhone = By.xpath("//a[@href='/cell-phones']");



    public void verifyUserOnHomePage() {

        Utils.assertCurrrentURL("http://demo.nopcommerce.com/");
    }

    public void verityCurrency() {
        String browser = loadProp.getProperty("browser");
        Utils.clickingElement(_currencyUSDollar);
    }


    public void verifyCurrencyEuro() {
        Utils.enterTextName(_currencyEuro, "Euro");
    }


    public void userShouldSeeEuroSign() {

        Utils.assertMessagetext(_euroSign);

    }

    public void registrationButton() {
        Utils.clickingElement(_register);

    }

    //hover to apparels to get to clothing for shopping list
    public void selectApparels() {
        Utils.dropHoverMethod(_apparel);
    }

    //selecting Clothing from Apparel by drop down
    public void selectClothing() {
        Utils.dropClickHover(_clothing);
    }

    public void selectElectronicsToAddAnotherProduct() {
        Utils.dropHoverMethod(_electronics);
    }

    public void userShopuldNavigateToCellPhone()
    {
        Utils.dropClickHover(_cellPhone);
    }




}