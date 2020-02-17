package Test;

import org.testng.annotations.Test;

import driver.WebDriverManager;
import helpers.Helpers;
import pages.AddItemPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LogInPage;
import pages.ProductSelectedPage;
import pages.ProductsPage;

public class TestBuyProduct extends WebDriverManager{
	@Test(testName ="Test_Buy_Product", description="Caso de prueba codigo: EBAY05", dataProvider="Set_Datos_Test_EBAY05")
	public void test(String userId, String pass, String products, String cardNumber, String dateCard, String securityCode) {
		HomePage home = new HomePage(driver);
		home.logInButton();
		LogInPage logIn = new LogInPage(driver);
		Helpers helper = new Helpers();
		helper.sleepSeconds(20);
		logIn.logIn(userId, pass);
		home.searchProuct(products);
		ProductsPage product = new ProductsPage(driver);
		product.selectProduct();
		ProductSelectedPage produSelected = new ProductSelectedPage(driver);
		produSelected.buyItNow();
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.selectCard(cardNumber, dateCard, securityCode);
		
	}
}
