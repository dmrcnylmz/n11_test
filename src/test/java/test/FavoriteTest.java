package test;

import Pages.AddFavoritePage;
import Pages.LoginPage;
import base.BaseTest;
import com.sun.istack.internal.logging.Logger;
import org.junit.Test;

public class FavoriteTest extends BaseTest {
Logger LOGGER = Logger.getLogger(FavoriteTest.class);
    AddFavoritePage addFavoritePage =new AddFavoritePage();
    LoginPage loginPage = new LoginPage();

    @Test
            public void FavoriteTest() {
        addFavoritePage.selectİmage();
        addFavoritePage.addFavorite();
        LOGGER.info("2.index favorilere eklendi");
        addFavoritePage.openMyFavorite();
        addFavoritePage.deleteFromFavorite();
        LOGGER.info("Favorilerden silindi");

    }
}
