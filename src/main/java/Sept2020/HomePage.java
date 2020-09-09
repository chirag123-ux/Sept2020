package Sept2020;

import org.openqa.selenium.By;

public class HomePage extends UtilsPage{

    //locator for registerbutton
    private By _registerLink = By.xpath("//a[@class='ico-register']");
    //locator for applemacbook
    private By _appleMacBook = By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']");
    //locator for htconeM8
    private By _hTCOneM8Android = By.xpath("//a[@title=\"Show details for HTC One M8 Android L 5.0 Lollipop\"]");



    public void clickRegisterPage(){
        //click on register
        clickElement(_registerLink);

    }

    public  void clickOnAppleMacBook(){
        //click on applemacbook
        clickElement(_appleMacBook);

    }

    public void clickOnHTCOneM8Anroid(){

        //Click on htconem8Anroid{
        clickElement(_hTCOneM8Android);

    }

    public void clickOnCategory(String category){
        clickElement(By.linkText(category));

    }



}








