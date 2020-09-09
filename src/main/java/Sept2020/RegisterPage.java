package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends UtilsPage {

    //locator for useronregisterpage
    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");
    //locator for firstname
    private By _firstname = By.id("FirstName");
    //licator for lastname
    private By _lastname = By.xpath("//input[@name=\"LastName\"]");
    //locator for email
    private By _Email = By.id("Email");
    //locator for password
    private By _password = By.id("Password");
    //locator for confirmpassword
    private By _confirmpassword = By.xpath("//input[@data-val-equalto-other='*.Password']");
    //locator for registerbutton
    private By _registerButton = By.xpath("//input[@value=\"Register\"]");




    public void  toVerifyuserShouldBeonRgistrationPage() {
        //verify user on registerpage assert the page
        String actualR = extractText(_actualResult);
        String expected = ("Register");
        Assert.assertEquals(actualR,expected);
    }


    public void UserEnterRegistrationDetails(){
        //enter the details on registerpage
        //enter firstname
        enterText(_firstname, getProperty("firstname"));
        //enter  lastname
        enterText(_lastname, getProperty("lastname"));
        //enter email
        enterText(_Email, generateEmail());
        //enter password
        enterText(_password,getProperty("password"));
        //enter confirmpassword
        enterText(_confirmpassword, getProperty("confirmpassword"));
        //click on registerbutton
        clickElement(_registerButton);




    }










}
