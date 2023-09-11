Feature: Delete attendance validation

Background: Admin logged into LMS portal and clicks attendance button on the navigation bar


Scenario: Verify Delete attendance alert
Given Admin is in manage attendance page
When Admin clicks delete button in data table row level in attendance
Then Admin should see alert in attendance

Scenario: Verify  accept enabled in alert
Given Admin is in manage attendance page
When Admin clicks delete button in data table row level in attendance
Then Alert should have "yes" button to accept in attendance

Scenario: Verify reject enabled in alert
Given Admin is in manage attendance page
When Admin clicks delete button in data table row level in attendance
Then Alert should have "No" button to reject in attendance

Scenario: Validate accept in alert
Given Admin is in delete alert after clicking row level delete button on manage attendance page
When Admin clicks yes button in alert attendance
Then Delete Successful message is displayed and selected attendance details are deleted from the data table

Scenario: Validate reject in alert
Given Admin is in delete alert after clicking row level delete button on manage attendance page	
When Admin clicks no button	in alert attendance
Then Redirected to manage attendance page and selected attendance details are not deleted from the data table

		