package com.atmecs.toolsqademosite.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.constants.GetDataSet;
import com.atmecs.toolsqademosite.constants.PageActionGetText;
import com.atmecs.toolsqademosite.helper.ClickOperation;
import com.atmecs.toolsqademosite.keyset.ExpectedDataSet;
import com.atmecs.toolsqademosite.pages.BackToProduct;
import com.atmecs.toolsqademosite.reports.ReportsGeneration;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ExcelDataReader;
import com.atmecs.toolsqademosite.utils.ScreenShot;
import com.atmecs.toolsqademosite.validation.PageValidation;

/**
 * Validate the product list from a 3rd-page based on color,size.style and sorting.
 * @author Subhasri.Natarajan
 *
 */

public class ShopThirdPageProductListValidation extends TestBase
{
	
	ReportsGeneration obj=new ReportsGeneration();
	
   @Test	
   public void shopthirdpageProductlistvalidation() throws  IOException
   {
	     ExpectedDataSet.getdata();
		 
	     ExcelDataReader config = new ExcelDataReader(Constants.PRODUCTLIST_FILE);
	   
	     GetDataSet.getDataSet(driver, getproductcolor, config.getKeyValue(0, 0, 2));
	     
	   
	     
	     ClickOperation.pg_click_opr(driver, purchaseblack_tshirt);
	     
	     PageActionGetText.get_text(driver, blackdresstitlevalidate);
		 
		 PageValidation.pg_validation(PageActionGetText.text, ExpectedDataSet.getEcpextedblacktitle(), "Validation of product available");
		  
	     
	     BackToProduct.backToHome();
	     
         GetDataSet.getDataSet(driver, getproductsorting, config.getKeyValue(0, 3, 2));

	     
	     ClickOperation.pg_click_opr(driver, productpage);
	     
	     BackToProduct.backToHome();
	     
	     GetDataSet.getDataSet(driver, getproductsize, config.getKeyValue(0, 1, 1));
	     

	     
	     BackToProduct.backToHome();
	     
	     GetDataSet.getDataSet(driver, getproductstyle, config.getKeyValue(0, 2, 2));
	     
	     BackToProduct.backToHome();
	     
	     obj.reportLog("purchasedProdGrandTotalValidationAfterRemovalOneProduct");
			
			ScreenShot.getScreenshot("Tools");
   }
}
