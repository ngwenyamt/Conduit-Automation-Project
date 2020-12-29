package stepDefinitions;

import PageObjects.GlobalFeedsPageObject;
import PageObjects.NewPostPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static stepDefinitions.SignUpStepdefs.driver;
public class NewPostStepdefs extends TestEvidence{
    public static NewPostPageObject new_post_page_object;
    @And("^user navigate to new post$")
    public void userNavigateToNewPost() {

        new_post_page_object = PageFactory.initElements(driver,NewPostPageObject.class);

        try {
            Thread.sleep(4000);
            new_post_page_object.new_post_link.click();
            Thread.sleep(3000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the new post link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user click on publish Article button$")
    public void userClickOnPublishArticleButton() {

        try {
            Thread.sleep(4000);

            new_post_page_object.publish_article_button.sendKeys();
            captureScreenShot(driver);
            new_post_page_object.publish_article_button.click();

            Thread.sleep(4000);

//            if(new_post_page_object.title_validation_error.getText().equals("title can't be blankis too short (minimum is 1 character)") && new_post_page_object.body_validation_error.getText().equals("body can't be blank") && new_post_page_object.description_validation_error.getText().equals("description can't be blankis too short (minimum is 1 character)"))
//            {
//                Assert.assertTrue(true);
//                captureScreenShot(driver);
//
//            }
//            else
//            {
//                Assert.assertTrue(false);
//
//            }


        } catch (Exception e) {
            System.out.print("Unable to find the publish article button element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user enter article \"([^\"]*)\"$")
    public void userEnterArticle(String arg0) {
        try {
            Thread.sleep(2000);
            new_post_page_object.article_title_field.sendKeys(arg0);
            Thread.sleep(2000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the article title link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }
    }

    @And("^user enter what the article is \"([^\"]*)\"$")
    public void userEnterWhatTheArticleIs(String arg0) {
        try {
            Thread.sleep(2000);
            new_post_page_object.article_about_field.sendKeys(arg0);
            Thread.sleep(2000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the article about link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }
    }

    @And("^user enter articles \"([^\"]*)\"$")
    public void userEnterArticles(String arg0) {
        try {
            Thread.sleep(2000);
            new_post_page_object.article_textarea.sendKeys(arg0);
            Thread.sleep(2000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the article textarea link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user enter \"([^\"]*)\"$")
    public void userEnter(String arg0) {

        try {
            Thread.sleep(2000);
            new_post_page_object.article_tags.sendKeys(arg0);
            Thread.sleep(2000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the article tags link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user click on the publish Article button again$")
    public void userClickOnThePublishArticleButtonAgain() {

        try {
            Thread.sleep(2000);
            new_post_page_object.publish_article_button.click();
            Thread.sleep(4000);
            captureScreenShot(driver);
            Assert.assertTrue(true);

        } catch (Exception e) {
            System.out.print("Unable to find the article textarea link element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }
}
