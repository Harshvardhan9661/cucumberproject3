package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Elementutility;

public class Accountpage {
  WebDriver driver;
  Elementutility elementutil;
	public Accountpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Edit your account information']")
	public WebElement editaccount;
	public void verifyaccountedit() {
		
		Assert.assertTrue(editaccount.getText().contains("Edit your account information"));
		
	}
}
