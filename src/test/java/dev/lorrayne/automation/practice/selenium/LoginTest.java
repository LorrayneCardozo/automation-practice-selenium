package dev.lorrayne.automation.practice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/my-account/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebElement emailAdressElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		emailAdressElement.sendKeys("lorrayne_cardozo@hotmail.com");
		
		WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordElement.sendKeys("Lorrayne@123");
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		submitBtnElement.click();
		
	}

}
