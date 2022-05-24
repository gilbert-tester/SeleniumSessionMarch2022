package com.qa.company.testNG;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertDemo {

	WebDriver driver;
	SoftAssert softAssert;

	@BeforeMethod
	//@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority =2, invocationCount = 1)
	public void orangeHRMLogoTest() {
		
	
	Assert.assertTrue(driver.findElement(By.id("divLogo")).isDisplayed());

	}

	@Test(priority =1)
	public void orangeHRMTitleTest() {
		
		softAssert = new SoftAssert();
		
		
		String expectedTitle = "google";
		String actualTitle = driver.getTitle();
		
//		System.out.println("Page title is " + actualTitle );
		
//		softAssert.assertTrue(true);
		
		softAssert.assertEquals(actualTitle, expectedTitle, "Wrong Title");
		
		
		
	//	assertEquals(actual, expected, "Wrong title");
		
	//	assertTrue(false);
		

		System.out.println("Page title is " + actualTitle );

	}

//	@Test (priority =1)
//	public void loginTextTest() {
//
//		String text = driver.findElement(By.id("logInPanelHeading")).getText();
//
//		System.out.println("Login panel text " + text);
//
//	}

//	@AfterTest
@AfterMethod
	public void tearDown() {

		driver.quit();

	}
	
	
	
	
}
