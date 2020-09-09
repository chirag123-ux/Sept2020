package Sept2020;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends UtilsPage {

    public void setUpBrowser() {
        String browser = getProperty("Browser");

        //setup browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver85.exe");

            BasePage.driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            BasePage.driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("ie")) {

            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            BasePage.driver = new InternetExplorerDriver();
        }
        else {
            System.out.println("Browser name is empty or typed wrong:" + browser);
        }
    }
}















