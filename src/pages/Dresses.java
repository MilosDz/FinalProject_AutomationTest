package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dresses {

    public static String summerDressesFromDressesURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    private static String hoverDressesXpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
    private static String summerDressesXpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";

    public static WebElement getHoverDresses(WebDriver driver) {
        return driver.findElement(By.xpath(hoverDressesXpath));
    }

    public static void HoverDresses(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getHoverDresses(driver)).perform();
    }

    public static WebElement getSummerDresses(WebDriver driver) {
        return driver.findElement(By.xpath(summerDressesXpath));
    }

    public static void clickSummerDresses(WebDriver driver) {
        getSummerDresses(driver).click();
    }

}