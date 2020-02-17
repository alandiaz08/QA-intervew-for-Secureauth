package Test;

import org.testng.annotations.Test;

import driver.WebDriverManager;
import pages.HomePage;
import pages.SignInPage;

public class TestSignIn extends WebDriverManager{
	@Test(testName ="Test_Sign_In", description="Caso de prueba codigo: EBAY01",dataProvider="Set_Datos_Test_EBAY01")
	public void test(String name, String lastName, String email, String password ) {
		HomePage home = new HomePage(driver);
		home.signInButton();
		SignInPage signIn = new SignInPage(driver);
		signIn.signIn(name, lastName, email, password);
		
	}
}
