package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Elementutility;

public class Homepage {
	WebDriver driver;
	Elementutility elementutil;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementutil=new Elementutility(driver);
	}
@FindBy(xpath="//a[@title='My Account']")
 public WebElement myaccountoption;
public void clickonmyaccount() {
	elementutil.clickonelement(myaccountoption, 15);
	}
	
@FindBy(xpath="//a[text()='Login']")
	 public WebElement selectlogin;
	public Loginpage selectlogin() {
		elementutil.clickonelement(selectlogin, 15);
		return new Loginpage(driver);
				}
	@FindBy(xpath="//a[text()='Register']")
	public WebElement registeroption;
	public Registerpage selectregister() {
		elementutil.clickonelement(registeroption, 15);
		return new Registerpage(driver);
	}
}
