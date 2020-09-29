package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class MainTests {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(HomePage.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

//        Women.hoverWoman(driver);
//        Women.clickSummerDresses(driver);
//
//        driver.navigate().back();
//
//        Dresses.HoverDresses(driver);
//        Dresses.clickSummerDresses(driver);
//        SummerDressesPage.hoverSecondDress(driver);
//        SummerDressesPage.clickDressColor(driver);
//
//        SummerDressesPage.clickQuantity(driver);
//        SummerDressesPage.chooseSize(driver);
//        SummerDressesPage.clickAddToCart(driver);
//        SummerDressesPage.clickPopUpCheckout(driver);
//        SummerDressesPage.hoverCart(driver);

//        SearchBar.inputSearchBar(driver,"Yellow");
//        SearchBar.clickSearch(driver);

//
//        SocialNetworks.clickFacebook(driver);
//        driver.navigate().back();
//        SocialNetworks.clickTwitter(driver);
//        driver.navigate().back();
//        SocialNetworks.clickYouTube(driver);
//        driver.navigate().back();
//        SocialNetworks.clickGooglePlus(driver);
//        driver.navigate().back();

        Thread.sleep(2000);
        driver.close();
    }
}