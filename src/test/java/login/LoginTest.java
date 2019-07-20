package login;

import base.ScriptBase;
import controller.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @BeforeTest
    public void beforeTest(){
        init();
    }

    @Test
    public void verifyInvalidLogin(){
        loginPage=new LoginPage(driver);
        loginPage.invalidSigin();


    }
    @Test
    public void verifyValidLogin(){
        loginPage=new LoginPage(driver);
        loginPage.validSigin();


    }
    @Test
    public void verifyValidLoginWithLogout(){
        loginPage=new LoginPage(driver);
        loginPage.validSigninWithLogout();


    }

    @Test
    public void invalidCreateAccountVerify(){
        loginPage=new LoginPage(driver);
        loginPage.invalidCreateAccount("ggghhhh");


    }
    @Test
    public  void invalidSignup(){
        loginPage=new LoginPage(driver);
        loginPage.invalidSignup("hasanvai@gmail.com",driver,"Hasan","Vai","123456");


    }
    @AfterTest
    public void closeBrowser(){
        //driver.close();
        //driver.quit();
    }
}
