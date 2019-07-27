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
    @Test
    public void verifyPopular() {
        homePage = new HomePage(driver);
        homePage.PopularBestsellers("homefeatured",driver);


    }
    @Test
    public void verifyBestsellers() {
        homePage = new HomePage(driver);
        homePage.PopularBestsellers("blockbestsellers",driver);


    }
    @Test
    public void verifySpecial() {
        homePage = new HomePage(driver);
        homePage.InformationTree("Specials",driver);


    }
    @Test
    public void verifyNewProduct() {
        homePage = new HomePage(driver);
        homePage.InformationTree("New products",driver);


    }
    @Test
    public void verifyBestSellers() {
        homePage = new HomePage(driver);
        homePage.InformationTree("Best sellers",driver);


    }
}
