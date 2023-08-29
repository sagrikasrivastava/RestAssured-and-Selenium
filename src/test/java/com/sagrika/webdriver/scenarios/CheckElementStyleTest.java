package com.sagrika.webdriver.scenarios;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckElementStyleTest extends AbstractWebDriverTest {

	@Test
	public void getCssStylesForInputError() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement errorField = driver.findElement(By.id("inputError"));
		System.out.println(errorField.getCssValue("color"));// rgb(85, 85, 85)
		System.out.println(errorField.getCssValue("display"));// block
		System.out.println(errorField.getCssValue("border-color"));// rgb(169, 68, 66)
		System.out.println(errorField.getCssValue("height"));// 34px
		System.out.println(errorField.getCssValue("font-size"));// 14px
		System.out.println(errorField.getCssValue("background-color"));// rgb(255, 255, 255)
		System.out.println(errorField.getCssValue("border"));// 0.8px solid rgb(169, 68, 66)

	}

	@Test
	public void getCssStylesForInputSuccess() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement successField = driver.findElement(By.id("inputSuccess"));
		System.out.println(successField.getCssValue("color"));// rgb(85, 85, 85)
		System.out.println(successField.getCssValue("display"));// block
		System.out.println(successField.getCssValue("border-color"));// rgb(60, 118, 61)
		System.out.println(successField.getCssValue("height"));// 34px
		System.out.println(successField.getCssValue("font-size"));// 14px
		System.out.println(successField.getCssValue("background-color"));// rgb(255, 255, 255)
		System.out.println(successField.getCssValue("border"));// 0.8px solid rgb(60, 118, 61)

	}

	@Test
	public void checkIfAnElementIsEnabledOrDisabled() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement disabledField = driver.findElement(By.id("disabledInput"));
		assertFalse(disabledField.isEnabled());
		System.out.println(disabledField.isEnabled());
	}

	@Test
	public void exploreWebElementGetAttributeOfDisabledInputFeild() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement disabledInputField = driver.findElement(By.id("disabledInput"));
		System.out.println(disabledInputField.getAttribute("class"));// form-control
		System.out.println(disabledInputField.getAttribute("type"));// text
		System.out.println(disabledInputField.getAttribute("placeholder"));// Disabled input
		System.out.println(disabledInputField.getAttribute("disabled"));// true
	}

	@Test
	public void exploreWebElementGetAttributeOfDIsabledSelectFeild() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement disabledSelectField = driver.findElement(By.id("disabledSelect"));
		System.out.println(disabledSelectField.getAttribute("class"));// form-control
	}

	@Test
	public void exploreWebElementGetLocationAndSizeOfDisabledInputFeild() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement disabledInputField = driver.findElement(By.id("disabledInput"));
		System.out.println(disabledInputField.getLocation());//(780, 311)
		System.out.println(disabledInputField.getSize());//(453, 34)
		
		WebElement textElement = driver.findElement(By.id("textElement"));
		System.out.println(textElement.getLocation());//(296, 241)
		System.out.println(textElement.getSize());//(453, 34)
		
		WebElement textAreaElement = driver.findElement(By.id("textAreaElement"));
		System.out.println(textAreaElement.getLocation());//(296, 551)
		System.out.println(textAreaElement.getSize());//(453, 73)
		
		WebElement inputWarning = driver.findElement(By.id("inputWarning"));
		System.out.println(inputWarning.getLocation());//(780, 666)
		System.out.println(inputWarning.getSize());//(453, 34)

	}
}
