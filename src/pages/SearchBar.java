package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {

    private static String searchBarPath = "//input[@id='search_query_top']";
    private static String searchXpath = "//button[@name='submit_search']";


    public static WebElement getSearchBar(WebDriver driver) {
        return driver.findElement(By.xpath(searchBarPath));
    }

    public static void inputSearchBar(WebDriver driver, String input) {
        getSearchBar(driver).sendKeys(input);
    }

    public static WebElement getSearch(WebDriver driver) {
        return driver.findElement(By.xpath(searchXpath));
    }

    public static void clickSearch(WebDriver driver) {
        getSearch(driver).click();
        getSearch(driver).sendKeys(Keys.PAGE_DOWN);
    }
}