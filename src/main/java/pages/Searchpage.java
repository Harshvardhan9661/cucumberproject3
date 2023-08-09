package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchpage {
	WebDriver driver;
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='form-control input-lg']")
	public WebElement searchbox;
	public void enterproduct(String product) {
		searchbox.sendKeys(product);
	}
	@FindBy(xpath="(//button[@type='button'])[4]")
	public WebElement searchbutton;
	public void clickonsearch() {
		searchbutton.click();
	}
	@FindBy(xpath="//img[@title='HP LP3065']")
	public WebElement productonpage;
	public void validateproduct() {
		try {
		Assert.assertTrue(productonpage.isDisplayed());
	}
		catch(Exception e){
			e.getMessage();
		}
	}
	@FindBy(xpath="//input[@id='button-search']/following-sibling::p")
	public WebElement productsearchmessage;
	public void verifynoproductmessage(String message) {
		try {	
		Assert.assertTrue(productsearchmessage.getText().contains(message));}
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	}
	}
