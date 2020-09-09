package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends UtilsPage {
    //locator for emailafriendpage
    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");
    //locator for friendemail
    private By _friendEmail = By.id("FriendEmail");
    //locator for message
    private  By _message = By.id("PersonalMessage");
    //locator for sendemailbutton
    private  By _sendEmailButton = By.name("send-email");
    //locator for message. assert the message."Your message has been sent."
    private  By _actualResult1 = By.xpath("//div[@class=\"result\"]");
    //locator for useremail
    private  By _userEmail = By.id("YourEmailAddress");
    //locator for message. assert the message."Only registered customers can use email a friend feature"
    private By _actualResult2 = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");


    public void toVerifyUserShouldBeOnEmailAFriendPage() {

        //to verify user on email a friend page.assert the page
        String actualResult = extractText(_actualResult);
        String expectedResult = ("Email a friend");
        Assert.assertEquals(actualResult,expectedResult);
    }



    public void enterFriendEmailAndMessage(){
        //enter friendemail,personalmessage
         enterText(_friendEmail, getProperty("FriendEmail"));
         enterText(_message, getProperty("PersonalMessage"));
         //click on sendemailbutton
        clickElement(_sendEmailButton);

    }

    public void userAbleToSeeMessageSuccessfully(){

        //assert the message to verify message sent
        String actualResult1 = extractText(_actualResult1);
        String expectedResult1 = ("Your message has been sent.");
        Assert.assertEquals(actualResult1,expectedResult1);

    }
    public void enterFriendEmailAndMessageWithUserEmail(){
        //enter friendemail,useremail,personalmessage,
        enterText(_friendEmail, getProperty("FriendEmail"));
        enterText(_userEmail, getProperty("UserEmail"));
        enterText(_message, getProperty("PersonalMessage"));
        //click on sendemailbutton
        clickElement(_sendEmailButton);

    }
    public  void userAbleToSeeErrorMessageOnThePage(){

        //assert the message to verify user see the error message
        String actualResult2 = extractText(_actualResult2);
        String expectedResults2 =("Only registered customers can use email a friend feature");
        Assert.assertEquals(actualResult2,expectedResults2);







    }











}