package pl.testystron.sii.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@id='sii-m-nav-menu__item--20383']/a")
    private WebElement kimJestesmy;

    @FindBy(partialLinkText = "Siła")
    private WebElement silaSi;

    @FindBy(xpath = "//*[@id='menu-menu-gorne-main-menu']/li[8]")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@class='sii-m-btn-drop-down__input js-menu-content-search__input -invert']")
    private WebElement sendingQuestionText;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WhoWeArePage openWhoWeAreSide() {
        kimJestesmy.click();
        silaSi.click();
        return new WhoWeArePage(driver);
    }

    public SearchingPage sendYourQuestion(String keyword) {
        searchButton.click();
        sendingQuestionText.sendKeys(keyword, Keys.ENTER);
        return new SearchingPage(driver);
    }
}
