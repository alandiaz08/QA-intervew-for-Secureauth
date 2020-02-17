package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class SignInPage extends WebDriverManager{
	private WebDriver driver;
	private By nameField;
	private By lastNameField;
	private By emailField;
	private By passwordField;
	private By createAccountButton;
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		nameField = By.name("firstname");
		lastNameField = By.name("lastname");
		emailField = By.name("email");
		passwordField = By.name("PASSWORD");
		createAccountButton = By.id("ppaFormSbtBtn");
	}
	
	//Este metodo se encarga de enviar los datos de login
	public void signIn(String name, String lastName, String email, String password) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		try {
			driver.findElement(By.xpath("//*[@id=\"captcha-box\"]/div/div[2]/div[1]/div[3]/span[1]"));
			
		}
		catch(Exception e){
			wait.until(ExpectedConditions.presenceOfElementLocated(nameField));
			driver.findElement(nameField).sendKeys(name);
			driver.findElement(lastNameField).sendKeys(lastName);
		    driver.findElement(emailField).sendKeys(email);
		    driver.findElement(passwordField).sendKeys(password);
			wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
			driver.findElement(createAccountButton).click();	
		}			
		
	}
}
