package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Elementutility;

public class Loginpage {
    WebDriver driver;
    Elementutility elementutil;
	Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementutil=new Elementutility(driver);
	}
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement emailid;
	public void enteremailid(String email) {
		elementutil.typetextintoelement(emailid, 15, email);
	}
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement password1;
	public void enterpasword(String password) {
		elementutil.typetextintoelement(password1, 15, password);
	}
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginbutton;
	public Accountpage clickonlogin() {
		elementutil.clickonelement(loginbutton, 15);
		return new Accountpage(driver);
	}
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	public WebElement warningmessage;
	public String verifymessage() {
		String actualmessage=warningmessage.getText();
		return actualmessage;
	}
}
