package test;

import Pages.AddFavoritePage;
import Pages.CaptchaPage;
import Pages.LoginPage;
import Pages.SearchPage;
import base.BaseTest;
import org.junit.Test;

public class MyTest extends BaseTest {
    LoginPage loginPage;
    SearchPage searchPage;
    AddFavoritePage addFavoritePage;
    CaptchaPage captchaPage;
    @Test
    public void MyTest() {
        loginPage=new LoginPage();
        searchPage=new SearchPage();
        addFavoritePage=new AddFavoritePage();
        captchaPage=new CaptchaPage();

        loginPage.goToLoginPage();
        captchaPage.deleteAllCookies();
        loginPage.login();

        searchPage.searchKeysFromHeader("İphone");
        searchPage.searchResultPage("İphone");
        addFavoritePage.selectİmage();
        addFavoritePage.addFavorite();
        captchaPage.deleteAllCookies();
        loginPage.login();
        addFavoritePage.closePopup();
        addFavoritePage.openMyFavorite();
        addFavoritePage.deleteFromFavorite();

        loginPage.logout();

    }
}
