package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
    WebDriver driver;

    @FindBy(name = "login")
    WebElement login;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath= ".//div[@class = 'container-lg px-2']")
    WebElement msg;

    @FindBy(xpath = ".//input[@type='submit']")
    WebElement signin;
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void insertusername(){
        login.click();
        login.sendKeys("testing");
        
    }
    public void insertpassword(){
        password.click();
        password.sendKeys("testing");
    }


    public String getmassege() {
        return msg.getText();
    }

    public void signin() {
        signin.click();
    }
}
