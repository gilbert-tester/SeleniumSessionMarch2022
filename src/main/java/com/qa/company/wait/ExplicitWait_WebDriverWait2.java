package com.qa.company.wait;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_WebDriverWait2 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//ExplicitWait --> 1. webdriverwait 2. FluentWait
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://app.hubspot.com/login");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	//	String loginTitle = waitForPageTitlePresent("Login", 10);
	//	System.out.println(loginTitle);
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		//wait1.until(ExpectedConditions.titleIs("HubSpot Login"));
//		wait1.until(ExpectedConditions.titleContains("Login"));
//		
//		System.out.println(driver.getTitle());
		
		By username = By.id("txtUsername");
		By password = By.id("txtPassword");
		
		By email = By.id("username");
		By pwd = By.id("password");
		By login = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");
		By firstName = By.id("uid-firstName-5");
		
		waitForElementToBeLocated(username, 10).sendKeys("Admin");
		waitForElementToBeLocated(password, 5).sendKeys("admin123");
		
//		waitForElementToBeLocated(username, 10).sendKeys("Admin");
//		waitForElementToBeLocated(password, 10).sendKeys("admin123");
		
//		driver.findElement(pwd).sendKeys("test@123");
	//	driver.findElement(login).click();
//		waitForElementToBeLocated(login, 5).click();
//		waitForElementToBeLocated(signUpLink, 5).click();
		
//		String signup_title = waitForPageTitlePresent("HubSpot CRM", 10);
//		System.out.println(signup_title);
		
//		waitForElementToBeLocated(firstName, 10).sendKeys("naveen");
		
		
		//webdriverwait is not a global wait
		//it will be applied to a specific element
		//we can customize this wait
		//it can be used for non web elements -- title, url, alerts
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element_email = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		element_email.sendKeys("test@gmail.com");
//		
//		driver.findElement(pwd).sendKeys("test@123");
//		driver.findElement(login).click();
		
	}
	
	public static WebElement waitForElementToBeLocated(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String waitForPageTitlePresent(String titleValue, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}

}
