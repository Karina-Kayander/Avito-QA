import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AutomatedTests {
    private WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.avito.ru/avito-care/eco-impact");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private WebElement findElement(String selector) throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector(selector));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        return element;
    }

    @Test
    public void TESTCASE1() {
        try {
            WebElement element = findElement(".desktop-impact-items-F7T6E");
            File screenshot = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("output\\testcase1.png"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception: " + e);
        }
    }

    @Test
    public void TESTCASE2() {
        try {
            WebElement element = findElement(".desktop-impact-items-F7T6E");
            File screenshot = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("output\\testcase2.png"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception: " + e);
        }
    }

    @Test
    public void TESTCASE3() {
        try {
            WebElement element = findElement(".desktop-content-HDB3N");
            File screenshot = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("output\\testcase3.png"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception: " + e);
        }
    }

    @Test
    public void TESTCASE4() {
        try {
            WebElement element = findElement(".desktop-description-lPXN_");
            File screenshot = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("output\\testcase4.png"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception: " + e);
        }
    }

    @Test
    public void TESTCASE5() {
        try {
            WebElement element = findElement(".desktop-impact-items-F7T6E");
            File screenshot = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("output\\testcase5.png"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception: " + e);
        }
    }
}