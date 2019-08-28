package com.atmecs.toolsqademosite.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.atmecs.toolsqademosite.testsuit.TestBase;



public class ScreenShot extends TestBase 
{
   public static String getScreenshot(String screenshotName) throws IOException
   {
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 String path=System.getProperty("user.dir")+"/image-validation/"+ screenshotName +".png";
	 File destination= new File(path);
	 FileUtils.copyFile(src, destination);
	 
	 return path;
   }
}
