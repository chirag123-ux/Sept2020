package Sept2020;

import org.openqa.selenium.By;


public class AppleMacBookPage extends UtilsPage{

    //locator for user on apple macbook page
    private By _actualResult =By.xpath("//div[@class=\"product-name\"]");
    //locator for email a friend button
    private  By _emailAFriendButton = By.xpath("//input[@value=\"Email a friend\"]");



    public void toVerityUsershouldBeOnAppleMacBookPage() {

        //to verify user on applemacbookpage. asssert page
        String actualResult = extractText(_actualResult);
        String expectedResult = ("Apple MacBook Pro 13-inch");

        //Assert.assertEquals(actualResult,expectedResult);
    }

    public void clickEmailAFriendButton(){
        //click on email a friend button
        clickElement(_emailAFriendButton);



    }





}
