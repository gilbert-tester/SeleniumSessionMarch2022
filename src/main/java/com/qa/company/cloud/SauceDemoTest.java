package com.qa.company.cloud;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoTest {

	//https://docs.saucelabs.com/web-apps/automated-testing/selenium/
	
		WebDriver driver;
		public static final String USERNAME = "oauth-pakthertester-2c1a9";
		public static final String ACCESS_KEY = "94732b45-5641-4c13-a501-90fbdcf0c829";

		@Parameters({"browser", "platform", "version"})
		@BeforeMethod
		
		public void setUp(String browserName, String platformName, String versionName,  Method name) {

			System.out.println("browser name is : " + browserName);
			String methodName = name.getName();

			MutableCapabilities sauceOpts = new MutableCapabilities();
			sauceOpts.setCapability("name", methodName);
			sauceOpts.setCapability("build", "Java-W3C-Examples");
			sauceOpts.setCapability("seleniumVersion", "3.141.59");
			sauceOpts.setCapability("username", USERNAME);
			sauceOpts.setCapability("accessKey", ACCESS_KEY);
			sauceOpts.setCapability("tags", "w3c-chrome-tests");

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("sauce:options", sauceOpts);
			cap.setCapability("browserVersion", versionName);
			cap.setCapability("platformName", platformName);

			if (browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				cap.setCapability("browserName", "chrome");
			} else if (browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				cap.setCapability("browserName", "firefox");
			}
			
			try {
				driver = new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"), cap);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		}
		@Test
		public void veriyLogin() {
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
			
			//login
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
			
		}
		@AfterMethod(alwaysRun = true)
		public void tearDown() {
			driver.quit();
			
		}
	
	
}
