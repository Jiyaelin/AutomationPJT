package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiePage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[3]/form/input[3]")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"PredictiveResults\"]/div[1]/div/div[1]/div/a/div[2]/div")
	WebElement item;
	
	@FindBy(xpath="//*[@id=\"AddToCartForm-template--16678811074798__main-8026633437422\"]/div[2]/button[1]")
	WebElement addTo;
	
	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[4]/div/div[2]/button/span")
	WebElement close;
	
	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[2]/div/ul/li[1]/a")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[2]/div/ul/li[2]/a")
	WebElement buycookies;
	
	 public CookiePage(WebDriver driver) 
	 {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
		
	public void homePage() 
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle="Cookie Man - Buy Cookies & Gift Tins Online. Flat 15% off + Free Shipp – CookieMan";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
	
		search.sendKeys("choc chip cookies");
		
		item.click();	
		}
	public void itemSelect() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");
		
		addTo.click();
		
	}
	public void closeButton() 
	{
		close.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-1000)", "");
		
		home.click();	
	}
	public void mainPage() 
	{
		buycookies.click();
	}
	
	}
