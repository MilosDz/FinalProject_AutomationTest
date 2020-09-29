package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummerDressesPage {

    private static String summerDressesPageURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    private static String dressesQuantityXpath = "//i[@class='icon-plus']";
    private static String dressSizeXpath = "//option[contains(text(),'M')]";
    private static String dressColorById = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]";
    private static String hoverSecondDressXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]";
    private static String addToCartXpath = "//span[contains(text(),'Add to cart')]";
    private static String PopUpCheckoutXpath = "//span[contains(text(),'Proceed to checkout')]";
    private static String hoverCartXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]";

    public static WebElement getDressesQuantity(WebDriver driver) {
        return driver.findElement(By.xpath(dressesQuantityXpath));
    }

    public static void clickQuantity(WebDriver driver) {
        getDressesQuantity(driver).click();
    }

    public static WebElement getDressSize(WebDriver driver) {
        return driver.findElement(By.xpath(dressSizeXpath));
    }

    public static void chooseSize(WebDriver driver) {
        getDressSize(driver).click();
    }

    public static WebElement getHoverSecondDress(WebDriver driver) {
        return driver.findElement(By.xpath(hoverSecondDressXpath));
    }

    public static void hoverSecondDress(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getHoverSecondDress(driver)).perform();
    }
    public static WebElement getDressColor(WebDriver driver){
        return driver.findElement(By.xpath(dressColorById));
    }
    public static void clickDressColor(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,5);
        getDressColor(driver).click();
    }
    public static WebElement getAddToCart(WebDriver driver){
        return driver.findElement(By.xpath(addToCartXpath));
    }
    public static void clickAddToCart(WebDriver driver){
        getAddToCart(driver).click();
    }
    public static WebElement getPopUpCheckout(WebDriver driver){
        return driver.findElement(By.xpath(PopUpCheckoutXpath));
    }
    public static void clickPopUpCheckout(WebDriver driver){
        getPopUpCheckout(driver).click();
    }
    public static WebElement getHoverCart(WebDriver driver){
        return driver.findElement(By.xpath(hoverCartXpath));
    }
    public static void hoverCart(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(getHoverCart(driver)).perform();
    }
}