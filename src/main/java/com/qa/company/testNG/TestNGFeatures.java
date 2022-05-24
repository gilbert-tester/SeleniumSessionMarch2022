package com.qa.company.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {

	// global pre conditions
	// pre condition
	// Test steps
	// actual vs expected
	// Pass or fail

	/*
	 * @BeforeSuite
	 * 
	 * @AfterSuite
	 * 
	 * @BeforeTest
	 * 
	 * @AfterTest
	 * 
	 * @BeforeGroups
	 * 
	 * @AfterGroups
	 * 
	 * @BeforeClass
	 * 
	 * @AfterClass
	 * 
	 * @BeforeMethod
	 * 
	 * @AfterMethod
	 */

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before suite -> Create user");

	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("After suite -> Delete user");

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Before Test -> Method before test cases");

	}

	@AfterTest
	public void afterTest() {

		System.out.println("After Test -> Method After test cases");

	}

	@BeforeGroups
	public void beforeGroup() {

		System.out.println("Before Group -> Grouping before test cases");

	}

	@AfterGroups
	public void afterGroup() {

		System.out.println("After Group -> Grouping After test cases");

	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before Class -> Class before test cases");

	}

	@AfterClass
	public void afterClass() {

		System.out.println("After Class -> Class After test cases");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method -> Method before test cases");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method -> Method after test cases");

	}
	
	
	@Test
	public void aUserDataTest() {
		
		System.out.println("User data test");
		

	}
	
	@Test(priority =1)
	public void userProfileTest() {
		
		System.out.println("User Profile test");
		

	}
	
	@Test(priority =0)
	public void myThirdTestCase() {
		
		System.out.println("Testing before method and after method");
		

	}
	

}
