package tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ContactUs;
import pages.HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestContactUs {

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
    public static void testSendMessageInContactUs() {
        driver.get(HomePage.url);
        ContactUs.clickUpperContactUs(driver);
        ContactUs.chooseSubjectHeading(driver, "2");
        ContactUs.inputEmail(driver, "dzopa88@gmail.com");
        ContactUs.inputOrderReference(driver, "hello");
        ContactUs.uploadFile(driver, "C:\\Users\\Dell\\Desktop\\programiranje\\milos laptop\\milos slike\\DSC00337.JPG");
        ContactUs.inputMessage(driver, "Good Luck");
        ContactUs.clickSendButton(driver);

        sa.assertEquals(ContactUs.getSendSuccessfulMessage(driver).getText(), "Your message has been successfully sent to our team.");
        //System.out.println(ContactUs.getSendSuccessfulMessage(driver));
        sa.assertAll();
    }

    @Test
    public static void testURLUpperLowerContactUs() {
        String expectedUrl = "http://automationpractice.com/index.php?controller=contact";
        driver.get(HomePage.url);

        ContactUs.clickUpperContactUs(driver);
        String upperContactUsURL = driver.getCurrentUrl();

        ContactUs.clickLowerContactUs(driver);
        String lowerContactUsURL = driver.getCurrentUrl();

        sa.assertEquals(upperContactUsURL, expectedUrl);
        sa.assertEquals(lowerContactUsURL, expectedUrl);
        sa.assertAll();
    }

    @Test
    public static void sendMultipleMessage() throws IOException {
        driver.get(HomePage.url);
        ContactUs.clickUpperContactUs(driver);

        FileInputStream fis = new FileInputStream("ContactUsTest.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);

        for (int i = 1; i < 3; i++) {

            Row row = sheet.getRow(i);

            Cell id = row.getCell(0);
            ContactUs.chooseSubjectHeading(driver, id.toString());

            Cell email = row.getCell(1);
            ContactUs.inputEmail(driver, email.toString());

            Cell orderReference = row.getCell(2);
            ContactUs.inputOrderReference(driver, orderReference.toString());

            Cell file = row.getCell(3);
            ContactUs.uploadFile(driver, file.toString());

            Cell message = row.getCell(4);
            ContactUs.inputMessage(driver, message.toString());

            ContactUs.clickSendButton(driver);

            sa.assertEquals(ContactUs.getSendSuccessfulMessage(driver).getAttribute("class"), "alert alert-success");
            sa.assertEquals(ContactUs.getSendSuccessfulMessage(driver).getText(), "Your message has been successfully sent to our team.");
            System.out.println(ContactUs.getSendSuccessfulMessage(driver).getText());
            sa.assertAll();
            ContactUs.clickUpperContactUs(driver);

        }
    }
}