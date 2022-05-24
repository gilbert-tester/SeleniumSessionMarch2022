package com.qa.company.tests;

import org.testng.annotations.Test;

import com.qa.company.drivermanager.DriverManager;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class EbayTest extends DriverManager {

	

	@Test(priority = 1)
	public void eBayTitleTest() {

		String expected = "Amazon.com. Spend less. Smile more.";
		String actual = driver.getTitle();

		System.out.println("Page title is " + actual);
		Assert.assertEquals(actual, expected, "Wrong title");

		System.out.println("Page title is " + actual);

	}

}
