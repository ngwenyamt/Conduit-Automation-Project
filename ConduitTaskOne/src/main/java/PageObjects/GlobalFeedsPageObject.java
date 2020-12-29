package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GlobalFeedsPageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div[1]/div[1]/ul/li[2]/a")
    public WebElement blobal_feeds_link;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div/div/div[1]/div[2]/div[1]/a/span")
    public WebElement read_more_link;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div[2]/div[3]/div/div[1]/form/div[1]/textarea")
    public WebElement write_comment_textArea;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/div/div[2]/div[3]/div/div[1]/form/div[2]/button")
    public WebElement post_comment_button;

    @FindBy(how = How.XPATH, using = "//*[@id=\'main\']/div/nav/div/ul/li[1]/a")
    public WebElement home_button;


}
