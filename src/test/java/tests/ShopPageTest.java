package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.ShopPage;

class ShopPageTest {
	
	private ShopPage shopPage;
	private final String URL = "https://practice.automationtesting.in/";
	private final String URL_SHOP = "https://practice.automationtesting.in/shop/";

	@BeforeEach
	void setUp() throws Exception {
		this.shopPage = new ShopPage();
		this.shopPage.visit("https://practice.automationtesting.in/");
	}

	@AfterEach
	void tearDown() throws Exception {
		this.shopPage.quitWebDriver();
	}

	@Test
	void test() throws InterruptedException {
		this.shopPage.viewShopPage();
		Assertions.assertEquals(this.URL_SHOP, shopPage.getCurrentUrl());
	}

}
