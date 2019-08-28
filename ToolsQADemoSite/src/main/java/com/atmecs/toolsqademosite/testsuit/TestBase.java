package com.atmecs.toolsqademosite.testsuit;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.helper.CommonUtils;
import com.atmecs.toolsqademosite.utils.ConfigReader;
import com.atmecs.toolsqademosite.utils.PropertyFileProvider;
import com.relevantcodes.extentreports.ExtentReports;


public class TestBase  {
	public static Properties properties;
	public static WebDriver driver;
	
	
	protected static boolean grandtotalvalidation=true;
	protected static double sumofproducts;
	 
	 
	
    protected static PropertyFileProvider propReader = PropertyFileProvider.getInstance();   
    
    
    protected static String desc=propReader.getValue(" par.blacktshirt.desc");
    
    protected static String backtoproduct = propReader.getValue("loc.link.backtoproduct");
    
	protected static String purchaseblack_tshirt = propReader.getValue("loc.link.purchaseblack_tshirt");
    protected static String addtocart = propReader.getValue("loc.btn.adddtocart");
   
    
   
    protected static String firstprodpath = propReader.getValue("loc.span.firstproductvalue");
    
    protected static String producttitle=propReader.getValue("loc.txt.producttitle");
    
    //image
    
    protected static String blackimg = propReader.getValue("loc.img.black_tshirt");
    
    //clr
    protected static String path="pa_color";
    protected static String getproductcolor = propReader.getValue("loc.dropdown.filtercolor");
    protected static String getproductsize = propReader.getValue("loc.dropdown.filtersize");
    protected static String getproductstyle = propReader.getValue("loc.dropdown.filterstyle");
    protected static String getproductsorting = propReader.getValue("loc.dropdown.sorting");
    
    protected static String productpage=propReader.getValue("loc.link.product");
    
    //vali
    protected static String productpagevalidate=propReader.getValue("loc.txt.producttitle");
    protected static String blackdresstitlevalidate=propReader.getValue("loc.txt.blacktitle");
    
    
    
    
	@BeforeClass
	public static void openBrowser() throws IOException {
		Browser.browsers();
	    CommonUtils.windowManagement();	
	}
	
	  

	@AfterClass
	public static void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
		
	}
	
	
}
