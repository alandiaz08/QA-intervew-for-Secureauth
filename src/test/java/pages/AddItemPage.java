package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class AddItemPage extends WebDriverManager{
	private WebDriver driver;
	private By browseCategoryField;
	private By findProductAutocompleteButton;
	private By titleField;
	private By categorySelector;
	private By brandSelector;
	private By hpSelector;
	private By bodyDescription;
	private By durationSelector;
	private By duration10DaysSelector;
	private By startPriceField;
	private By pmPayPalCheckBox;
	private By shipService1Selector;
	private By shipService1Selected;
	private By previewButton;
	public AddItemPage(WebDriver driver) {
		this.driver=driver;
		browseCategoryField = By.xpath("//*[@id=\"w0-find-product-search-bar-search-field\"]");
		findProductAutocompleteButton = By.id("//*[@id=\"w0-find-product-search-bar-autocomplete-autocomplete[0]\"]/button");
		titleField = By.id("editpane_title");
		categorySelector = By.id("cat_177");
		brandSelector = By.id("Listing.Item.ItemSpecific[Brand]");
		hpSelector = By.id("Listing.Item.ItemSpecific[Brand]_menu_js_p_1");
		bodyDescription = By.xpath("/html/body");
		durationSelector = By.id("duration");
		duration10DaysSelector = By.xpath("//*[@id=\"duration\"]/option[4]");
		startPriceField = By.id("startPrice");
		pmPayPalCheckBox = By.id("pmPayPal");
		shipService1Selector = By.id("shipService1");
		shipService1Selected = By.xpath("//*[@id=\"shipService1\"]/optgroup[1]/option[1]");
		previewButton = By.id("prv_Btn");
	}
	
	public void sellProducto(String product, String title, String bodyText, String price) {
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(browseCategoryField));
		driver.findElement(browseCategoryField).sendKeys(product);
		wait.until(ExpectedConditions.presenceOfElementLocated(findProductAutocompleteButton));
		driver.findElement(findProductAutocompleteButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(titleField));
		driver.findElement(titleField).sendKeys(title);
		driver.findElement(categorySelector).click();
		driver.findElement(brandSelector).click();
		driver.findElement(hpSelector).click();
		driver.findElement(bodyDescription).sendKeys(bodyText);
		driver.findElement(durationSelector).click();
		driver.findElement(duration10DaysSelector).click();
		driver.findElement(startPriceField).sendKeys(price);
		driver.findElement(pmPayPalCheckBox).click();
		driver.findElement(shipService1Selector).click();
		driver.findElement(shipService1Selected).click();
		driver.findElement(previewButton).click();
		
		
	}
}
