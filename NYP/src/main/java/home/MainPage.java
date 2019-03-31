package home;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open menu']")
    public WebElement btnBurger;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")
    public WebElement btnSearch;
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtPageHeading;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    public WebElement imgPageHeading;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtSectionTopHeadline;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtNewsItemHeadline;
    @FindBy(xpath = "//android.widget.ListView[1]/android.widget.RelativeLayout")
    List<WebElement> mainMenu = new ArrayList<>();
    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button")
    List<WebElement> alertTendingNews = new ArrayList<>();

    String mainMenuArr[] = {"TOP STORIES","SAVED ARTICLES","NEWS","METRO","PAGE SIX","SPORTS","BUSINESS","OPINION","ENTERTAINMENT","FASHION","LIVING","MEDIA","TECH","REAL ESTATE","PHOTOS","VIDEO","ABOUT"};

    public void setAlertTendingNews(String condition) {
        if (alertTendingNews.get(0).isDisplayed()) {
            switch (condition) {
                case "yes":
                    alertTendingNews.get(0).click();
                    break;
                case "no":
                    alertTendingNews.get(1).click();
                    break;
            }
        }
    }

    public void getMenu(){
        btnBurger.click();
    }

    public void getTopStories(){
        getMenu();
        scrollAndClickByName(mainMenuArr[0]);
        //Assert.assertTrue(txtPageHeading.getText().contains("TOP STORIES"));
    }
    public void getSavedArticles(){
        getMenu();
        scrollAndClickByName(mainMenuArr[1]);
        //Assert.assertTrue(txtPageHeading.getText().contains("SAVED ARTICLES"));
    }
    public void getNews(){
        getMenu();
        scrollAndClickByName(mainMenuArr[2]);
        // Assert.assertTrue(txtPageHeading.getText().contains("NEWS"));
    }
    public void getMetro(){
        getMenu();
        scrollAndClickByName(mainMenuArr[3]);
        //Assert.assertTrue(txtPageHeading.getText().contains("METRO"));
    }
    public void getPageSix(){
        getMenu();
        scrollAndClickByName(mainMenuArr[4]);
        //Assert.assertTrue(imgPageHeading.getSize().width==229);
        //Assert.assertTrue(imgPageHeading.getSize().height==54);
    }
    public void getSports(){
        getMenu();
        scrollAndClickByName(mainMenuArr[5]);
        //Assert.assertTrue(txtPageHeading.getText().contains("SPORTS"));
    }
    public void getBusiness(){
        getMenu();
        scrollAndClickByName(mainMenuArr[6]);
        //Assert.assertTrue(txtPageHeading.getText().contains("BUSINESS"));
    }
    public void getOpinion(){
        getMenu();
        scrollAndClickByName(mainMenuArr[7]);
        //Assert.assertTrue(txtPageHeading.getText().contains("OPINION"));
    }
    public void getEntertainment(){
        getMenu();
        scrollAndClickByName(mainMenuArr[8]);
        //Assert.assertTrue(txtPageHeading.getText().contains("ENTERTAINMENT"));
    }
    public void getFashion(){
        getMenu();
        scrollAndClickByName(mainMenuArr[9]);
        //Assert.assertTrue(txtPageHeading.getText().contains("FASHION"));
    }
    public void getLiving(){
        getMenu();
        scrollAndClickByName(mainMenuArr[10]);
        //Assert.assertTrue(txtPageHeading.getText().contains("LIVING"));
    }
    public void getMedia(){
        getMenu();
        scrollAndClickByName(mainMenuArr[11]);
        //Assert.assertTrue(txtPageHeading.getText().contains("MEDIA"));
    }
    public void getTech(){
        getMenu();
        scrollAndClickByName(mainMenuArr[12]);
        //Assert.assertTrue(txtPageHeading.getText().contains("TECH"));
    }
    public void getRealEstate(){
        getMenu();
        scrollAndClickByName(mainMenuArr[13]);
        Assert.assertTrue(txtPageHeading.getText().contains("REAL ESTATE"));
    }
    public void getPhotots(){
        getMenu();
        scrollAndClickByName(mainMenuArr[14]);
        Assert.assertTrue(txtPageHeading.getText().contains("PHOTOS"));
    }
    public void getVideo(){
        getMenu();
        scrollAndClickByName(mainMenuArr[15]);
        Assert.assertTrue(txtPageHeading.getText().contains("VIDEO"));
    }
    public void getAbout() {
        getMenu();
        scrollAndClickByName(mainMenuArr[16]);
        //Assert.assertTrue(txtPageHeading.getText().contains("ABOUT"));
    }
//    public void scrollToElement(AppiumDriver driver, String text){
//        MobileElement we = (MobileElement) driver.findElementByXPath(text);
//        driver.scrollTo(we.getText());
//    }

    public void goToArticles(){
        //getAbout();
        getBusiness();
        getEntertainment();
        getFashion();
        getMetro();
        getNews();
        getOpinion();
        getPageSix();
        getMedia();
    }
}

