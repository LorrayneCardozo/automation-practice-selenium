package pages;

import org.openqa.selenium.By;

public class ShopPage extends BasePage {
	//Locators
	private By menuShopLocator = By.xpath("//*[@id=\"menu-item-40\"]/a");
	
	public void viewShopPage() {
		if(super.isDisplayed(menuShopLocator)) {
			//super.actionMoveToElemnt(menuShopLocator);
			super.actionMoveClickToElement(menuShopLocator);
		} else {
			System.out.println("Menu shop was not found");
		}
	}
}
