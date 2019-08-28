package com.atmecs.toolsqademosite.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.constants.GetDataSet;
import com.atmecs.toolsqademosite.constants.PageActionGetText;
import com.atmecs.toolsqademosite.helper.ClickOperation;
import com.atmecs.toolsqademosite.keyset.ExpectedDataSet;
import com.atmecs.toolsqademosite.reports.ReportsGeneration;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ExcelDataReader;
import com.atmecs.toolsqademosite.utils.ScreenShot;
import com.atmecs.toolsqademosite.validation.PageValidation;

/**
 * Validate product list from a 3rd-page. To check the product is available or
 * not on that product page based on product color.
 * 
 * @author Subhasri.Natarajan
 *
 */
public class ShopThirdPageValidation extends TestBase {
	ReportsGeneration obj = new ReportsGeneration();

	@Test
	public void shopthirdpgvalidation() throws InterruptedException, IOException {
		ExpectedDataSet.getdata();
		ExcelDataReader config = new ExcelDataReader(Constants.KEYVALUE_FILE);

		GetDataSet.getDataSet(driver, getproductcolor, config.getKeyValue(0, 0, 3));

		ClickOperation.pg_click_opr(driver, productpage);

		PageActionGetText.get_text(driver, productpagevalidate);

		PageValidation.pg_validation(PageActionGetText.text, ExpectedDataSet.getExpectedproducttitle(),
				"Validation of product available");

		obj.reportLog("purchasedProdGrandTotalValidationAfterRemovalOneProduct");

		ScreenShot.getScreenshot("Tools");

	}
}
