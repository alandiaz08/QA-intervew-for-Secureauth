package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class ProductsPage extends WebDriverManager{
	private WebDriver driver;
	private By prouctSelect;
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		prouctSelect=By.className("s-item__title s-item__title--has-tags");
	}
	
	public void selectProduct() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(prouctSelect));
		driver.findElement(prouctSelect).click();
	}
	
}
