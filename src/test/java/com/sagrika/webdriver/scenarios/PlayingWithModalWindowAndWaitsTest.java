package com.sagrika.webdriver.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PlayingWithModalWindowAndWaitsTest extends AbstractWebDriverTest {
	@Test(expectedExceptions = ElementNotVisibleException.class)
	public void playingWithModalWindows_expectingAnException() {
		driver.get("http://localhost:8080/pages/notifications.html");
		// id - modalButton , myModal , myModalBody , myModalLabel , myModalCloseButton
		driver.findElement(By.id("modalButton")).click();
		sleep(1);
		System.out.println(driver.findElement(By.id("myModalLabel")).getText());// Modal title
		driver.findElement(By.id("myModalCloseButton")).click();

	}

	@Test
	public void playingWithModalWindows_ImplicitlyWait() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/pages/notifications.html");
		// id - modalButton , myModal , myModalBody , myModalLabel , myModalCloseButton
		driver.findElement(By.id("modalButton")).click();
		// sleep(1);
		System.out.println(driver.findElement(By.id("myModalLabel")).getText());// Modal title
		driver.findElement(By.id("myModalCloseButton")).click();

	}

	@Test
	public void playingWithModalWindows_ExplicitlyWait() {

		driver.get("http://localhost:8080/pages/notifications.html");
		// id - modalButton , myModal , myModalBody , myModalLabel , myModalCloseButton
		driver.findElement(By.id("modalButton")).click();
		// sleep(1);

		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.withMessage("Waited for 10 seconds but still myModalLabel not available");
		WebElement modalLabel = webDriverWait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("myModalLabel"))));
		System.out.println(modalLabel.getText());// Modal title
		driver.findElement(By.id("myModalCloseButton")).click();
	}

	@Test
	public void testForAlert() {
		driver.get("http://localhost:8080/pages/notifications.html");
		driver.findElement(By.id("alertButton")).click();
		Alert alertQuestion = driver.switchTo().alert();
		alertQuestion.sendKeys("Some message");
		alertQuestion.accept();
		
		Alert alertMessage = driver.switchTo().alert();
		System.out.println(alertMessage.getText());
		alertMessage.accept();

	}

}
