package Sept2020;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends UtilsPage {



    //object for homepage
    HomePage homePage = new HomePage();
    //object for registerpage
    RegisterPage registerPage = new RegisterPage();
    //object for registrationpage
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    //object for applemacbookpage
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    //object for emailfriendpage
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    //object for htconem8anroidpage
    HtcOneM8AnroidPage htcOneM8AnroidPage = new HtcOneM8AnroidPage();
    //object for shoppingcartpage
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    //object for checkoutpage
    CheckOutPage checkOutPage = new CheckOutPage();

    @Given("click on register button.")
    public void clickOnRegisterButton() {
        homePage.clickRegisterPage();
    }


    @And("verify user is on registration page.")
    public void verifyUserIsOnRegistrationPage() {

        registerPage.toVerifyuserShouldBeonRgistrationPage();
    }

    @When("user enter all registration details.")
    public void userEnterAllRegistrationDetails() {
        registerPage.UserEnterRegistrationDetails();
    }


    @And("click on homepage.")
    public void clickOnHomepage() {
        registrationResultPage.clickHomePage();
    }

    @And("click on appleMacBook.")
    public void clickOnAppleMacBook() {
        homePage.clickOnAppleMacBook();

    }

    @And("click on email a friend button.")
    public void clickOnEmailAFriendButton() {
        appleMacBookPage.clickEmailAFriendButton();
    }

    @And("enter friend email and message.")
    public void enterFriendEmailAndMessage() {
        emailAFriendPage.enterFriendEmailAndMessage();
    }


    @And("enter friend email and message with user email.")
    public void enterFriendEmailAndMessageWithUserEmail() {
        emailAFriendPage.enterFriendEmailAndMessageWithUserEmail();
    }

    @Then("user able to see a eroor message on the page. ")
    public void userAbleToSeeAErrorMessage(){
        emailAFriendPage.userAbleToSeeErrorMessageOnThePage();
    }


    @Then("user able to see the error message.")
    public void userAbleToSeeTheErrorMessage() {
        emailAFriendPage.userAbleToSeeErrorMessageOnThePage();
    }

    @And("click on HTCONEM8Anroid.")
    public void clickOnHTCONEMAnroid() {

        homePage.clickOnHTCOneM8Anroid();
    }


    @And("click on add to cart.")
    public void clickOnAddToCart() {

        htcOneM8AnroidPage.clickAddToCartButton();
    }


    @And("click on shppingcart button.")
    public void clickOnShppingcartButton() {

        htcOneM8AnroidPage.clickOnShoppingCartButton();
    }


    @And("click on terms and service.")
    public void clickOnTermsAndService() {

        shoppingCartPage.clickOnTermsOfService();
    }

    @And("click on checkout button.")
    public void clickOnCheckoutButton() {
        shoppingCartPage.clickOnCheckoutButton();
    }

    @And("enter details of country,city ,add, postal code and phone.")
    public void enterDetailsOfCountryCityAddPostalCodeAndPhone() {
        checkOutPage.enterCountryCityAdd1PostalcodePhone();

    }


    @And("click on credit card buttton.")
    public void clickOnCreditCardButtton() {

        checkOutPage.clickOnCreditCardButton();
        checkOutPage.clickOnContinueButton2();
    }

    @And("click on credit card dropdown.")
    public void clickOnCreditCardDropdown() {
        checkOutPage.clickOnCreditcarddropdown();

    }


    @Then("user able to see the message. Your registration completed")
    public void userAbleToSeeTheMessageYourRegistrationCompleted() {
        registrationResultPage.userShouldBeAbleToSeeRegistrationMessageSuccessfully();
    }

    @And("enter cardholdername,card number,expiremonth,expireyear,cvvnumber and click on confirm button.")
    public void enterCardholdernameCardNumberExpiremonthExpireyearCvvnumberAndClickOnConfirmButton() {
        checkOutPage.enterCardHolderNameCardNumberExpiremonthExpireyearCvvnumber();
        checkOutPage.clickConfirmButton();
    }

    @Then("user should be on confirm page.")
    public void userShouldBeOnConfirmPage() {
        checkOutPage.toVerifyUserShouldBeOncConfirmPage();
    }

    @And("click on countinue buttonone.")
    public void clickOnCountinueButtonone() {
        checkOutPage.clickOnContinueButton1();
    }




    @Given("User is on homepage and click the HtconeMeightAnroid.")
    public void userIsOnHomepageAndClickTheHtconeMeightAnroid() {
        homePage.clickOnHTCOneM8Anroid();
    }


    @And("enter details of  guest email,country,city ,add, postal code and phone.")
    public void enterDetailsOfGuestEmailCountryCityAddPostalCodeAndPhone() {
        checkOutPage.enterGuestNameEmailCountryCityAdd1PostalcodePhone();
    }

    @And("click on guest checkout button.")
    public void clickOnGuestCheckoutButton() {
        checkOutPage.guestCheckOut();
    }

    @When("user clicks on {string} link from top menu")
    public void userClicksOnLinkFromTopMenu(String category) {
        homePage.clickOnCategory(category);
    }

    @Then("user should able to navigate to {string} successfully")
    public void userShouldAbleToNavigateToSuccessfully(String arg0) {
        

    }
}


