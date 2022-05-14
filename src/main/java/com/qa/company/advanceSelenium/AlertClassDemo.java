package com.qa.company.advanceSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClassDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// driver.findElement(By.id("alertbtn")).click();;

		driver.findElement(By.id("confirmbtn")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		Thread.sleep(2000);

		alert.accept();

		// alert.dismiss();

	}

}
