package dev.lorrayne.automation.practice.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class AppTest {
	private WebDriver driver;

	@Test
	void helloSelenium() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://practice.automationtesting.in/");
		driver.quit();
	}
}
