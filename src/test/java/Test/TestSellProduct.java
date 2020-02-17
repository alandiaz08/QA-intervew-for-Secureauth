package Test;

import org.testng.annotations.Test;

import driver.WebDriverManager;
import helpers.Helpers;
import pages.AddItemPage;
import pages.HomePage;
import pages.LogInPage;
import pages.SignInPage;

public class TestSellProduct extends WebDriverManager{
	@Test(testName ="Test_Sell_Product", description="Caso de prueba codigo: EBAY04", dataProvider="Set_Datos_Test_EBAY04")
	public void test(String user, String password, String product, String title, String body, String price ) {
		HomePage home = new HomePage(driver);
		home.logInButton();
		LogInPage logIn = new LogInPage(driver);
		Helpers helper = new Helpers();
		helper.sleepSeconds(20);
		logIn.logIn(user, password);
		home.sellButton();
		AddItemPage addItem = new AddItemPage(driver);
		addItem.sellProducto(product, title, body, price);
		
		
	}
}
