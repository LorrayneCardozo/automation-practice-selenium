package tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.LoginPage;

class LoginPageTest {
	private LoginPage login;
	private final String URL = "https://practice.automationtesting.in/my-account/";
	
	@BeforeEach
	void setUp() throws Exception {
		login = new LoginPage();
		login.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		login.quitWebDriver();
	}

	@Test
	void test() {
		login.signIn();
	}
}
