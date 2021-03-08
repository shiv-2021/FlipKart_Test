package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	WebDriver driver=WebDriverWrapper.getDriver();
	
	public void waitForElementToVisible(WebElement element) {
	WebDriverWait explicitWait=new WebDriverWait(driver,5);
	explicitWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void moveToElement(WebElement element) {
		Actions action=new Actions(WebDriverWrapper.getDriver());
		action.moveToElement(element).perform();
	}
	
	public void clickThroughJavaScript(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
}
