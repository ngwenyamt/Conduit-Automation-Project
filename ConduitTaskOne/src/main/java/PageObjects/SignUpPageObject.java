package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[1]/input")
    public WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[2]/input")
    public WebElement email_address;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[3]/input")
    public WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/button")
    public WebElement signin_button;

    @FindBy(how = How.LINK_TEXT, using = "Sign up")
    public WebElement signup_link;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[1]")
    public WebElement password_validation_text;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[2]")
    public WebElement username_validation_text;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[2]")
    public WebElement username_exist;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[1]")
    public WebElement Email_exist;


}
