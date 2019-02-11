package Pages;

import Contants.SearchPageContants;
import base.BasePage;
import base.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchPage extends BasePage implements SearchPageContants {
    CaptchaPage captchaPage;
    private Logger LOGGER = Logger.getLogger(SearchPage.class);

    public void searchKeysFromHeader (String text){
        captchaPage= new CaptchaPage();
        waitForElementAndSendKeys(PRODUCT_SEARCH, text);
        captchaPage.deleteAllCookies();
        waitSeconds(3);
        waitForElementAndClick(SEARCH_BUTTON);
        waitSeconds(2);

    }

    public void searchResultPage(String searchKey)
    {
        waitSeconds(5);
       Assert.assertTrue("Beklenen arama sonuç sayfası açılamadı.", waitForElementAndGetText(SEARCH_KEY).equals("\"İphone\""));

        waitForElementAndClick(PAGINATION_2);
        waitSeconds(5);
       ///check second page - pagination
        Assert.assertTrue("2. sayfa açılamadı.", waitForElementAndGetAttribute(PAGINATION_2, "class").equals("page-2 active"));
    }

}
