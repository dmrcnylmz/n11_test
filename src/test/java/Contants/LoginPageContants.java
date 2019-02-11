package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContants {

public ElementInfo LOGIN_EMAIL = new ElementInfo("E-posta adresi girilemedi", By.id("email"));
public ElementInfo LOGIN_PASSWORD = new ElementInfo("Şifre girilemedi",By.id("password"));
 public ElementInfo LOGIN_BTN = new ElementInfo("Giriş butonu bulunamadı",By.className("form-actions"));
//MAİN PAGE
public ElementInfo HEADER_ACCOUNT = new ElementInfo("Header myAccount bulunumadı",By.cssSelector("#myAccount"));
public ElementInfo HEADER_LOGIN= new ElementInfo( "Header login bulunamadı",By.id("login"));
 public ElementInfo LOGOUT_BTN = new ElementInfo("Çıkış butonu bulunamadı",By.linkText("Çıkış Yap"));
    public ElementInfo USER_NAME = new ElementInfo("Username alanı bulunamadı",By.xpath("//a[@class='login user-name']"));



}
