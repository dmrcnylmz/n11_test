package test;

import Pages.CaptchaPage;
import Pages.LoginPage;
import base.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Test;

public class LoginPageTest extends BaseTest {
    Logger LOGGER = Logger.getLogger(LoginPageTest.class);
CaptchaPage captchaPage;
    LoginPage loginPage;
    @Test
    public void LoginTest() {
captchaPage = new CaptchaPage();
        loginPage = new LoginPage();

        loginPage.goToLoginPage();
        captchaPage.deleteAllCookies();
        loginPage.login();

        LOGGER.info("LoginPage Başarılı");
        loginPage.logout();
    }

}
