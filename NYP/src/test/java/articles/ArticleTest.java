package articles;

import common.MobileAPI;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.MobileAPI.ad;

public class ArticleTest extends MobileAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.goToArticles();
    }

}
