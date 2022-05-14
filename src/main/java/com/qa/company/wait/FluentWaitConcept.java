package com.qa.company.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

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
		
		
		// a. TimeOut, b. PollingPeriod, 3. ignoringException
		
//		Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
//				.withTimeout(Duration.ofSeconds(15))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
				
		
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("Admin");
//		wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("admin123");
//		wait.until(ExpectedConditions.presenceOfElementLocated(submit)).click();
		
		waitForElemenetWithFluentWait(username,15,5).sendKeys("Admin");
		waitForElemenetWithFluentWait(password,15,5).sendKeys("admin123");
		waitForElemenetWithFluentWait(submit,15,5).click();
		
	}
	
		public static WebElement waitForElemenetWithFluentWait(By locator, int timeOut, int pollingTime) {
			
			Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class);
				
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		}

}
