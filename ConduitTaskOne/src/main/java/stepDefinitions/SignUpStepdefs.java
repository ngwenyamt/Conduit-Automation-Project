package stepDefinitions;

import PageObjects.SignUpPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SignUpStepdefs extends TestEvidence{
    public static WebDriver driver;
    public static SignUpPageObject signup_page_object;
    @Given("^user is on home page$")
    public void userIsOnHomePage() {

        File file = new File(".\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try
        {
            driver.get("https://react-redux.realworld.io/#/?_k=7xv0zj");
            captureScreenShot(driver);
            Assert.assertTrue(true);
            Thread.sleep(5000);

        }
        catch (Exception e) {
            System.out.print("Unable to access the Conduit App URL. server might be down or not able to find the element(s) \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }
    }

    @Then("^user navigate to sign up$")
    public void userNavigateToSignUp() {
        signup_page_object = PageFactory.initElements(driver,SignUpPageObject.class);
        try
        {
            signup_page_object.signup_link.click();
            Assert.assertTrue(true);
            captureScreenShot(driver);
            Thread.sleep(6000);

        }
        catch (Exception e) {
            System.out.print("Unable to find the Signup Link Element \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }
    }

    @And("^user enter invalid \"([^\"]*)\" and \"([^\"]*)\" and click Sign in button$")
    public void userEnterInvalidAndAndClickSignInButton(String arg0, String arg1) throws Throwable {
        try
        {
            signup_page_object.email_address.clear();
            signup_page_object.email_address.sendKeys(arg0);
            captureScreenShot(driver);
            signup_page_object.password.clear();
            signup_page_object.password.sendKeys(arg1);
            captureScreenShot(driver);
            signup_page_object.signin_button.click();
            Thread.sleep(6000);
            captureScreenShot(driver);
            String error = signup_page_object.email_address.getAttribute("validationMessage");
            if(error.equals("Please include an '@' in the email address. 'tebogongwenyagmail.com' is missing an '@'.")) {

                Assert.assertTrue(true);
                System.out.print("Email validation passed \r\n");
                signup_page_object.email_address.clear();
                signup_page_object.email_address.clear();
                captureScreenShot(driver);
                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(1000);
                signup_page_object.email_address.sendKeys("tebogongwenya"+ randomInt +"@gmail.com");
                captureScreenShot(driver);
                signup_page_object.signin_button.click();

                Thread.sleep(6000);

                if (signup_page_object.password_validation_text.getText().equals("password is too short (minimum is 8 characters)") && signup_page_object.username_validation_text.getText().equals("username can't be blankis too short (minimum is 1 character)is too long (maximum is 20 characters)")) {
                    captureScreenShot(driver);
                    Assert.assertTrue(true);
                    System.out.print("Password and username validation passed \r\n");
                }
            }
            else
            {

                Assert.assertTrue(false);
                System.out.print("Email validation failed \r\n");

            }
        }
        catch (Exception e) {
            System.out.print("Unable to find the username/password Elements \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }

    @And("^user enter \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\" and click Sign in button$")
    public void userEnterAndValidAndAndClickSignInButton(String arg0, String arg1, String arg2) throws Throwable {

        try
        {
            signup_page_object.username.clear();
            signup_page_object.username.sendKeys(arg0);
            captureScreenShot(driver);
            signup_page_object.email_address.clear();
            signup_page_object.email_address.sendKeys(arg1);
            captureScreenShot(driver);
            signup_page_object.password.clear();
            signup_page_object.password.sendKeys(arg2);
            captureScreenShot(driver);
            signup_page_object.signin_button.click();
            Assert.assertTrue(true);
            Thread.sleep(5000);

            if(signup_page_object.Email_exist.getText().equals("email has already been taken") || signup_page_object.username_exist.getText().equals("username has already been taken"))
            {
                captureScreenShot(driver);
                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(1000);
                signup_page_object.email_address.clear();
                signup_page_object.email_address.sendKeys("NgwenyaT"+ randomInt +"@gmail.com");
                captureScreenShot(driver);
                System.out.print("New email has been generated \r\n");


                signup_page_object.username.clear();
                signup_page_object.username.sendKeys("NgwenyaT"+ randomInt);
                captureScreenShot(driver);
                signup_page_object.signin_button.click();
                System.out.print("New username has been generated \r\n");
                Assert.assertTrue(true);
           }
            else
            {
                System.out.print("Email or username has not been taken \r\n");
                Assert.
                        assertTrue(false);
            }

        }
        catch (Exception e) {
            System.out.print("Unable to signup user details \r\n");
            Assert.assertTrue(false);
            e.printStackTrace();
        }

    }
}
