package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HtcOneM8AnroidPage extends UtilsPage {

    //locator for user on htconem8anroidpage
   private By _actualresult = By.xpath("//h1[@itemprop=\"name\"]");
   //locator for product add to cart
    private By _addToCart = By.xpath("//input[@id=\"add-to-cart-button-18\"]");
    //locator for shoppingcartbutton
    private  By _shoppingCartButton = By.xpath("//a[@class=\"ico-cart\"]");



   public void toVerifyUserShouldBeOnHtcOneM8AnroidPage(){

       //to verify user on htconem8anroidpage assert the page
       String actualResult = extractText(_actualresult);
        String expectedResult = ("HTC One M8 Android L 5.0 Lollipop");
        Assert.assertEquals(actualResult, expectedResult);
    }



    public void clickAddToCartButton(){
        //click addto cart button
       clickElement(_addToCart);

   }

    public void clickOnShoppingCartButton(){
        //click shoppingcartbutton
        clickElement(_shoppingCartButton);
    }


}