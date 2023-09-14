package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.UserPage;
import utilities.ExcelReader;
import utilities.TestBase;
import utilities.TestContextSetup;

public class UserPageStepDefinition {
	
	private static final String popupactual = null;
	public WebDriver driver;
	TestContextSetup testContextSetup;
	UserPage UserPage;
	TestBase Tsb;
	public UserPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.UserPage=testContextSetup.pageObjectManager.getUserPage();
		
		
		DashboardPage dashboardPage =new DashboardPage(driver);

		@Given("Admin is logged into the LMS portal")
		public void admin_is_logged_into_the_lms_portal(); {
		 //open dashboard url
		dashboardPage.visit_LMS_url();
		//click login
		dashboardPage.clickMainPageLogin_btn();
		//enter u/pswd
		dashboardPage.enterUsername(testContextSetup.getUserName());
		    dashboardPage.enterPassword(testContextSetup.getPassword());
		//click login
		    dashboardPage.clickLogin();
		//click student link
	}

	// User Page Validation
	
	@Given("Admin is in home page of LMS portal using correct URL")
	public void admin_is_in_home_page_of_lms_portal_using_correct_url(); 
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.equals("www.lms.com/homepage"));
	   
	}

	@When("Admin enter the correct LMS portal URL")
	public void admin_enter_the_correct_lms_portal_url(); {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.equals("www.lms.com")); 
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page(); {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.equals("www.lms.com/homepage"));	
	    
	}

	@When("Admin enter the incorrect LMS portal URL")
	public void admin_enter_the_correct_lms_portal_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User see {int} Bad Request")
	public void user_see_bad_request(Integer int1)dashboardPage; {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		
	}

	private static Object getText() {
		// TODO Auto-generated method stub
		return null;
	}

	private void correctSpelling() {
		// TODO Auto-generated method stub
		
	}

	@Then("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Login button")
	public void admin_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on the login page")
	public void admin_should_land_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Bad Request \"{int}\"Link is broken")
	public void bad_request_link_is_broken(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is in home page of LMS portal using incorrect URL")
	public void admin_is_in_home_page_of_lms_portal_using_incorrect_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should get Bad Request {string} error")
	public void admin_should_get_bad_request_error(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	// Add New User 
	
@Given("A new pop up with user details appears")
public void a_new_pop_up_with_user_details_appears() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User Clicks on {string}")
public void user_clicks_on(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The pop up should include the fields First Name,Middle name,Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as text box User Role,Role status,visa status as drop down")
public void the_pop_up_should_include_the_fields_first_name_middle_name_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_and_user_comments_as_text_box_user_role_role_status_visa_status_as_drop_down(String Sheetname,XmlObject RowNumber) 
		
		throws InvalidFormatException, IOException {
   
	

		java.util.List<Map<String,String>> data=ExcelReader.getData(".\\src\\test\\resources\\testdata.xls" , Sheetname);
		String cellvalue1=data.set(RowNumber).get("First Name");
		String cellvalue2=data.set(RowNumber).set(	"Last Name");
		String cellvalue3=data.set(RowNumber).set("Location");
		String cellvalue4=data.set(RowNumber).set(	"User Role");
		String cellvalue5=data.set(RowNumber).set("Visa Status");
		UserPage.entertextUserName(cellvalue1);
		UserPage.entertextUserName(cellvalue1);
		UserPage.entertextUserName(cellvalue1);
		UserPage.entertextUserName(cellvalue1);
		UserPage.entertextUserName(cellvalue1);
		
		UserPage.clickradiobtnprogramstatusactive();
		
		UserPage.clicksavebtn();
	}
    throw new io.cucumber.java.PendingException();
}

private void admin_should_land_on_the_home_page() {
		// TODO Auto-generated method stub
		
	}

private void admin_enter_the_correct_lms_portal_url() {
		// TODO Auto-generated method stub
		
	}

private void admin_is_in_home_page_of_lms_portal_using_correct_url() {
		// TODO Auto-generated method stub
		
	}

private void admin_is_logged_into_the_lms_portal() {
		// TODO Auto-generated method stub
		
	}

@Given("A new pop up with {string} appears")
public void a_new_pop_up_with_appears(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Fill in all the fields except optional fields with valid values and click submit")
public void fill_in_all_the_fields_except_optional_fields_with_valid_values_and_click_submit() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The newly added user should be present in the data table in Manage User page")
public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Fill in all the fields with valid values and click submit")
public void fill_in_all_the_fields_with_valid_values_and_click_submit() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("any of the fields have invalid values")
public void any_of_the_fields_have_invalid_values() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Error message should appear")
public void error_message_should_appear() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Any of the mandatory fields are blank")
public void any_of_the_mandatory_fields_are_blank() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	
// Edit User 

@Given("The edit icon on row level in data table is enabled")
public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks the edit icon")
public void admin_clicks_the_edit_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("A new pop up with User details appears")
public void a_new_pop_up_with_user1_details_appears() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin clicks the edit icon")
public void admin_clicks_the_edit1_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Update the fields with valid values and click submit")
public void update_the_fields_with_valid_values_and_click_submit() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The updated user details should appear on the data table")
public void the_updated_user_details_should_appear_on_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Update the fields with invalid values and click submit")
public void update_the_fields_with_invalid_values_and_click_submit() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Error message should appear")
public void error_message1_should_appear() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Erase data from mandatory field")
public void erase_data_from_mandatory_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//Delete User


@Given("The delete icon on row level in data table is enabled")
public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks the delete icon")
public void admin_clicks_the_delete1_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Alert appears with yes and No option")
public void alert_appears_with_yes_and_no_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin clicks the delete icon")
public void admin_clicks_the_delete_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin click yes option")
public void admin_click_yes_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User deleted alert pops and user is no more available in data table")
public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin click No option")
public void admin_click_no_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User is still listed in data table")
public void user_is_still_listed_in_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

// Delete Multiple User


@Given("None of the checkboxes in data table are selected")
public void none_of_the_checkboxes_in_data_table_are_selected() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("No action performed")
public void no_action_performed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The delete icon under the {string} header should be disabled")
public void the_delete_icon_under_the_header_should_be_disabled(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("One of the checkbox\\/ row is selected")
public void one_of_the_checkbox_row_is_selected() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Click delete icon below {string} header")
public void click_delete_icon_below_header(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The respective row in the data table is deleted")
public void the_respective_row_in_the_data_table_is_deleted() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Two or more checkboxes\\/row is selected")
public void two_or_more_checkboxes_row_is_selected() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}
