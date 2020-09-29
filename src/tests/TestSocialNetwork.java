package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SocialNetworks;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestSocialNetwork {

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
    public static void TestSocialNetwork() throws InterruptedException {
        driver.get(HomePage.url);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        SocialNetworks.clickFacebook(driver);
        Thread.sleep(1000);
        SocialNetworks.clickTwitter(driver);
        Thread.sleep(1000);
        SocialNetworks.clickYouTube(driver);
        Thread.sleep(1000);
        SocialNetworks.clickGooglePlus(driver);
        Thread.sleep(1000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(4));
        sa.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/groups/525066904174158/");
        driver.close();

        driver.switchTo().window(tabs.get(3));
        sa.assertEquals(driver.getCurrentUrl(), "https://twitter.com/seleniumfrmwrk");
        driver.close();

        driver.switchTo().window(tabs.get(2));
        sa.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
        driver.close();

        driver.switchTo().window(tabs.get(1));
        sa.assertEquals(driver.getCurrentUrl(), "https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&followup=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.close();

        driver.switchTo().window(tabs.get(0));

        sa.assertAll();
    }
}