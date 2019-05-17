package Testabcd;



import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
        currentURL("http://demo.nopcommerce.com");
    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {//ITestResult is inbulit interface and getStatus will get status of the failure testcase screenshot
        if (ITestResult.FAILURE == result.getStatus())
        {
            //result.getname will capture the screenshot of the method that fail and give that method name.
            browserScreenshot(result.getName());
        }

        driver.quit();
    }


}
