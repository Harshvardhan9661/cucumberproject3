package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Searchpage;
import utility.LaunchBrowser;

public class SearchTest {
	WebDriver driver;
	Searchpage sp;
	@Given("User should navigate to Home page")
	public void user_should_navigate_to_home_page() {
		driver=LaunchBrowser.getdriver();
		 sp=new Searchpage(driver);
	System.out.println("<<inside home page>>");
	}

	@When("User should enter product {string} in search section")
	public void user_should_enter_product_in_search_section(String product) {
		sp.enterproduct(product);	  
	}

	@When("user should click on search button")
	public void user_should_click_on_search_button() {
		sp.clickonsearch();
	   
	}

	@Then("User should able to see entered product in search page")
	public void user_should_able_to_see_entered_product_in_search_page() {
		sp.validateproduct();
	    
	}
	@Then("User should not able to see any product in search page")
	public void user_should_not_able_to_see_any_product_in_search_page() {
		sp.verifynoproductmessage("There is no product that matches the search criteria.");	   
	}
}
