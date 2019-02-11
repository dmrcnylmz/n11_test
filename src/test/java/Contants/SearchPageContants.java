package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface SearchPageContants {

    public ElementInfo PRODUCT_SEARCH = new ElementInfo("Arama alanı bulunamadı", By.id("productSearch"));
    public ElementInfo SEARCH_BUTTON = new ElementInfo("Arama butonu bulunamadı",By.id("buttonProductSearch"));
    public ElementInfo SEARCH_KEY = new ElementInfo("Arama yapılamadı",By.xpath("//h1[@class='keyword']"));
    public ElementInfo PAGINATION_2 = new ElementInfo("2.sayfaya geçiş yapılamadı",By.xpath("//*[@id='pagination']/ul/li[2]/a"));


}
