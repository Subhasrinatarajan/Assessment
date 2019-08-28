package com.atmecs.toolsqademosite.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.toolsqademosite.helper.ClickOperation;
import com.atmecs.toolsqademosite.reports.LogReportInformation;
import com.atmecs.toolsqademosite.reports.ReportsGeneration;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ConfigReader;
import com.atmecs.toolsqademosite.utils.ScreenShot;
import com.atmecs.toolsqademosite.validation.ImageValidation;
import com.atmecs.toolsqademosite.validation.PageValidation;
import com.atmecs.toolsqademosite.validation.PriceValidation;

/**
 * 
 * Validation of Homepage Product whether the productpage contains image, description, price and rating or not.
 * 
 * @author Subhasri.Natarajan
 * @category product validation
 */
public class ShopHomePageProductValidation extends TestBase
{
	ReportsGeneration obj=new ReportsGeneration();
	LogReportInformation log = new LogReportInformation();
	
   @Test	
   public void shophmpg_productvalidation() throws IOException
   {
	    log.info("Validate the home page");
	   
	    ClickOperation.pg_click_opr(driver, purchaseblack_tshirt);
	   
	    log.info("Taking screenshot");
	    
	    ScreenShot.getScreenshot("shophmpg_productvalidation");
	   
	    WebElement element=driver.findElement(By.xpath(blackimg));
	    element.isDisplayed();
	   
	    /*String pricevalidation=driver.findElement(By.xpath(firstprodpath)).getText();
		double blackdressprice=Double.valueOf(pricevalidation.substring(1, 5));
		
		PriceValidation.price_validation(blackdressprice, 18.00, "Price validation");*/
		
		
       obj.reportLog("purchasedProdGrandTotalValidationAfterRemovalOneProduct");
		
		ScreenShot.getScreenshot("Tools");
		
	   
	   
	   
   }
}
