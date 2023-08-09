package utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementutility {
	WebDriver driver;
	public static final int IMPLICITWAIT=10;
	public static final int pageload=30;
	
	public Elementutility (WebDriver driver){
		this.driver=driver;
	}
	public void clickonelement(WebElement we,long timeout) {
		WebElement element=elementwait(we,timeout);
		element.click();
	}
	public void typetextintoelement(WebElement we,long timeout,String text) {
		WebElement element=elementwait(we,timeout);
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	public void selectoptionindropdown(WebElement we,long timeout,String optiontoselect) {
		WebElement element=elementwait(we,timeout);
		Select se=new Select(element);
		se.selectByVisibleText(optiontoselect); 
	}
	public void isalert(long timeout) {
		waitforalert(timeout).accept();
	}
	public void dismissalert(long timeout) {
		waitforalert(timeout).dismiss();
	}
	
	public void mousehoverandclick(WebElement we,long timeout) {
		WebElement element=waitforelementtovisible( we,timeout);
		Actions ac=new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	public void javascriptclick(WebElement we,long timeout) {
		WebElement element=waitforelementtovisible( we,timeout);
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public void javascripttype(WebElement we,long timeout,String text) {
		WebElement element=elementwait(we,timeout);
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='"+text+"'", null);
	}
	
	
	public WebElement waitforelementtovisible(WebElement we,long timeout) {
		WebElement element = null;
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 element=wait.until(ExpectedConditions.visibilityOf(we));
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return we;
		
	}
	
	
	public Alert waitforalert(long timeout) {
		Alert al=null;
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			al=wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return al;
	}
	
	
	public WebElement elementwait(WebElement we,long timeout) {
		WebElement element = null;
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 element=wait.until(ExpectedConditions.elementToBeClickable(we));
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return we;
		
	}

}
