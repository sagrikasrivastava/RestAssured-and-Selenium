package com.sagrika.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class OpenANewWindowTest extends AbstractWebDriverTest {

	@Test
	public void testForWindows() {
		driver.get("http://localhost:8080/pages/notifications.html");
		driver.findElement(By.id("newPageButton")).click();
		System.out.println("1- " + driver.getWindowHandle()); //1- 93277f11-218d-4543-957e-5f99ec3dab13
	}

}
