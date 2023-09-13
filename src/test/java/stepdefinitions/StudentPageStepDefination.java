package stepdefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.StudentPage;
import utilities.TestBase;
import utilities.TestContextSetup;

public class StudentPageStepDefination {
	
	public WebDriver driver1;
	TestContextSetup testContextSetup;
	StudentPage StudentPageStepDefination;
	TestBase Tsb;
	public void StudentPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.StudentPageStepDefination=testContextSetup.pageObjectManager.getStudentPage();
	}


	DashboardPage dashboardPage =new DashboardPage(driver1);
	
@Given("Admin is logged into the LMS portal")
public void admin_is_logged_into_the_lms_portal() {
  
}

@Given("Admin is on the student details page")
public void admin_is_on_the_student_details_page() {
dashboardPage.clickStudentLink();
}

@When("Admin clicks on the Program link on the student page")
public void admin_clicks_on_the_program_link_on_the_student_page() {
	//StudentPage studentPage = new StudentPage(null);
	StudentPageStepDefination.clickProgramLink();
}

@Then("Admin is redirected to the Program page")
public void admin_is_redirected_to_the_program_page() {
	
}

@When("Admin clicks on the Batch link on the student page")
public void admin_clicks_on_the_batch_link_on_the_student_page() {
		StudentPageStepDefination.clickBatchLink();
	}



@Then("Admin is redirected to the Batch page")
public void admin_is_redirected_to_the_batch_page() {
}

@When("Admin clicks on the Class link on the student page")
public void admin_clicks_on_the_class_link_on_the_student_page() {
	StudentPageStepDefination.clickClassLink();
}

@Then("Admin is redirected to the Class page")
public void admin_is_redirected_to_the_class_page() {
}

@When("Admin clicks on the User link on the student page")
public void admin_clicks_on_the_user_link_on_the_student_page() {
	StudentPageStepDefination.clickUserLink();
}

@Then("Admin is redirected to the Student page")
public void admin_is_redirected_to_the_student_page() {
}

@When("Admin clicks on the Assignment link on the student page")
public void admin_clicks_on_the_assignment_link_on_the_student_page() {
	StudentPageStepDefination.clickAssignmentLink();
}

@Then("Admin is redirected to the Assignment page")
public void admin_is_redirected_to_the_assignment_page() {
}

@When("Admin clicks on the Attendance link on the student page")
public void admin_clicks_on_the_attendance_link_on_the_student_page() {
	StudentPageStepDefination.clickAttendanceLink();
 }


@Then("Admin is redirected to the Attendance page")
public void admin_is_redirected_to_the_attendance_page() {;
}

@When("Admin clicks on the Logout link on the student page")
public void admin_clicks_on_the_logout_link_on_the_student_page() 
{
	StudentPageStepDefination.clickLogoutLink();

}

@Then("Admin is redirected to the Login page")
public void admin_is_redirected_to_the_logout_page() {

}
}