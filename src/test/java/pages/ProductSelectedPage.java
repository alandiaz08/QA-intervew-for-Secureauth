package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class ProductSelectedPage extends WebDriverManager{
	private WebDriver driver;
	private By buyItNowButton;
	public ProductSelectedPage(WebDriver driver) {
		this.driver=driver;
		buyItNowButton = By.id("binBtn_btn");
		
	}
	public void buyItNow() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(buyItNowButton));
		driver.findElement(buyItNowButton).click();
	}
	
}
