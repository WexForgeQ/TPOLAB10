package tpolab10.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChessLearnPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/a[7]")
    private WebElement buttonOpening;

    public ChessLearnPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String openOpenings() {
        buttonOpening.click();
        return driver.getCurrentUrl();
    }
}
