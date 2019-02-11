package Pages;

import Contants.AddFavoriteContants;
import base.BasePage;
import base.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Assert;

import org.openqa.selenium.WebElement;

public class AddFavoritePage extends BasePage implements AddFavoriteContants {

    public void selectİmage () {
        waitForElementAndClick(SEARCHED_IMAGES);
        waitSeconds(5);
    }
    public void addFavorite(){
        waitForElementAndClick(ADD_FAV);
        waitSeconds(5);}
        public void closePopup(){
            waitForElementAndClick(FAV_INF_CLOSE);
            waitSeconds(1);
        }

    public void openMyFavorite (){
        waitSeconds(2);
        WebElement headerMyAccount1 = getElement(HEADER_ACCOUNT);
        action.moveToElement(headerMyAccount1).clickAndHold().build().perform();
        waitSeconds(1);
        waitForElementAndClick(FAV_LIST);
        String fav = "Favori Listeniz";
        Assert.assertTrue("Beklenen sayfa açılamadı.", waitForElementAndGetText(FAV_KONTROL).equals(fav));
    }
    public void deleteFromFavorite(){
        waitForElementAndClick(FAV_SELECT);
        waitSeconds(1);
        waitForElementAndClick(FAV_DELETE_BTN);
        waitSeconds(2);
        acceptAlert();
    }

}
