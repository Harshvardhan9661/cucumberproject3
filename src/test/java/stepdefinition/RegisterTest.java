package stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.Registerpage;
import utility.LaunchBrowser;

public class RegisterTest {
	WebDriver driver;
	Registerpage rp;
	@Given("User should navigate to Register page")
	public void user_should_navigate_to_register_page() {
		driver=LaunchBrowser.getdriver();
		Homepage hp = new Homepage(driver);
		hp.clickonmyaccount();
		rp=hp.selectregister();
	}

	@When("user should enter below mandatory details")
	public void user_should_enter_below_mandatory_details(DataTable dataTable) {
		Map<String,String> data =dataTable.asMap(String.class, String.class);
		rp.selectfirstname(data.get("First Name"));
		rp.selectsecondname(data.get("Last Name"));
		rp.selectemail(data.get("E-mail"));
		rp.selecttelephone(data.get("Telephone"));
		rp.selectpassword(data.get("Password"));
		rp.selectconfirmpassword(data.get("Password Confirm"));	
	}

	@When("select privacy policy")
	public void select_privacy_policy() {
	  rp.selectpolicy();
	}


	@Then("User credential should successfully created")
	public void user_credential_should_successfully_created() {
	 rp.verifymessageforcredentialcreation(); 
	}

	@When("select subscribe")
	public void select_subscribe() {
	   rp.selectsubscribe();
	}

	@When("click on continue button")
	public void user_click_on_continue_button() {
	   rp.clickcontinue();
	}
	@Then("User should get warning message for invalid account") 
	public void User_should_get_warning_message_for_invalid_account() {
		System.out.println("warning message ");
	}
	


}
