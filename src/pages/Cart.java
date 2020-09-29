package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

    private static String colorSizeXpath = "//td[@class='cart_description']//a[contains(text(),'Color : White, Size : M')]";
    private static String numberOfDressesByName = "quantity_6_41_0_0";
    private static String dressNameXpath = "//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]";

    public static WebElement getColorSize(WebDriver driver) {
        return driver.findElement(By.xpath(colorSizeXpath));
    }

    public static WebElement numberOfDresses(WebDriver driver) {
        return driver.findElement(By.name(numberOfDressesByName));
    }

    public static WebElement getDressName(WebDriver driver) {
        return driver.findElement(By.xpath(dressNameXpath));
    }

}