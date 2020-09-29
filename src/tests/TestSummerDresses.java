package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Dresses;
import pages.HomePage;
import pages.Women;

import java.util.concurrent.TimeUnit;

public class TestSummerDresses {

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
    public static void checkUrlFromWomenToSummerDresses() {
        driver.get(HomePage.url);
        Women.hoverWoman(driver);
        Women.clickSummerDresses(driver);
        sa.assertEquals(driver.getCurrentUrl(), Women.summerDressesFromWomenURL);
        sa.assertAll();
    }

    @Test
    public static void checkUrlFromDressesToSummerDresses() {
        driver.get(HomePage.url);
        Dresses.HoverDresses(driver);
        Dresses.clickSummerDresses(driver);
        sa.assertEquals(driver.getCurrentUrl(), Dresses.summerDressesFromDressesURL);
        sa.assertAll();
    }

    @Test
    public static void testSummerPageUrl() {
        sa.assertEquals(Women.summerDressesFromWomenURL, Dresses.summerDressesFromDressesURL);
        sa.assertAll();
    }
}