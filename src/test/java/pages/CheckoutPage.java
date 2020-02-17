package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import driver.WebDriverManager;

public class CheckoutPage extends WebDriverManager{
	private WebDriver driver;
	private By creditOrDebitCardSelect;
	private By cardNumberField;
	private By dateCardField;
	private By securityCodeField;
	private By doneButton;
	private By errorText;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		creditOrDebitCardSelect = By.id("srs2");
		cardNumberField = By.id("cardNumber");
		dateCardField = By.id("cardExpiryDate");
		securityCodeField = By.id("securityCode");
		doneButton = By.xpath("//*[@id=\"credit-card-details\"]/div/span/div[1]/button");
		errorText = By.xpath("//*[@id=\"credit-card-details\"]/section[1]/div[1]/div/span[2]/p/span/span");
	}
	
	public void selectCard(String cardNumber, String dateCard,String securityCode) {
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(creditOrDebitCardSelect));
		driver.findElement(creditOrDebitCardSelect).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(cardNumberField));
		driver.findElement(cardNumberField).sendKeys(cardNumber);
		driver.findElement(dateCardField).sendKeys(dateCard);
		driver.findElement(securityCodeField).sendKeys(securityCode);
		wait.until(ExpectedConditions.presenceOfElementLocated(doneButton));
		driver.findElement(doneButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(errorText));
		String error = "Looks like something wasn't correct. Please enter the payment details again.";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.findElement(errorText).getText(), error, "Este error deberia mostrar el mensaje: (Looks like something wasn't correct. Please enter the payment details again.)");
		
		
	}
}
