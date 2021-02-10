package test5tests;

import org.testng.annotations.Test;

import test5pages.CheckoutPage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);
	}

	@Test
	public void logInTest() throws InterruptedException {
		loginPage.usernameInput("standard_user");
		loginPage.passwordInput("secret_sauce");
		loginPage.LogInButtonClick();
		Thread.sleep(3000);
		productPage.openSideMenu();
		Thread.sleep(3000);
		String logOutButton = productPage.getLogOutSideBar().getText();
		AssertJUnit.assertEquals(logOutButton, "Logout");

	}

	@Test
	public void orderingTests() throws InterruptedException {
		logInTest();
		productPage.xClick();
		Thread.sleep(3000);
		productPage.addToCartClick();
		Thread.sleep(3000);
		productPage.CartClick();
		Thread.sleep(3000);
		cartPage.ceckoutButonClick();
		Thread.sleep(3000);
	    checkoutPage.firstNameInput("Sladjana");
	    Thread.sleep(3000);
	    checkoutPage.lastNameInput("Milovac");
	    Thread.sleep(3000);
	    checkoutPage.zipCodeInput("21000");
	    Thread.sleep(3000);
	    checkoutPage.continueButtonClick();
	    checkoutPage.finishButtonClick();
	    String assertmessage = checkoutPage.getMesssage().getText();
	    Assert.assertEquals(assertmessage, "THANK YOU FOR YOUR ORDER");
	    
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
