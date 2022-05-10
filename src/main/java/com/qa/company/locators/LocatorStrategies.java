package com.qa.company.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategies {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.)
		
		//1.  ID -> Unique - 1st choice
		
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		
		//2. name -> can be duplicate -- 2nd choice'
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//3. ClassName - can be same for the different elements -- not recommended -
		
		
		//4.  Tag Name - html tag, not an attribute -- not recommended
		
		// 5. link text: only for links
		
		// 6. partial link text: only for links
		
		// 7. CSS selector: is not an attribute -- not recommended
		
		// 8. Xpath - //tagname[@Attribute='value']
		
		List<WebElement> tagName = driver.findElements(By.tagName("input"));
		
		System.out.println(tagName);
		
		
	}

}
