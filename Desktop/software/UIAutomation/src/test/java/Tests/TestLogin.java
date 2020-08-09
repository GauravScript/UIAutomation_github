package Tests;

import Common.BaseClass;
import Pages.EnterprisePage;
import Pages.HomePage;
import Pages.LabPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseClass {
    HomePage homePage;
    EnterprisePage enterprisePage;
    LabPage labpage;
    LoginPage loginPage;

    @Test
    public void Login_Test() {
        homePage = new HomePage(driver);
        homePage.clickOnEnterprice();

        enterprisePage = new EnterprisePage(driver);
        enterprisePage.clickonenterpriselab();

        labpage = new LabPage(driver);
        labpage.clickonlearning();

        loginPage = new LoginPage(driver);
        loginPage.insertusername();
        loginPage.insertpassword();
        loginPage.signin();
        String msg = loginPage.getmassege();
        
        Assert.assertEquals(msg,"Incorrect username or password.");
    }
}
