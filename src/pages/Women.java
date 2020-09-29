package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Women {

    public static String summerDressesFromWomenURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    private static String hoverWomenXpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    private static String summerDressesXpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]";

    public static WebElement getHoverWomen(WebDriver driver) {
        return driver.findElement(By.xpath(hoverWomenXpath));
    }

    public static void hoverWoman(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getHoverWomen(driver)).perform();
    }

    public static WebElement getSummerDresses(WebDriver driver) {
        return driver.findElement(By.xpath(summerDressesXpath));
    }

    public static void clickSummerDresses(WebDriver driver) {
        getSummerDresses(driver).click();
    }
}