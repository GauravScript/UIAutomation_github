package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterprisePage {
    WebDriver driver;

    @FindBy(xpath = ".//a[@href='https://lab.github.com']")
    WebElement enterpriseLab;

    @FindBy(xpath = ".//a[@href='https://services.github.com']")
    WebElement developerled;

    public EnterprisePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickonenterpriselab(){
        scrollToElement();
        enterpriseLab.click();
    }
    public void scrollToElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", developerled);
    }
}
