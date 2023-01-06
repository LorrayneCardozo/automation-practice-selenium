package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locators
	private By emailAdressLocator = By.xpath("//*[@id=\"username\"]");
	private By passwordLocator = By.xpath("//*[@id=\"password\"]");
	private By submitButtonLocator = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	
	public void signIn() {
		if(super.isDisplayed(emailAdressLocator)) {
			super.type("lorrayne_cardozo@hotmail.com", emailAdressLocator);
			super.type("Lorrayne@123", passwordLocator);
			super.click(submitButtonLocator);	
		} else {
			System.out.println("E-mail textbox was not present");
		}
	}
}
