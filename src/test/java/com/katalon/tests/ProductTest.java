package com.katalon.tests;

import org.testng.annotations.Test;

import com.katalon.pages.BasePage;
import com.katalon.pages.ProductPage;

public class ProductTest extends BasePage {
	
	ProductPage productpage;
	
	@Test
	public void RegisterTest() {
		test = extent.createTest("Product Test").info("Product Test Execution Started");
		productpage = new ProductPage(driver, test);
		productpage.selectNinja();
		productpage.clickonAddtocart();
		productpage.clickonViewcart();
		productpage.selectProceedtoCheckout();
		productpage.enterFirstname();
		productpage.enterLastname();
		productpage.enterCompanyname();
		productpage.selectCountry();
		productpage.enterCountry();
		productpage.enterStreetAddress();
		productpage.enterCity();
		productpage.enterCounty();
		productpage.enterPostcode();
		productpage.enterPhone();
		productpage.enterEmail();
		productpage.clickonPlaceOrder();
		
		test.info("Product Test Execution Completed Successfully");
	}

}