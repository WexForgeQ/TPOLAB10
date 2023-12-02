package tpolab10.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChessNewsPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[1]/div[3]/a")
        private WebElement buttonNews;

    public ChessNewsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String openNews() {
        buttonNews.click();
        return driver.getCurrentUrl();
    }
}
