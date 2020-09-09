package Sept2020;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public  void setUpBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

    }

    @After
    public  void closeBrowser(){
        //driver.close();
    }
















}
