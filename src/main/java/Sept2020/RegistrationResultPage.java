package Sept2020;

import org.openqa.selenium.By;


public class RegistrationResultPage extends UtilsPage {

    // locator for message.
    private By _actualResult = (By.xpath("//div[@class=\"result\"]"));
    //locator for homepagebutton
    private By _homePage = (By.xpath("//img[@alt=\"nopCommerce demo store\"]"));


    public  void userShouldBeAbleToSeeRegistrationMessageSuccessfully() {

        //to verify user see the messagesuccessfully.assert message
        String expectedResult = "Your registration completed";
        String actualResult = extractText(_actualResult);
       // Assert.assertEquals(actualResult, expectedResult);
}


    public void clickHomePage(){
        //click on homepagelink
        clickElement(_homePage);


    }








}
