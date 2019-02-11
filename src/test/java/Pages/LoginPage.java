package Pages;

import Contants.LoginPageContants;
import base.BasePage;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage implements LoginPageContants {
    private Logger LOGGER = Logger.getLogger(LoginPage.class);
    String email = "dmrcnylmz@gmail.com";
    String password = "demircan61";

CaptchaPage captcha ;
    public void goToLoginPage (){
        waitSeconds(1);

        WebElement element=getElement(HEADER_ACCOUNT);
        action.moveToElement(element).click().build().perform();
        waitSeconds(1);
        waitForElementAndClick(HEADER_LOGIN);
        String actualTitle;
       actualTitle = driver.getTitle();
       Assert.assertTrue("anasayfada değilsiniz", actualTitle.equals("Üye Giriş Sayfası – Hepsiburada.com"));
    }

    public void login (){

         //LOGIN_PAGE
        //login user


       //------------------ ---------//
        waitForElementAndSendKeys(LOGIN_EMAIL, email);
        waitSeconds(3);
        waitForElementAndSendKeys(LOGIN_PASSWORD, password);
        waitSeconds(3);
        waitForElementAndClick(LOGIN_BTN);
        waitSeconds(5);
        String user= waitForElementAndGetText(USER_NAME);
        Assert.assertTrue("LoginPage Başarısız.", waitForElementAndGetText(USER_NAME).equals("demircan yılmaz"));
        waitSeconds(5);

    }

    public void logout(){
        captcha= new CaptchaPage();
        waitSeconds(2);
        WebElement logoutx = getElement(HEADER_ACCOUNT);
        action.moveToElement(logoutx).clickAndHold().build().perform();
        waitSeconds(1);
        captcha.deleteAllCookies();
        waitForElementAndClick(LOGOUT_BTN);
        waitSeconds(3);
    }

}
