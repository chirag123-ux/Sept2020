package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends UtilsPage {

    //locator for user on shoppingcartpage
    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");
    //locator for termsof service
    private By _clickOnTermsOfService = By.xpath("//label[@for=\"termsofservice\"]");
    //locator for checkoutbutton
    private By _clickOnCheckoutButton = By.id("checkout");



    public void toVerifyUserShouldBeOnShoppingCartPage(){
        //to verify user on shoppingcartpage assert page
        String actualResult = extractText(_actualResult);
        String expectedResult = ("Shopping cart");
        Assert.assertEquals(actualResult, expectedResult);
    }



    public void clickOnTermsOfService(){
        //click on terms of service
        clickElement(_clickOnTermsOfService);
    }


    public void clickOnCheckoutButton(){
        //click on checkoutbutton
        clickElement(_clickOnCheckoutButton);
    }







}
