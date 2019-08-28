package com.atmecs.toolsqademosite.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.testsuit.TestBase;



public class PropertyFileProvider extends TestBase 
{

		private static PropertyFileProvider propReader;
		private Properties prop;

		//loads all files
		private PropertyFileProvider() {
		List<String> propsFiles = Arrays.asList(Constants.PURCHASE_FILE,Constants.EXPECTEDTITLE_FILE);
		prop = new Properties();

		for (String filePath : propsFiles) {
		try {
		prop.load(new FileInputStream(new File(filePath)));
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		}
		 public static PropertyFileProvider getInstance()
		 { 
		 if(propReader == null)
		 {
		propReader = new PropertyFileProvider();
		 }
		 return propReader;
		 }
		public String getValue(String key) {
		return prop.getProperty(key);
		}
		
		
		/*String secondprod=driver.findElement(By.xpath(secondprodpath)).getText();*/
	
		public static void main(String[] args) {
		String s=propReader.getValue("clickTogglePass");
		System.out.println(s);
		}
}
