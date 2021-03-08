package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.Base;

public class SearchResultPage extends Base {
	@FindBy(xpath="//input[@placeholder='Search Brand']")
	WebElement searchBrand;
	
	@FindBy(xpath="//div[@title='Gionee']")
	WebElement selectGionee;
	
	@FindBy(xpath="//div[@title='2 GB']")
	WebElement selectRAM;
	
	@FindBy(xpath="//div[contains(@class,'row')]/div")
	WebElement getTextofFirstResult;
	
	@FindBy(xpath="//a[@title='Mobiles']")
	WebElement mobile;
	
	@FindBy(xpath="//span[text()='Filters']//ancestor::section//div[text()='Gionee']")
	WebElement clearGionee;
	
	public void selectBrandAndRAM() {
		waitForElementToVisible(mobile);
		moveToElement(mobile);
		mobile.click();
		
		waitForElementToVisible(selectGionee);
		moveToElement(selectGionee);
//		searchBrand.click();
//		searchBrand.sendKeys("gionee");
		selectGionee.click();
		waitForElementToVisible(selectRAM);
		moveToElement(selectRAM);
		selectRAM.click();
		
	}
	
	public String getFirstResult() {
		waitForElementToVisible(getTextofFirstResult);
		return getTextofFirstResult.getText();
		
	}
	
	public void clearSelection() {
		waitForElementToVisible(clearGionee);
		moveToElement(clearGionee);
		clickThroughJavaScript(clearGionee);
	}
}
