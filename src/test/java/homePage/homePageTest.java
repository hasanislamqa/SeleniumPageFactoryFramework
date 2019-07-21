package homePage;

import base.ScriptBase;
import controller.HomePage;
import controller.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homePageTest extends ScriptBase {

    HomePage homePage;

    @BeforeTest
    public void beforeTest() {
        init();
    }

    @Test
    public void verifyHatSearch() {
        homePage = new HomePage(driver);
        homePage.searchBox("Hat",driver,"7");


    }

    @Test
    public void verifySleeveSearch() {
        homePage = new HomePage(driver);
        homePage.searchBox("Sleeve",driver,"4");


    }
}
