package base;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public Actions action;
    private Logger LOGGER = Logger.getLogger(BaseTest.class);

    @Before
    public void beginTest() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");

        driver = new ChromeDriver(options);
        driver.get("https://www.n11.com/");

        wait = new WebDriverWait(driver, 15, 1000);
        action = new Actions(driver);
    }

    @After
    public void afterTest() throws InterruptedException {
        LOGGER.info("Test finished.");
        driver.quit();
    }



    protected void waitSeconds(int seconds) {
        try {
            LOGGER.info(seconds + " saniye kadar bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            LOGGER.info(e);
        }
    }

    protected WebElement getElement(By byElement) {
        return driver.findElement(byElement);
    }

    protected WebElement waitForElement(By byElement) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(byElement));
    }

    protected void waitForElementAndClick(By byElement) {
        waitForElement(byElement).click();
    }

    protected void waitForElementAndSendKeys(By byElement, String text) {
        waitForElement(byElement).sendKeys(text);
    }

    protected String waitForElementAndGetText(By byElement) {
        return waitForElement(byElement).getText();
    }

    protected String waitForElementAndGetAttribute(By byElement, String attribute) {
        return waitForElement(byElement).getAttribute(attribute);
    }

    protected List<WebElement> waitForElements(By byElement) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byElement));
    }

    protected void waitForElementsAndClickWithIndex(By byElement, int index) {
        waitForElements(byElement).get(index).click();
    }

    protected String waitForElementsAndGetTextWithIndex(By byElement, int index) {
        return waitForElements(byElement).get(index).getText();
    }
}
