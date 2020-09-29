package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchBar;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestSearchBar {

    private static WebDriver driver = new ChromeDriver();
    private static SoftAssert sa;

    @BeforeClass
    public static void settings() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @BeforeMethod
    public static void setDriver() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        sa = new SoftAssert();
    }

    @AfterClass
    public static void closeDriver() {
        driver.close();
    }

    @Test
    public static void TestSearchBarNumberOfResults() {
        driver.get(HomePage.url);
        SearchBar.inputSearchBar(driver, "Yellow");
        SearchBar.clickSearch(driver);

        WebElement numberOfResults = driver.findElement(By.xpath("//span[@class='heading-counter']"));
        String resultsNumber = numberOfResults.getText();
        sa.assertEquals(resultsNumber, "3 results have been found.");
        sa.assertAll();

    }

    @Test
    public static void testSearchBarDressesYellow() {
        driver.get(HomePage.url);
        SearchBar.inputSearchBar(driver, "Yellow");
        SearchBar.clickSearch(driver);

        boolean haveYellowColor = false;
        List<WebElement> allColors = driver.findElements(By.className("color_to_pick_list"));
        for (int i = 0; i < allColors.size(); i++) {
            List<WebElement> individualColors = driver.findElements(By.className("color_pick"));
            for (int j = 0; j < individualColors.size(); j++) {
                if (individualColors.get(j).getAttribute("style").contains("background: rgb(241, 196, 15);")) {
                    haveYellowColor = true;
                }
            }
        }
        Assert.assertEquals(haveYellowColor, true);
    }
}