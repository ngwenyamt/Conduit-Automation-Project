package stepDefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TestEvidence {

    public static void captureScreenShot(WebDriver ldriver){
// Take screenshot
        File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(src, new File(".\\Test Evidence\\"+System.currentTimeMillis()+".png"));                              } catch (IOException e)

        {
            System.out.println(e.getMessage());
        }
    }
}
