package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Base;
public class HomePage extends Base {
//	private WebDriver driver;
//
//	public HomePage(WebDriver driver)
//	{
//		this.driver=driver;
//	}
	
	@FindBy(xpath="//button[text()='✕']")
	WebElement closeIcon;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search for products')]")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	

	public void searchForProducts(String product) {
		closeIcon.click();
		searchBox.click();
		searchBox.sendKeys(product);
		searchButton.click();
	}
	

}
