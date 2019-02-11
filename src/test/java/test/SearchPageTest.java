package test;

import Pages.LoginPage;
import Pages.SearchPage;
import base.BaseTest;
import org.junit.Test;

public class SearchPageTest extends BaseTest {

    LoginPage loginPage;
    SearchPage searchPage;

         @Test
         public void searchPageTest (){
           //  loginPage = new LoginPage();
             searchPage=new SearchPage();

           //  loginPage.goToLoginPage();
           //  loginPage.login();
             searchPage.searchKeysFromHeader("İphone");
             searchPage.searchResultPage("İphone");

}}
