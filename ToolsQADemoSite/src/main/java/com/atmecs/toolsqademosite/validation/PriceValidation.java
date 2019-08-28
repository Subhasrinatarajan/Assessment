package com.atmecs.toolsqademosite.validation;

import org.testng.Assert;

public class PriceValidation 
{
	public static void price_validation(Double actualTitle, Double expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);

			System.out.println("Passed: " + message + " EXPECTED: " + expectedTitle + " ACTUAL: " + actualTitle);
		} catch (AssertionError assertionError) {
			
			System.out.println("Failed" + message + expectedTitle + actualTitle);
		}
	}
}
