package pl.testystron.sii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingPage {


    @FindBy(xpath = "//h3[@class='sii-m-card-item-bottom-content-search__content__title' and contains(text(), 'ścieżka')]")
    private WebElement findingMyOwnWay;

    private WebDriver driver;

    public SearchingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getFindingMyOwnWay() {
        return findingMyOwnWay.getText();
    }
}
