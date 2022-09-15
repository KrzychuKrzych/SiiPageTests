package pl.testystron.sii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhoWeArePage {

    @FindBy(xpath = "//h2[@class='sii-m-img-collage__col__top__title sii-a-heading -h1 -invert']")
    private WebElement heading;

    @FindBy(xpath = "//p[@class='sii-m-img-collage__col__top__subtitle sii-a-heading -t2 -invert']")
    private WebElement paragraph;

    private WebDriver driver;

    public WhoWeArePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getHeading() {
        return heading;
    }

    public WebElement getParagraph() {
        return paragraph;
    }
}
