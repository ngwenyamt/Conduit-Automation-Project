package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewPostPageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/nav/div/ul/li[2]/a")
    public WebElement new_post_link;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/button")
    public WebElement publish_article_button;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[1]/input")
    public WebElement article_title_field;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[2]/input")
    public WebElement article_about_field;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[3]/textarea")
    public WebElement article_textarea;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/form/fieldset/fieldset[4]/input")
    public WebElement article_tags;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[1]")
    public WebElement title_validation_error;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[2]")
    public WebElement body_validation_error;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div/ul/li[3]")
    public WebElement description_validation_error;


}
