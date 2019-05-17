package Testabcd;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils
{
    LoadProp loadprop = new LoadProp();

    public void setUpBrowser()
    {
        String browser = loadprop.getProperty("browser");


        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/Resources/BrowserFactory/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobar");
            options.addArguments("__incognito");


            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            //System.setProperty("webdriver.gecko.driver","src/test/Resources/BrowserDrivers/geckodriver.exe");

            System.setProperty("webdriver.gecko.driver", "src/test/Resources/BrowserFactory/geckodriver.exe");

//Now you can Initialize marionette driver to launch firefox
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            //WebDriver driver = new MarionetteDriver(capabilities);

            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();
        }
        else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver","src/test/Resources/BrowserFactory/IEDriverServer.exe");


            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();

        }
        else
        {
            System.out.println("Browser type enter is wrong");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



}
