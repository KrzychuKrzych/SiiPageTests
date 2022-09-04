package pl.testystron.sii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhoWeAre {

    @FindBy(xpath = "//h2[@class='sii-m-img-collage__col__top__title sii-a-heading -h1 -invert']")
    private WebElement heading;

    private WebDriver driver;
    public WhoWeAre(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public WebElement getHeading() {
        return heading;
    }
}
