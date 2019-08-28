package com.atmecs.toolsqademosite.validation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImageValidation extends TestBase 
{
	public static void imageComaparision() throws IOException
    {

         
        WebElement logoImage = driver.findElement(By.xpath(blackimg));
         
        BufferedImage expectedImage = ImageIO.read(new File(System.getProperty("user.dir") +"\\image-validation\\shophmpg_productvalidation.png"));
        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImage);
        BufferedImage actualImage = logoImageScreenshot.getImage();
                 
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
        Assert.assertFalse(diff.hasDiff(),"Images are Same");
                 
        driver.quit();
    }
}
