package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementInfo;

import java.util.List;

public class BasePage  {

    protected WebDriver driver = BaseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);
    protected  Actions action = new Actions(driver);
    private Logger LOGGER = Logger.getLogger(BasePage.class);

    protected WebElement getElement(ElementInfo elementInfo) {
        return driver.findElement(elementInfo.getBy());
    }

    protected WebElement waitForElement(ElementInfo info) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(info.getBy()));
    }


    protected void waitForElementAndClick(ElementInfo elementInfo) {
        waitForElement(elementInfo).click();
    }

    protected void waitForElementAndSendKeys(ElementInfo elementInfo, String text) {
        waitForElement(elementInfo).sendKeys(text);
    }

    protected String waitForElementAndGetText(ElementInfo elementInfo) {
        return waitForElement(elementInfo).getText();
    }

    protected String waitForElementAndGetAttribute(ElementInfo elementInfo, String attribute) {
        return waitForElement(elementInfo).getAttribute(attribute);
    }

    protected List<WebElement> waitForElements(ElementInfo elementInfo) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementInfo.getBy()));
    }

    protected void waitForElementsAndClickWithIndex(ElementInfo elementInfo, int index) {
        waitForElements(elementInfo).get(index).click();

    }
    protected void acceptAlert (){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }



     protected void waitSeconds(int seconds) {
        try {
            LOGGER.info(seconds + " saniye kadar bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            LOGGER.info(e);
        }}}
