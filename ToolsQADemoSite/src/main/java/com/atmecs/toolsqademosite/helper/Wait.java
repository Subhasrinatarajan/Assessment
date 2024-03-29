package com.atmecs.toolsqademosite.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.toolsqademosite.testsuit.TestBase;


public class Wait extends TestBase
{
    public static void ignoreTimeOut(String xpath)
    {
    	WebDriverWait wait = new WebDriverWait(driver, 3000);
    	 
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
}
