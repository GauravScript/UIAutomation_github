package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabPage {
    WebDriver driver;

    @FindBy(linkText = "Find your first course")
    WebElement startlearning;


    public LabPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickonlearning(){
        startlearning.click();
    }


}
