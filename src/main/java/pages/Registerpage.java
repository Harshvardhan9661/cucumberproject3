package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registerpage {
	WebDriver driver;
	public Registerpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-firstname")
	public WebElement firstname1;
	@FindBy(id="input-lastname")
	public WebElement secondname1;
	@FindBy(id="input-email")
	public WebElement email1;
	@FindBy(id="input-telephone")
	public WebElement telephone1;
	@FindBy(id="input-password")
	public WebElement password1;
	@FindBy(id="input-confirm")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	public WebElement privacypolicy;
	
	@FindBy(xpath="//div[@id='content']//h1")
	public WebElement messageforsuccessfulcredential;
	
	
	@FindBy(xpath="(//input[@name='newsletter'])[1]")
	public WebElement subscribe;
	
	public void selectfirstname(String firstname) {
		firstname1.sendKeys(firstname);
	}
	public void selectsecondname(String secondname) {
		secondname1.sendKeys(secondname);
	}
	public void selectemail(String email) {
		email1.sendKeys(email);
	}
	public void selecttelephone(String phone) {
		telephone1.sendKeys(phone);
	}
	public void selectpassword(String password) {
		password1.sendKeys(password);
	}
	public void selectconfirmpassword(String password) {
		confirmpassword.sendKeys(password);
	}
	public void selectpolicy() {
		privacypolicy.click();
	}
	public void selectsubscribe() {
		subscribe.click();
	}
	public void verifymessageforcredentialcreation() {
		String Actualmessage =messageforsuccessfulcredential.getText();
		System.out.println("<<<<<"+Actualmessage);
		 Assert.assertEquals(Actualmessage,"Your Account Has Been Created!");
	}
	@FindBy(xpath="(//input[@value='Continue'])")
	public WebElement continuebutton1;
	public void clickcontinue() {
		continuebutton1.click();
	}
	


}
