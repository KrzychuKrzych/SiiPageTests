package pl.testystron.sii.tests;

import org.testng.annotations.Test;
import pl.testystron.sii.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void quickTest() {
        new HomePage(driver).openWhoWeAreSide();
    }
}
