package stepDefinitions;

import PageObjects.PopularTagsPageObject;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static stepDefinitions.SignUpStepdefs.driver;
public class PopularTagsStepdefs extends TestEvidence{
    public static PopularTagsPageObject popular_tags_page_object;

    @And("^user click popular tags button$")
    public void userClickPopularTagsButton() {
        popular_tags_page_object = PageFactory.initElements(driver, PopularTagsPageObject.class);
        try {
            Thread.sleep(5000);
            popular_tags_page_object.popular_tags_link.click();
            Thread.sleep(3000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the popular tags link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }
    @And("^user navigate to popular tag read more link$")
    public void userNavigateToPopularTagReadMoreLink() {

        try {
            Thread.sleep(5000);
            popular_tags_page_object.popular_tags_read_more_link.click();
            Thread.sleep(3000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the popular tags read more link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user write on popular tag comment$")
    public void userWriteOnPopularTagComment() {
        try {
            Thread.sleep(5000);
            popular_tags_page_object.popular_tags_capture_comment.sendKeys("Tested by Tebogo");
            Thread.sleep(3000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the popular tags capture comment link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }
    }

    @And("^user post on popular tag comment$")
    public void userPostOnPopularTagComment() {

        try {
            Thread.sleep(5000);
            popular_tags_page_object.popular_tags_post_comment.click();
            Thread.sleep(3000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the popular tags post comment link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }
}
