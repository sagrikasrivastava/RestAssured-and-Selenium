package com.sagrika.webdriver.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractWebDriverTest {

	protected WebDriver driver;

	public AbstractWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		// Download the web driver executable
		WebDriverManager.firefoxdriver().setup();
		// Create a instance of your web driver-fire fox
		driver = new FirefoxDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();

	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
