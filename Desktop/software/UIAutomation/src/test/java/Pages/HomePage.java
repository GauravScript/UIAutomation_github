package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

        WebDriver driver;

        //@FindBy(how = How.LINK_TEXT, using="Enterprise")
        //@FindBy(xpath=".//a[@href = '/enterprise']")
        @FindBy(linkText = "Enterprise")
        public List<WebElement> enterPrise;

        public HomePage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void clickOnEnterprice()
        {
            //enterPrise = driver.findElements(By.xpath(".//a[@href = '/enterprise']"));
            enterPrise.get(0).click();
        }
}
