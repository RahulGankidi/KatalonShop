package com.katalon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class ProductPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest test;
	
	public ProductPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.test = test;
	}
	By SelectNinja = By.xpath("(//*[@class=\"woocommerce-loop-product__title\"])[1]");
	By ClickAddtoCart = By.xpath("//*[@class=\"single_add_to_cart_button button alt\"]");
	By ClickViewCart = By.xpath("//*[@class=\"button wc-forward\"]");
	By ProceedCheckout = By.xpath("//*[@class=\"checkout-button button alt wc-forward\"]");
	By Firstname = By.id("billing_first_name");
	By Lastname = By.id("billing_last_name");
	By Companyname = By.id("billing_company");
	By SelectCountry = By.id("select2-billing_country-container");
	By EnterCountry = By.xpath("//*[@class=\"select2-search__field\"]");
	By StreetAddress = By.id("billing_address_1");
	By EnterCity = By.xpath("(//*[@class=\"input-text \"])[6]");
	By EnterCounty = By.xpath("(//*[@class=\"input-text \"])[7]");
	By EnterPostcode = By.xpath("(//*[@class=\"input-text \"])[8]");
	By EnterPhone = By.xpath("(//*[@class=\"input-text \"])[9]");
	By EnterEmail = By.xpath("(//*[@class=\"input-text \"])[10]");
	By ClickPlaceOrder = By.id("place_order");
	
	public void selectNinja() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ninjaElement = wait.until(ExpectedConditions.elementToBeClickable(SelectNinja));
		ninjaElement.click();
		test.pass("Selected Ninja");
	}
	public void clickonAddtocart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addtocartElement = wait.until(ExpectedConditions.elementToBeClickable(ClickAddtoCart));
		addtocartElement.click();
		test.pass("Clicked on Add to Cart");
	}
	public void clickonViewcart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement viewcartElement = wait.until(ExpectedConditions.elementToBeClickable(ClickViewCart));
		viewcartElement.click();
		test.pass("Clicked on View Cart");
	}
	public void selectProceedtoCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkoutElement = wait.until(ExpectedConditions.elementToBeClickable(ProceedCheckout));
		checkoutElement.click();
		test.pass("Selected Proceed to Checkout");
	}
	public void enterFirstname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement firstnameElement = wait.until(ExpectedConditions.elementToBeClickable(Firstname));
		firstnameElement.click();
		firstnameElement.sendKeys("Pradeep");
		test.pass("Entered Firstname");
	}
	public void enterLastname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement lastnameElement = wait.until(ExpectedConditions.elementToBeClickable(Lastname));
		lastnameElement.click();
		lastnameElement.sendKeys("Rao");
		test.pass("Entered Lastname");
	}
	public void enterCompanyname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement companynameElement = wait.until(ExpectedConditions.elementToBeClickable(Companyname));
		companynameElement.click();
		companynameElement.sendKeys("Pradeep Industries");
		test.pass("Entered Company Name");
	}
	public void selectCountry() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement countryElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCountry));
		countryElement.click();
		test.pass("Selected Country");
	}
	public void enterCountry() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement entercountryElement = wait.until(ExpectedConditions.elementToBeClickable(EnterCountry));
		entercountryElement.click();
		entercountryElement.sendKeys("United Kingdom");
		test.pass("Entered Country");
	}
	public void enterStreetAddress() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addressElement = wait.until(ExpectedConditions.elementToBeClickable(StreetAddress));
		addressElement.click();
		addressElement.sendKeys("10 Leeby Road");
		test.pass("Entered Street Address");
	}
	public void enterCity() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cityElement = wait.until(ExpectedConditions.elementToBeClickable(EnterCity));
		cityElement.click();
		cityElement.sendKeys("North Wales");
		test.pass("Entered City");
	}
	public void enterCounty() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement countyElement = wait.until(ExpectedConditions.elementToBeClickable(EnterCounty));
		countyElement.click();
		countyElement.sendKeys("Chester");
		test.pass("Entered County");
	}
	public void enterPostcode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement postcodeElement = wait.until(ExpectedConditions.elementToBeClickable(EnterPostcode));
		postcodeElement.click();
		postcodeElement.sendKeys("DF23FD");
		test.pass("Entered Postcode");
	}
	public void enterPhone() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement phoneElement = wait.until(ExpectedConditions.elementToBeClickable(EnterPhone));
		phoneElement.click();
		phoneElement.sendKeys("07722554466");
		test.pass("Entered Phone");
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(EnterEmail));
		emailElement.click();
		emailElement.sendKeys("pradeeprao11@gmail.com");
		test.pass("Entered Email");
	}
	public void clickonPlaceOrder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement placeorderElement = wait.until(ExpectedConditions.elementToBeClickable(ClickPlaceOrder));
		placeorderElement.click();
		test.pass("Clicked on Place Order");
	}
}