package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class HomePage extends WebDriverManager{
	private WebDriver driver;
	private By sigInButton;
	private By logInButton;
	private By searchProductField;
	private By searchButton;
	private By sellButton;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		sigInButton = By.xpath("//*[@id=\"gh-ug-flex\"]/a");
		logInButton = By.xpath("//*[@id=\"gh-ug\"]/a");
		searchProductField = By.id("gh-ac");
		searchButton = By.id("gh-btn");
		sellButton = By.id("gh-p-2");
	}
	public void signInButton() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(sigInButton));
		driver.findElement(sigInButton).click();
	}
	
	public void logInButton() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(logInButton));
		driver.findElement(logInButton).click();

	}
	
	public void searchProuct(String product) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(searchProductField));
		driver.findElement(searchProductField).sendKeys(product);
		wait.until(ExpectedConditions.elementToBeClickable(searchProductField));
		driver.findElement(searchButton).click();
		
	}
	
	public void sellButton() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(sellButton));
		driver.findElement(sellButton).click();
	}
}
