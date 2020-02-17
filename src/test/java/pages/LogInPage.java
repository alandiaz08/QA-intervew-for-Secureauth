package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class LogInPage extends WebDriverManager{
	private WebDriver driver;
	private By userId;
	private By password;
	private By logInButton;
	public LogInPage(WebDriver driver) {
		userId = By.id("userid");
		password = By.id("pass");
		logInButton = By.id("sgnBt");
	}
	public void logIn(String user, String pass) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(userId));
		driver.findElement(userId).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(logInButton).click();
	}
}
