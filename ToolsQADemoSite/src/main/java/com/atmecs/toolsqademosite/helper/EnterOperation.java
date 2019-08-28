package com.atmecs.toolsqademosite.helper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.toolsqademosite.testsuit.TestBase;



public class EnterOperation extends TestBase {
	static Actions action;
	
	public static void pressEnter()
	{
		action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
}
