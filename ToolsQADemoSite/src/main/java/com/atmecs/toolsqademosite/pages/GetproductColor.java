package com.atmecs.toolsqademosite.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.constants.GetDataSet;
import com.atmecs.toolsqademosite.helper.EnterOperation;
import com.atmecs.toolsqademosite.helper.SearchProduct;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ConfigReader;
import com.atmecs.toolsqademosite.utils.ExcelDataReader;

public class GetproductColor extends TestBase

{
	public static void setproductcolor() throws IOException, InterruptedException
    {
    	ExcelDataReader config = new ExcelDataReader(Constants.KEYVALUE_FILE);
    	properties = ConfigReader.loadProperty(Constants.PURCHASE_FILE);
		GetDataSet.getDataSet(driver, getproductcolor, config.getKeyValue(0, 0, 3));
		EnterOperation.pressEnter();
	}
	
}
