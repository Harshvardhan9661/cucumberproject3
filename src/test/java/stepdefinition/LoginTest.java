package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Accountpage;
import pages.Homepage;
import pages.Loginpage;
import utility.Elementutility;
import utility.LaunchBrowser;

public class LoginTest {
	Loginpage lp;
	Accountpage  ap;
	WebDriver driver;
	
	@Given("User should navigate to login page")
	public void user_should_navigate_to_login_page() {
		driver=LaunchBrowser.getdriver();
		
		Homepage hp=new Homepage(driver);
		hp.clickonmyaccount();
		 lp=hp.selectlogin();
}

	@When("^User should enter userid (.+)$")
	public void user_should_enter_userid(String email) {
		
	   lp.enteremailid(email);
	}

	@When("^User should enter password (.+)$")
	public void user_should_enter_password(String password) {
		   lp.enterpasword(password);
	}

	@When("User should click on login button")
	public void user_should_click_on_login_button() {
	ap=lp.clickonlogin();
	}

	@Then("User shoudl able to login successfully login")
	public void user_shoudl_able_to_login_successfully_login() {
		ap.verifyaccountedit();
	    
	}

	
	@Then("User should get warning message")
	public void user_should_get_warning_message() {
		String actualmessage=lp.verifymessage();
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains(actualmessage));
	   
	}
	
}
