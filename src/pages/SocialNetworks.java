package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SocialNetworks {

    private static String facebookXpath = "//li[@class='facebook']//a";
    private static String twitterXpath = "//li[@class='twitter']//a";
    private static String youTubeXpath = "//li[@class='youtube']//a";
    private static String googlePlusXpath = "//li[@class='google-plus']//a";

    public static WebElement getFacebook(WebDriver driver) {
        return driver.findElement(By.xpath(facebookXpath));
    }

    public static void clickFacebook(WebDriver driver) {
        getFacebook(driver).click();
    }

    public static WebElement getTwitter(WebDriver driver) {
        return driver.findElement(By.xpath(twitterXpath));
    }

    public static void clickTwitter(WebDriver driver) {
        getTwitter(driver).click();
    }

    public static WebElement getYouTube(WebDriver driver) {
        return driver.findElement(By.xpath(youTubeXpath));
    }

    public static void clickYouTube(WebDriver driver) {
        getYouTube(driver).click();
    }

    public static WebElement getGooglePlus(WebDriver driver) {
        return driver.findElement(By.xpath(googlePlusXpath));
    }

    public static void clickGooglePlus(WebDriver driver) {
        getGooglePlus(driver).click();
    }
}