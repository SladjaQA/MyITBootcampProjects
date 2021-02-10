package test5tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.CartPage;
import test5pages.CheckoutPage;
import test5pages.LoginPage;
import test5pages.ProductPage;

public class BaseTests {

	WebDriver driver;
	LoginPage loginPage;
	ProductPage productPage;
	CartPage cartPage;
	CheckoutPage checkoutPage;

	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.loginPage = new LoginPage(driver);
		this.productPage = new ProductPage(driver);
		this.cartPage = new CartPage(driver);
		this.checkoutPage = new CheckoutPage(driver);
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void posleKlase() throws IOException {
		driver.close();

	}
}