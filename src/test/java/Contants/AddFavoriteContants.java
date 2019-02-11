package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface AddFavoriteContants {

    public ElementInfo HEADER_ACCOUNT = new ElementInfo("Header myAccount bulunamadı",By.cssSelector("#myAccount"));
    public ElementInfo SEARCHED_IMAGES = new ElementInfo("Aranan image bulunamadı",By.cssSelector(".search-item:nth-child(3) a"));
    public ElementInfo ADD_FAV = new ElementInfo("Aranan image bulunamadı",By.linkText("Favori Listeme Ekle"));


    public ElementInfo FAV_LIST = new ElementInfo("Favori liste ",By.linkText("Favori Listem"));
    public ElementInfo FAV_KONTROL = new ElementInfo("Favorilerde degilsiniz",By.cssSelector(".myPagesH2"));
    public ElementInfo FAV_SELECT = new ElementInfo("Urun secilemedi",By.xpath("//span[@class='chkSelect']"));
    public ElementInfo FAV_DELETE_BTN = new ElementInfo("Urun secilemedi",By.xpath("//span[contains(text(),'Sil')]"));
    public ElementInfo FAV_INF_CLOSE = new ElementInfo("Kapatma butonu bulunamadı",By.cssSelector("#notification .close"));

}
