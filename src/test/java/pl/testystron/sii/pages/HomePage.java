package pl.testystron.sii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@id='sii-m-nav-menu__item--20383']/a")
    private WebElement kimJestesmy;

    @FindBy(partialLinkText = "Siła")
    private WebElement silaSi;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WhoWeAre openAnotherPage() {
        kimJestesmy.click();
        silaSi.click();
        return new WhoWeAre(driver);
    }

}
