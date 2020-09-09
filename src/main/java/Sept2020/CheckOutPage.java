package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutPage extends UtilsPage {

    //locator for checkout page
    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");
    //locator for countrydropdown
    private  By _dropDownCountry = By.xpath("//select[@data-trigger=\"country-select\"]");
    //locator for city
    private  By _enterCity = By.id("BillingNewAddress_City");
    //locator for address1
    private  By _enterAddress1 = By.id("BillingNewAddress_Address1");
    //locator for postalcode
    private  By _enterPostalcode = By.id("BillingNewAddress_ZipPostalCode");
    //locator for phoneno
    private  By _enterPhoneNo = By.id("BillingNewAddress_PhoneNumber");
    //locator for continuebutton oncheckoutpage
    private  By _clickOnContinueButton = By.id("billing-buttons-container");
    //locator for continue button1
    private  By _clickOnContinueButton1 = By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    //locator for creditcard
    private  By _clickOnCreditCardButton = By.id("paymentmethod_1");
    //locator for continuebutton after click creditcard
    private  By _clickContinueButton2 = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    //locator for creditcard dropdown to select creditcard
    private By _dropdownCreditCard = By.xpath("//select[@name=\"CreditCardType\"]");
    //locator for card holdername
    private By _enterCardHolderName = By.id("CardholderName");
    //locator for cardnumber
    private  By _enterCardNumber = By.id("CardNumber");
    //locator for cvv number
    private  By _CVVNumber = By.id("CardCode");
    //locator for expiremonth
    private  By _expireMonth = By.id("ExpireMonth");
    //locator for expireyear
    private  By _expireYear = By.id("ExpireYear");
    //locator for continuebutton after fill card detail
    private  By _clickContinueButton3 = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    //locator for confirm button
    private  By _confirmButton = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");
    //locator for confirm page
    private By _actualResult1 = By.xpath("//div[@class=\"page-title\"]");
    //locator for guestcheckoutbutton
    private  By _guestUser = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");
    //locator for guestfirst name
    private  By _guestFirstName = By.id("BillingNewAddress_FirstName");
    //locator for guestlastname
    private  By _guestLastName = By.id("BillingNewAddress_LastName");
    //locator for guestemail
    private  By _guestEmail = By.id("BillingNewAddress_Email");


    public void toVerifyUserShouldBeOnCheckOutPage(){

        //assert the checkoutpage
        String actualResult = extractText(_actualResult);
        String expectedResult = ("Checkout");
        Assert.assertEquals(actualResult, expectedResult);
    }



    public void enterCountryCityAdd1PostalcodePhone() {
        //enter detalis
        selectByValue(_dropDownCountry, "133");
        enterText(_enterCity, getProperty("City"));
        enterText(_enterAddress1, getProperty("Address1"));
        enterText(_enterPostalcode, getProperty("Postalcode"));
        enterText(_enterPhoneNo, getProperty("PhoneNo"));

        //click on continue button
        clickElement(_clickOnContinueButton);
        sleep(5000);
    }

    public void clickOnContinueButton1(){
        //click on continuebutton1
        clickElement(_clickOnContinueButton1);
        sleep(5000);
    }


    public void clickOnCreditCardButton(){
        //click on creditcardbutton
        sleep(3000);
        clickElement(_clickOnCreditCardButton);
    }

    public void clickOnContinueButton2(){
        //click on continue button2
        clickElement(_clickContinueButton2);
        sleep(3000);
    }

    public void clickOnCreditcarddropdown(){
        //click on creditdropdown and select master card
        selectByVisibleText(_dropdownCreditCard, "Master card");
    }


    public void enterCardHolderNameCardNumberExpiremonthExpireyearCvvnumber(){

        //enter card details. details on testdataconfig.properties
        enterText(_enterCardHolderName, getProperty("CardHolderName"));
        enterText(_enterCardNumber,getProperty("cardnumber"));
        selectByValue(_expireMonth,"10");
        selectByValue(_expireYear,"2023");
        enterText(_CVVNumber,getProperty("CVV"));
        //click on continue button after fillcard details
        clickElement(_clickContinueButton3);
        sleep(3000);
    }



    public void clickConfirmButton(){
        //click on confirmbutton
        clickElement(_confirmButton);
    }


    public void toVerifyUserShouldBeOncConfirmPage(){

        //to verify user on confirm page.
        String actualResult1 = extractText(_actualResult1);
        String expectedResult1 = ("Checkout");
        System.out.println(actualResult1);

        Assert.assertEquals(actualResult1, expectedResult1);
    }

    public  void guestCheckOut(){
        //click on guestcheckout
        clickElement(_guestUser);
    }

    public void enterGuestNameEmailCountryCityAdd1PostalcodePhone() {
        //enter user details
        enterText(_guestFirstName,"Vinay");
        enterText(_guestLastName, "Patel");
        enterText(_guestEmail, "vinaypatel@gmail.com");
        selectByValue(_dropDownCountry, "133");
        enterText(_enterCity, getProperty("City"));
        enterText(_enterAddress1, getProperty("Address1"));
        enterText(_enterPostalcode, getProperty("Postalcode"));
        enterText(_enterPhoneNo, getProperty("PhoneNo"));
        //click on continue button after fill user deatils
        clickElement(_clickOnContinueButton);
        sleep(5000);
    }

}
