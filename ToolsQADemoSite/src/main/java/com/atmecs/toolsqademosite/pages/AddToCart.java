package com.atmecs.toolsqademosite.pages;

import java.io.IOException;


import com.atmecs.toolsqademosite.helper.ClickOperation;
import com.atmecs.toolsqademosite.helper.Scrolling;
import com.atmecs.toolsqademosite.testsuit.TestBase;


public class AddToCart extends TestBase
{
  public static void addtocart() throws IOException
  {
	  
	  Scrolling.dropdown("pa_color", 2);
      Scrolling.dropdown("pa_size", 1);
         
      ClickOperation.pg_click_opr(driver,addtocart);
     
  }
}
