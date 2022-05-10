package com.qa.company.wait;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_WebDriverWait {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

//		String title = driver.getTitle();
//
//		System.out.println("Getting title for the website :" + title);
		
//		WebElement username = driver.findElement(By.id("txtUsername"));
//		WebElement password = driver.findElement(By.id("txtPassword"));
//		
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated((By) username));
//		wait.until(ExpectedConditions.presenceOfElementLocated((By) password));
//		
		
		By username = By.id("txtUsername");
		By password = By.id("txtPassword");
		By submit = By.xpath("//*[@class='button']");
		
		
		String title = waitForPageTitlePresent("OrangeHRM", 3);
		System.out.println(title);
		
		
		waitForElementToBeLocated(username, 10).sendKeys("Admin");
		waitForElementToBeLocated(password, 5).sendKeys("admin123");
		waitForElementToBeLocated(submit, 5).click();
		
		

	}
	
	public static WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	public static String waitForPageTitlePresent(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
		
	}
	
}
