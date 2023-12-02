package tpolab10.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChessHomePage {
    private static final String HOMEPAGE_URL = "https://www.chess.com/";
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[8]/div[3]/a[6]")
    private WebElement buttonChessToday;
/*    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[1]/div[3]/a")
    private WebElement buttonNews;*/
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[8]/div[3]/a[4]")
    private WebElement buttonLearn;

    public ChessHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String openChessToday() {
        buttonChessToday.click();
        return driver.getCurrentUrl();
    }
    public String openLearn() {
        buttonLearn.click();
        return driver.getCurrentUrl();
    }
    public ChessHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
}
