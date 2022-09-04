package pl.testystron.sii.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testystron.sii.pages.HomePage;
import pl.testystron.sii.pages.WhoWeAre;

public class WhoWeAreTests extends BaseTest{

    @Test
    public void assertTest() {
        WhoWeAre headingAssert = new HomePage(driver).openAnotherPage();

        Assert.assertEquals(headingAssert.getHeading().getText(),"Power People");
    }
}
