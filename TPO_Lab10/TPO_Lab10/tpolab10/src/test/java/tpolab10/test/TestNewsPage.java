package tpolab10.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tpolab10.page.*;

public class TestNewsPage {
    private WebDriver driver;
    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void quitDriver() {
        driver.quit();
        driver = null;
    }

    @Test
    public void GetNews() throws InterruptedException {
        String currentUrl = "";
        String homeUrl = "https://www.chess.com/";
        String chessTodayUrl = "https://www.chess.com/today";
        String newsUrl = "https://www.chess.com/news";

        currentUrl = new ChessHomePage(driver).openPage().openChessToday();
        Assert.assertEquals(chessTodayUrl, currentUrl);
        currentUrl = new ChessNewsPage(driver).openNews();
        Assert.assertEquals(newsUrl, currentUrl);



    }
}
