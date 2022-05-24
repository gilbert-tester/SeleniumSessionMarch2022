package com.qa.company.tests;

import org.testng.annotations.Test;

import com.qa.company.drivermanager.DriverManager;

import org.testng.Assert;

public class AmazonTest extends DriverManager{

	
	@Test(priority = 1)
	public void amazonTitleTest() {

		String expected = "Amazon.com. Spend less. Smile more.";
		String actual = driver.getTitle();

		System.out.println("Page title is " + actual);
		Assert.assertEquals(actual, expected, "Wrong title");

		System.out.println("Page title is " + actual);

	}

//	@Test (priority =1)
//	public void loginTextTest() {
//
//		String text = driver.findElement(By.id("logInPanelHeading")).getText();
//
//		System.out.println("Login panel text " + text);
//
//	}

}
