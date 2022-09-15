package pl.testystron.sii.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testystron.sii.pages.HomePage;
import pl.testystron.sii.pages.SearchingPage;

public class QuestionPageTest extends BaseTest {

    @Test
    public void questionTest() {
        String question = "Tester automatyzujący";

        SearchingPage searchingPage = new HomePage(driver).sendYourQuestion(question);

        Assert.assertTrue(searchingPage.getFindingMyOwnWay().contains(question));
    }
}
