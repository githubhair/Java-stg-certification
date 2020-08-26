package challenge1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class challenge1 {
    public WebDriver driver;
    @BeforeSuite
    public void startSuite() throws Exception{

    }

    @AfterSuite
    public void stopSuite() throws Exception{
        System.out.println("All Done!!!");
    }

    @BeforeClass
    public void startClass() throws Exception{
        System.setProperty("webdriver.chrome.driver", "bin/chromedriver");
        driver = new ChromeDriver();

    }

    @AfterClass
    public void stopClass()throws Exception{
        driver.quit();
    }

    @BeforeMethod
        public void beforeMethod() throws Exception {

    }

    @AfterMethod
        public void afterMethod() throws Exception{

    }

    @Test()
    public void goToGoogle() throws Exception{
        driver.get("https://google.com");
    }

    @Test()
    public void verifyGoogleTitle() throws Exception{
            Assert.assertEquals((driver.getTitle()), "Google");
        }
}
