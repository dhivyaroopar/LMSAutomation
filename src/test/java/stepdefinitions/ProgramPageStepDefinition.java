package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.*;
import pages.ProgramPage;
import utilities.TestContextSetup;

public class ProgramPageStepDefinition {
//MANAGEVALIDATION-SD	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	ProgramPage programPage;
	public ProgramPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.programPage=testContextSetup.pageObjectManager.getProgramPage();
	}
	
	
	@Given("Admin is on dashboard page after Login in program")
	public void admin_is_on_dashboard_page_after_login_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} on the navigation bar in program")
	public void admin_clicks_on_the_navigation_bar_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see URL with {string} in program")
	public void admin_should_see_url_with_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a heading with text {string} on the page in program")
	public void admin_should_see_a_heading_with_text_on_the_page_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the text as {string} along with Pagination icon in program.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the footer as {string} in program.")
	public void admin_should_see_the_footer_as_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled in program")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a {string} button on the program page above the data table in program")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int} in program")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are_in_program(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see data table on the Manage Program Page with following column headers in program")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_in_program(io.cucumber.datatable.DataTable dataTable) {
		List<String> data=dataTable.asList(String.class);
		int i=data.size();
		for(int j=0;j<i;j++) {
		 headername=data.get(i);
		headercolumn(headername);}
	   
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete in program")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see check box on the left side in all rows of the data table in program")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table in program")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see Search bar with text as {string} in program")
	public void admin_should_see_search_bar_with_text_as_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Manage Program Page in program")
	public void admin_is_on_manage_program_page_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters <Program name phrase> into search box in program.")
	public void admin_enters_program_name_phrase_into_search_box_in_program() {
		utilities.ExcelReader reader= new utilities.ExcelReader();
		    List<Map<String,String>> testdata=reader.getData("C:\\Users\\priya\\OneDrive\\Desktop\\program.xlsx",sheetname);
		    
		    String code1=testdata.get(RowNumber).get("code");
		    sp.enterdatatotryeditor(code1);
	}

	@Then("Admin should see the Programs displayed based on the Program Name in program")
	public void admin_should_see_the_programs_displayed_based_on_the_program_name_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters <Program description phrase> into search box in program.")
	public void admin_enters_program_description_phrase_into_search_box_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Programs displayed based on the Program Description in program")
	public void admin_should_see_the_programs_displayed_based_on_the_program_description_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters <Program status phrase> into search box in program.")
	public void admin_enters_program_status_phrase_into_search_box_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Programs displayed based on the Program Status in program")
	public void admin_should_see_the_programs_displayed_based_on_the_program_status_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters the keywords not present in the data table on the Search box in program")
	public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see zero entries on the data table in program")
	public void admin_should_see_zero_entries_on_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


//ADDPROGRAM-SD
	@Given("Admin is on dashboard page after Login and clicks Program on the navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_clicks_program_on_the_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <A New Program>button in program")
	public void admin_clicks_a_new_program_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window in program")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see two input fields and their respective text boxes in the program details window in program")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see two radio button for Program Status in program")
	public void admin_should_see_two_radio_button_for_program_status_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Manage Program Page after clicks Program on the navigation bar")
	public void admin_is_on_manage_program_page_after_clicks_program_on_the_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on {string} Popup window in program")
	public void admin_is_on_popup_window_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <Save>button without entering any data in program")
	public void admin_clicks_save_button_without_entering_any_data_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a Error message alert in program")
	public void admin_gets_a_error_message_alert_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters only<Program Name> in text box and clicks Save button in program")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message alert {string} in program")
	public void admin_gets_a_message_alert_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters only<Program description> in text box and clicks Save button in program")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin selects only Status and clicks Save button in program")
	public void admin_selects_only_status_and_clicks_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters only numbers or special char in name and desc column in program")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Program Details form in program")
	public void admin_clicks_cancel_close_x_icon_on_program_details_form_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Program Details popup window should be closed without saving in program")
	public void program_details_popup_window_should_be_closed_without_saving_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter all the required fields with valid values and click Save button in program")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert and able to see the new program added in the data table in program")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <Cancel>button in program")
	public void admin_clicks_cancel_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see the Program details popup disappears without creating any program in program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


//EDITPROGRAM-SD
	@When("Admin clicks <Edit> button on the data table for any row in program")
	public void admin_clicks_edit_button_on_the_data_table_for_any_row_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a popup open for Program details to edit in program")
	public void admin_should_see_a_popup_open_for_program_details_to_edit_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Program Details Popup window to Edit in program")
	public void admin_is_on_program_details_popup_window_to_edit_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin edits the Name column and clicks save button in program")
	public void admin_edits_the_name_column_and_clicks_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program in program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin edits the Description column and clicks save button in program")
	public void admin_edits_the_description_column_and_clicks_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert and able to see the updated description in the table for the particular program in program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin changes the Status and clicks save button in program")
	public void admin_changes_the_status_and_clicks_save_button_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert and able to see the updated status in the table for the particular program in program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <Cancel>button on edit popup in program")
	public void admin_clicks_cancel_button_on_edit_popup_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see the Program details popup disappears and can see nothing changed for particular program in program")
	public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <Save>button on edit popup in program")
	public void admin_clicks_save_button_on_edit_popup_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert and able to see the updated details in the table for the particular program in program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//DELETEPROGRAM-SD
	@When("Admin clicks <Delete> button on the data table for any row in program")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion in program")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a message {string} in program")
	public void admin_should_see_a_message_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Confirm Deletion alert in program")
	public void admin_is_on_confirm_deletion_alert_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <YES> button on the alert in program")
	public void admin_clicks_yes_button_on_the_alert_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table in program")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <NO> button on the alert in program")
	public void admin_clicks_no_button_on_the_alert_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see the deletion alert disappears without deleting in program")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Deletion alert in program")
	public void admin_clicks_cancel_close_x_icon_on_deletion_alert_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see the deletion alert disappears without any changes in program")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


//MULTIPLEDELETIONPROGRAM-SD
	@Given("Admin is on Manage Program page in program")
	public void admin_is_in_manage_program_page_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks any checkbox in the data table in program")
	public void admin_clicks_any_checkbox_in_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see common delete option enabled under header Manage Program v")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program_v() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin clicks delete button under header after selecting the check box in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table in program")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table in program")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin clicks delete button under header after selecting multiple checkboxes in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_multiple_checkboxes_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table in program")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table in program")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//SORTINGVALIDATION IN PROGRAM

	@When("Admin clicks the sort icon of program name column in program")
	public void admin_clicks_the_sort_icon_of_program_name_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program name column values in ascending order in program")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The data is in the ascending order on the table based on Program Name column in program")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program name column values in descending order in program")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the sort icon of program Desc column in program")
	public void admin_clicks_the_sort_icon_of_program_desc_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program description column values in ascending order in program")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The data is in the ascending order on the table based on Program Description column in program")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program description column values in descending order in program")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the sort icon of program Status column in program")
	public void admin_clicks_the_sort_icon_of_program_status_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program status column values in ascending order in program")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The data is in the ascending order on the table based on Program Status column in program")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program status column values in descending order in program")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



//PAGINATIONIN PROGRAM
	@When("Admin clicks Next page link on the program table in program")
	public void admin_clicks_next_page_link_on_the_program_table_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Pagination has {string} link in program")
	public void admin_should_see_the_pagination_has_link_in_program(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Last page link in program")
	public void admin_clicks_last_page_link_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled in program")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks First page link in program")
	public void admin_clicks_first_page_link_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the previous page record on the table with pagination has previous page link in program")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Start page link in program")
	public void admin_clicks_start_page_link_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the very first page record on the table with Previous page link are disabledFeature: Pagination in program")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled_feature_pagination_in_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


//NAVIGATION IN PROGRAM

@When("Admin clicks on Student link on Manage Program page in program")
public void admin_clicks_on_student_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to Student page in program")
public void admin_is_re_directed_to_student_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on Batch link on Manage Program page in program")
public void admin_clicks_on_batch_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to Batch page in program")
public void admin_is_re_directed_to_batch_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on class link on Manage Program page in program")
public void admin_clicks_on_class_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to class page in program")
public void admin_is_re_directed_to_class_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on user link on Manage Program page in program")
public void admin_clicks_on_user_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to user page in program")
public void admin_is_re_directed_to_user_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on Assignment link on Manage Program page in program")
public void admin_clicks_on_assignment_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to Assignment page in program")
public void admin_is_re_directed_to_assignment_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on Attendance link on Manage Program page in program")
public void admin_clicks_on_attendance_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to Attendance page in program")
public void admin_is_re_directed_to_attendance_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on Logout link on Manage Program page in program")
public void admin_clicks_on_logout_link_on_manage_program_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin is re-directed to Login page in program")
public void admin_is_re_directed_to_login_page_in_program() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
