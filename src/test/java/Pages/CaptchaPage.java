package Pages;

import base.BasePage;
import org.omg.CORBA.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;


public class CaptchaPage extends BasePage {

public void clickİframe(){
  //  WebElement iframe=driver.findElement(By.id("frameId"));
    WebElement iFrame= driver.findElement(By.tagName("iframe"));
    driver.switchTo().frame(iFrame);
    Actions actions = new Actions(driver);
     WebElement element = driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark"));
   // WebElement element = driver.findElement(By.className("rc-anchor-center-container"));
    actions.moveToElement(element).click().build().perform();
    driver.switchTo().defaultContent();
    waitSeconds(20);

}
    public void deleteAllCookies(){

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie cookie : allCookies) {
            driver.manage().deleteCookieNamed(cookie.getName());
        }

    }}

