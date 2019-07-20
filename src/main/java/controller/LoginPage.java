package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    @FindBy(xpath = "//*[@id='header']//a[@title='Log in to your customer account']")
    WebElement siginButton;
    @FindBy(id = "email")
    WebElement emailSendKey;
    @FindBy(id = "passwd")
    WebElement passwordSendKey;
    @FindBy(css = "#SubmitLogin > span")
    WebElement signinSubmitButton;
    @FindBy(linkText = "Zaman Dewan")
    WebElement signInSucessful;
    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement loginFailMessage;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signout;
    @FindBy(id = "email_create")
    WebElement emailCreateInput;
    @FindBy(css = "#SubmitCreate > span")
    WebElement submitCreateAccountButton;
    @FindBy(xpath = "//*[@id='create_account_error']")WebElement invalidEmailErrorMessage;

    @FindBy(id="id_gender1")
    WebElement nameTitle;

    @FindBy(id="customer_firstname")
    WebElement customerFirstname;
    @FindBy(id="customer_lastname")
    WebElement customeLstname;
    @FindBy(id="email")
    WebElement customerSignupEmail;

    @FindBy(id="passwd")
    WebElement customerSignupPass;
    @FindBy(css="#submitAccount > span")
    WebElement signupRegister;
    @FindBy(css="#center_column > div > p")
    WebElement siginupError;







    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void invalidSigin() {
        siginButton.click();
        emailSendKey.sendKeys("abct@gmail.com");
        passwordSendKey.sendKeys("ad123098");
        signinSubmitButton.click();
        Assert.assertEquals(loginFailMessage, loginFailMessage);

    }

    public void validSigin() {
        siginButton.click();
        emailSendKey.sendKeys("futureitgroup@gmail.com");
        passwordSendKey.sendKeys("admin123");
        signinSubmitButton.click();
        Assert.assertEquals(signInSucessful, signInSucessful);

    }

    public void validSigninWithLogout() {
        signout.click();


    }

    public void invalidCreateAccount(String email){
        siginButton.click();
        emailSendKey.sendKeys(email);
        submitCreateAccountButton.click();
        Assert.assertEquals(invalidEmailErrorMessage,invalidEmailErrorMessage);




    }

    public void invalidSignup(String email,WebDriver driver,String firstname,String lastname,String password){
        siginButton.click();
        emailCreateInput.sendKeys(email);
        submitCreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        nameTitle.click();
        customerFirstname.sendKeys(firstname);
        customeLstname.sendKeys(lastname);
        customerSignupEmail.sendKeys(email);
        customerSignupPass.sendKeys(password);
        signupRegister.click();
        Assert.assertEquals(siginupError,siginupError);
    }
}