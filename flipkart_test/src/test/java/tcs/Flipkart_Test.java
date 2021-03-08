package tcs;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.SearchResultPage;
import utility.WebDriverWrapper;

public class Flipkart_Test {

	 WebDriver driver;
	@Before()
	public void setUp()
	{
		 System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		 driver=WebDriverWrapper.getDriver();
//	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.flipkart.com");
	     driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		// TODO Auto-generated method stub
     HomePage homePage=PageFactory.initElements(driver, HomePage.class);
     SearchResultPage searchResultPage=PageFactory.initElements(driver, SearchResultPage.class);
     homePage.searchForProducts("gionee");
     
     searchResultPage.selectBrandAndRAM();
     String actual=searchResultPage.getFirstResult();
     System.out.println(actual);
     Assert.assertTrue("not contains Gionee",actual.contains("Gionee"));
     Assert.assertTrue("not contains 2 GB RAM",actual.contains("2 GB RAM"));
     searchResultPage.clearSelection();
     
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
