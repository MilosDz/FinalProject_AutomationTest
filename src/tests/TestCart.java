package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Cart;
import pages.Dresses;
import pages.HomePage;
import pages.SummerDressesPage;

import java.util.concurrent.TimeUnit;

public class TestCart {

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
    public static void testCartItems() throws InterruptedException {
        driver.get(HomePage.url);
        Dresses.HoverDresses(driver);
        Dresses.clickSummerDresses(driver);
        SummerDressesPage.hoverSecondDress(driver);
        SummerDressesPage.clickDressColor(driver);
        SummerDressesPage.clickQuantity(driver);
        SummerDressesPage.chooseSize(driver);
        SummerDressesPage.clickAddToCart(driver);
        Thread.sleep(3000);
        SummerDressesPage.clickPopUpCheckout(driver);
        SummerDressesPage.hoverCart(driver);

//        System.out.println(Cart.getColorSize(driver));
//        System.out.println(Cart.getDressName(driver));
//        System.out.println(Cart.numberOfDresses(driver));
        sa.assertEquals(Cart.getColorSize(driver).getText(), "Color : White, Size : M");
        sa.assertEquals(Cart.numberOfDresses(driver).getAttribute("value"), "2");
        sa.assertEquals(Cart.getDressName(driver).getText(), "Printed Summer Dress");
        sa.assertAll();
    }
}