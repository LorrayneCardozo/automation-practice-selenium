package pages;

import org.openqa.selenium.By;

public class ShopPage extends BasePage {
	//Locators
	private By menuShopLocator = By.xpath("//*[@id=\"menu-item-40\"]/a");
	private By closeAdvertisingLocator = By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]");

	public void viewShopPage() throws InterruptedException {
		if(super.isDisplayed(menuShopLocator)) {
			//super.actionMoveToElemnt(menuShopLocator);
			super.actionMoveClickToElement(menuShopLocator);
			super.actionMoveClickToElement(closeAdvertisingLocator);
			Thread.sleep(5000);
		} else {
			System.out.println("Menu shop was not found");
		}
	}
}
