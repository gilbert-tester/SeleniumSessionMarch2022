package com.qa.company.advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassAllElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		Select dropdown = new Select(driver.findElement(By.id("Form_submitForm_Country")));

		// Get all options
		List<WebElement> dd = dropdown.getOptions();

		// Get the length
		System.out.println(dd.size());

		// Loop to print one by one
		for (int j = 0; j < dd.size(); j++) {
			System.out.println(dd.get(j).getText());

		}

	}

}
