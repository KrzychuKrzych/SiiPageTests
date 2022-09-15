package pl.testystron.sii.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testystron.sii.pages.HomePage;
import pl.testystron.sii.pages.WhoWeArePage;

public class WhoWeAreTests extends BaseTest {

    @Test
    public void assertTest() {
        WhoWeArePage whoWeArePage = new HomePage(driver).openWhoWeAreSide();

        Assert.assertEquals(whoWeArePage.getHeading().getText(), "Power People");
        Assert.assertTrue(whoWeArePage.getParagraph().isDisplayed());
    }
}
