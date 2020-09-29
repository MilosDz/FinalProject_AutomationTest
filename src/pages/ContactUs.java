package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

    private static String upperContactUsXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
    private static String subjectHeadingXpath = "//select[@id='id_contact']";
    private static String emailById = "email";
    private static String orderReferenceById = "id_order";
    private static String chooseFileXpath = "//input[@id='fileUpload']";
    private static String messageXpath = "//textarea[@id='message']";
    private static String sendButtonXpath = "//span[contains(text(),'Send')]";
    private static String sendSuccessfullyMessageXpath = "//p[@class='alert alert-success']";
    private static String lowerContactUsXpath = "//li[@class='item']//a[contains(text(),'Contact us')]";

    public static WebElement getUpperContactUs(WebDriver driver) {
        return driver.findElement(By.xpath(upperContactUsXpath));
    }

    public static void clickUpperContactUs(WebDriver driver) {
        getUpperContactUs(driver).click();
    }

    public static WebElement getLowerContactUs(WebDriver driver) {
        return driver.findElement(By.xpath(lowerContactUsXpath));
    }

    public static void clickLowerContactUs(WebDriver driver) {
        getLowerContactUs(driver).click();
    }

    public static WebElement getSubjectHeading(WebDriver driver) {
        return driver.findElement(By.xpath(subjectHeadingXpath));
    }

    public static void chooseSubjectHeading(WebDriver driver, String value) {
        Select select = new Select(getSubjectHeading(driver));
        select.selectByValue(value);
    }

    public static WebElement getEmail(WebDriver driver) {
        return driver.findElement(By.id(emailById));
    }

    public static void inputEmail(WebDriver driver, String userEmail) {
        getEmail(driver).sendKeys(userEmail);
    }

    public static WebElement getOrderReference(WebDriver driver) {
        return driver.findElement(By.id(orderReferenceById));
    }

    public static void inputOrderReference(WebDriver driver, String order) {
        getOrderReference(driver).sendKeys(Keys.PAGE_DOWN);
        getOrderReference(driver).sendKeys(order);
    }

    public static WebElement getChooseFile(WebDriver driver) {
        return driver.findElement(By.xpath(chooseFileXpath));
    }

    public static void uploadFile(WebDriver driver, String path) {
        getChooseFile(driver).sendKeys(path);
    }

    public static WebElement getMessage(WebDriver driver) {
        return driver.findElement(By.xpath(messageXpath));
    }

    public static void inputMessage(WebDriver driver, String message) {
        getMessage(driver).sendKeys(message);
    }

    public static WebElement getSendButton(WebDriver driver) {
        return driver.findElement(By.xpath(sendButtonXpath));
    }

    public static void clickSendButton(WebDriver driver) {
        getSendButton(driver).click();
    }

    public static WebElement getSendSuccessfulMessage(WebDriver driver) {
        return driver.findElement(By.xpath(sendSuccessfullyMessageXpath));
    }
}
