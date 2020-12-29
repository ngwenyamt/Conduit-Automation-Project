package stepDefinitions;

import PageObjects.GlobalFeedsPageObject;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static stepDefinitions.SignUpStepdefs.driver;

public class GlobalFeedsStepdefs extends TestEvidence{
    public static GlobalFeedsPageObject global_feeds_page_object;
    @And("^user navigate to global feeds$")
    public void userNavigateToGlobalFeeds() {

        global_feeds_page_object = PageFactory.initElements(driver,GlobalFeedsPageObject.class);

        try
        {
            Thread.sleep(5000);
            captureScreenShot(driver);
            global_feeds_page_object.blobal_feeds_link.click();
            Assert.assertTrue(true);
            Thread.sleep(5000);
            captureScreenShot(driver);

        }
        catch (Exception e) {
            System.out.print("Unable to find the global feeds element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user navigate to read more link$")
    public void userNavigateToReadMoreLink() {

        try
        {
            Thread.sleep(5000);
            captureScreenShot(driver);
            global_feeds_page_object.read_more_link.click();
            Assert.assertTrue(true);
            Thread.sleep(5000);
            captureScreenShot(driver);

        }
        catch (Exception e) {
            System.out.print("Unable to find the read more element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user write comment$")
    public void userWriteComment() {

        try
        {
            Thread.sleep(5000);
            captureScreenShot(driver);
            global_feeds_page_object.write_comment_textArea.sendKeys("Tested by Tebogo Ngwenya");
            captureScreenShot(driver);
            Assert.assertTrue(true);
            Thread.sleep(5000);
            captureScreenShot(driver);

        }
        catch (Exception e) {
            System.out.print("Unable to find the write comment element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }


    }

    @And("^user post comment$")
    public void userPostComment() {

        try
        {
            Thread.sleep(5000);
            captureScreenShot(driver);
            global_feeds_page_object.post_comment_button.click();
            captureScreenShot(driver);
            Assert.assertTrue(true);
            Thread.sleep(5000);
            captureScreenShot(driver);
            global_feeds_page_object.home_button.click();

        }
        catch (Exception e) {
            System.out.print("Unable to find the post comment element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }
}
