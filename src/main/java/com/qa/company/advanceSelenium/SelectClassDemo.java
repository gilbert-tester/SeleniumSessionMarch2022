package com.qa.company.advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		Select select = new Select(driver.findElement(By.id("Form_submitForm_Country")));
		
		//System.out.println(select.isMultiple());
		
		//System.out.println(select.getAllSelectedOptions());
		
		select.selectByIndex(20);
		
		//select.selectByValue("India");
		
	//	System.out.println(select);
		
		select.selectByVisibleText("Bangladesh");
		
		//Select selects = new Select((WebElement) driver.findElements(By.id("Form_submitForm_Country")));
		
	//	System.out.println(selects);
		
		WebElement selectElement = (WebElement) driver.findElements(By.id("Form_submitForm_Country"));
		Select selectObject = new Select(selectElement);
			
		
		List<WebElement> allSelectedOptions = selectObject.getAllSelectedOptions();
		
		
		int quantity = allSelectedOptions.size();
		
//		for (int i =0; i < quantity; i ++) {
//			
//			allSelectedOptions[i].
//			
//		}
		
		
	}

}
