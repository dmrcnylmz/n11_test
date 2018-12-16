package test;

import base.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTest extends BaseTest {
    Logger LOGGER = Logger.getLogger(MyTest.class);

    @Test
    public void n11Test() {
        //HOMEPAGE & HEADERPAGE
        //open login page
        waitForElementAndClick(By.className("btnSignIn"));
        String actualTitle;
        actualTitle = driver.getTitle();
        Assert.assertTrue("anasayfada değilsiniz", actualTitle.equals("Giriş Yap - n11.com"));
        //LOGIN_PAGE
        //login user
        String nickname = "Demircan Yılmaz";
        String email = "dmrcnylmz61@gmail.com";
        String password = "demircan61";
        waitForElementAndSendKeys(By.id("email"), email);
        waitForElementAndSendKeys(By.id("password"), password);
        waitForElementAndClick(By.id("loginButton"));
        Assert.assertTrue("Login Başarısız.", waitForElementAndGetText(By.xpath("//a[@class='menuLink user']")).equals("Demircan Yılmaz"));

        //HEADER_PAGE
        //search iphone
        String searchKey = "Iphone";
        waitForElementAndSendKeys(By.id("searchData"), searchKey);
        waitForElementAndClick(By.className("searchBtn"));

        //SEARCH_RESULT_PAGE
        //go second page - pagination
        Assert.assertTrue("Beklenen arama sonuç sayfası açılamadı.", waitForElementAndGetText(By.xpath("//div[@class='resultText ']/h1")).equals(searchKey));
        waitForElementAndClick(By.xpath("//div[@class='pagination']/a[text()='2']"));
        waitSeconds(1);
        //check second page - pagination
        Assert.assertTrue("2. sayfa açılamadı.", waitForElementAndGetAttribute(By.xpath("//div[@class='pagination']/a[text()='2']"), "class").equals("active "));

        //add to favorite third product
        int index = 2;
        waitForElementsAndClickWithIndex(By.xpath("//span[@class='textImg followBtn']"), index);
        String addedProductName = waitForElementsAndGetTextWithIndex(By.xpath("//h3[@class='productName bold']"), index);
        LOGGER.info("addedProductName : '" + addedProductName + "'");
        waitSeconds(3);

        //HEADER_PAGE
        //open my favorites
        WebElement headerMyAccount = getElement(By.className("myAccount"));
        action.moveToElement(headerMyAccount).clickAndHold().build().perform();
        waitForElementAndClick(By.linkText("İstek Listem / Favorilerim"));

        String fav = "Favorilerim";
        waitForElementAndClick(By.xpath("//h4[@class='listItemTitle']"));
        Assert.assertTrue("Beklenen sayfa açılamadı.", waitForElementAndGetText(By.xpath("//div[@class='group listingGroup wishListGroup']/h2")).equals(fav));
        waitForElementAndClick(By.xpath("//span[@class='deleteProFromFavorites']"));
        waitForElementAndClick(By.xpath("//span[@class='btn btnBlack confirm']"));

        waitSeconds(3);
        WebElement logoutx = getElement(By.className("myAccount"));
        action.moveToElement(logoutx).clickAndHold().build().perform();
        waitForElementAndClick(By.className("logoutBtn"));
    }

}
