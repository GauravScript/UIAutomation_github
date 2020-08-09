package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    //Logger log = Logger.getLogger("devpinoyLogger");
    @BeforeClass
    public void setDriver(ITestContext testContext){
        String browser=testContext.getCurrentXmlTest().getParameter("browserType");
        //log.info("browser intilization");
        driver=getDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.URL2);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
        }

        return driver;
    }

}
