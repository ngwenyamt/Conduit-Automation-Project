package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PopularTagsPageObject {


    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div[2]/div/div/a[1]")
    public WebElement popular_tags_link;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div[1]/div[2]/div[1]/a/span")
    public WebElement popular_tags_read_more_link;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div[2]/div[3]/div/div[1]/form/div[1]/textarea")
    public WebElement popular_tags_capture_comment;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div[2]/div[3]/div/div[1]/form/div[2]/button")
    public WebElement popular_tags_post_comment;
}
