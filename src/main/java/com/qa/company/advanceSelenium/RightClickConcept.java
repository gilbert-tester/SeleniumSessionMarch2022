package com.qa.company.advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMe_Button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions (driver);
		
		action.contextClick(rightClickMe_Button).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
