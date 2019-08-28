package com.atmecs.toolsqademosite.keyset;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.testsuit.TestBase;
import com.atmecs.toolsqademosite.utils.ConfigReader;



/**
 * @author Subhasri.Natarajan
 * @category validation dataset
 */
public class ExpectedDataSet extends TestBase {
	public static Properties properties;
	public static String shop_hmpg;
	public static String pinkproduct;
	public static String firstProductCost;
	public static String secondProductCost;
    
	public static String expectedproducttitle;
	public static String ecpextedblacktitle;
	
	

	public static String getEcpextedblacktitle() {
		return ecpextedblacktitle;
	}




	public static void setEcpextedblacktitle() throws IOException {
		ecpextedblacktitle = ConfigReader.getData("txt.expexttitle");
	}




	public static void getdata() throws IOException {
		try {
			properties = ConfigReader.loadProperty(Constants.EXPECTEDTITLE_FILE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		setShop_hmpg();
		setPinkproduct();
		setExpectedproducttitle();
		setEcpextedblacktitle();
	}

	
	
	
	public static String getExpectedproducttitle() {
		return expectedproducttitle;
	}

	public static void setExpectedproducttitle() {
		try {
			expectedproducttitle = ConfigReader.getData("par.blacktshirt.desc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static String getShop_hmpg() {
		return shop_hmpg;
	}

	public static void setShop_hmpg() {
		try {
			shop_hmpg = ConfigReader.getData("txt.toolsqademoshop_hmpg_tilte");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getPinkproduct() {
		return pinkproduct;
	}

	public static void setPinkproduct() {
		try {
			pinkproduct = ConfigReader.getData("txt.hmpg_submenu_service_title");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		ExpectedDataSet dataSet = new ExpectedDataSet();
		dataSet.getdata();

	}

}
