package com.atmecs.toolsqademosite.pages;

import java.io.IOException;

import com.atmecs.toolsqademosite.helper.ClickOperation;
import com.atmecs.toolsqademosite.testsuit.TestBase;

public class BackToProduct extends TestBase
{
	 public static void backToHome() throws IOException
	   {
		   
			ClickOperation.pg_click_opr(driver, backtoproduct);
			
	   }
}
