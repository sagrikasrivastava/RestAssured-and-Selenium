package com.sagrika.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class IFramesTesting {
	
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void iFramesPractice1() {
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		String pageTitle = driver.switchTo().frame(0).findElement(By.cssSelector("#main > div:nth-child(7) > iframe:nth-child(1)")).getText();
		System.out.println(pageTitle);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}
}
