package com.atmecs.toolsqademosite.helper;

import java.io.IOException;

import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ConfigReader;


public class SearchProduct extends TestBase {

	
	public static void searchProducts() throws InterruptedException, IOException {

		String searchFunction = ConfigReader.getData("loc.icon.searchfunction");
		ClickOperation.click_operation(driver, searchFunction);
	}

}