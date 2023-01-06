package dev.lorrayne.automation.practice.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AppTest {
	private WebDriver driver;
	
	@Test
	void helloSelenium() {
		driver.get("https://automationexercise.com/");
		driver.quit();
	}
}
