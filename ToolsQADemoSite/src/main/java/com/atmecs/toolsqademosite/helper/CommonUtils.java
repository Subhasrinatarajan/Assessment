package com.atmecs.toolsqademosite.helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ConfigReader;



public class CommonUtils extends TestBase
{
   public static void windowManagement()
   {
	    driver.get(ConfigReader.properties.getProperty("link.url"));
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
   }
   
  
}
