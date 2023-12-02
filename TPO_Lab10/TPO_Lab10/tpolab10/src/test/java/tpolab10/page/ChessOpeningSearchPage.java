package tpolab10.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChessOpeningSearchPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[1]/div[4]/div[1]/div/div/div[1]/input")
    private WebElement searchField;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[4]/div/div[2]/div/div[2]/div/button")
    private WebElement okButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[1]/div[4]/div[1]/div[2]/div[2]/a")
    private WebElement openingButton;
    @FindBy(xpath = "/html/body/div[19]/button/span")
    private WebElement closeButton;

    public ChessOpeningSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String searchOpening(String openingName) throws InterruptedException {
        okButton.click();
        searchField.click();
        searchField.sendKeys(openingName + Keys.ENTER);
        Thread.sleep(1000);
        openingButton.click();
        return driver.getCurrentUrl();
    }
}
