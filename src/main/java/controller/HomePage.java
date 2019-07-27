package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ScriptBase {

    @FindBy(id = "search_query_top")
    WebElement searchQuerytop;
    @FindBy(name = "submit_search")
    WebElement submitbutton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

public void searchBox(String input, WebDriver driver,String quantity){
        searchQuerytop.clear();
        searchQuerytop.sendKeys(input);
        submitbutton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();

}
    public void searchBoxTwo(String input, WebDriver driver,String quantity){
        searchQuerytop.clear();
        searchQuerytop.sendKeys(input);
        submitbutton.click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]//span[contains(text(),'7 results have been found.')]")).isDisplayed();

    }

    public void PopularBestsellers(String types , WebDriver driver){

        driver.findElement(By.xpath("//*[@id='home-page-tabs']/li/a[@class='"+types+"']")).isDisplayed();

    }

    public void InformationTree(String title , WebDriver driver){

        driver.findElement(By.xpath("//*[@id='block_various_links_footer']/ul/li/a[@title='"+title+"']")).isDisplayed();

    }
}
