Feature: Manage Attendance Page verification

Background: Logged on the LMS portal as Admin
Given Admin is on dashboard page after Login in attendance

Scenario: Validate the header of the page
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see the Manage attendance in header in attendance

Scenario: Validate response time from dashboard page to attendance page
When Admin clicks "Attendance" on the navigation bar in attendance
Then Maximum navigation time in milliseconds, defaults to 30 seconds in attendance

Scenario: Validate the broken link
When Admin clicks "Attendance" on the navigation bar in attendance
Then HTTP response >= 400 then the link is broken in attendance

Scenario: Verify LMS title 
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see LMS -Learning management system  as title in attendance 

Scenario: Verify the alignment of the Manage Attendance header
When Admin clicks "Attendance" on the navigation bar in attendance
Then Manage attendance header should be in left side of the page in attendance

Scenario: Validate text in manage attendancepage

When Admin get all text from the portal page in attendance
Then Admin should see correct spelling for the all the fields in attendance

Scenario: Verify delete icon below the header
When Admin clicks "Attendance" on the navigation bar in attendance 
Then Admin should see disabled delete icon below the "Manage Attendance" in attendance

Scenario: Verify search bar on the class page
When Admin clicks "Attendance" on the navigation bar in attendance 
Then Admin should see search bar on the attendance page in attendance

Scenario: Verify add new Attendance button  on Attendance page
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see +Add New Attendance button on the attendance page in attendance

Scenario Outline: Verify data table on the attendance page
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see data table on the Manage Attendance Page With following "<columnheaders>" in attendance
Examples:
|columnheaders|
|Checkbox symbol|
|Class ID				|
|Student ID			|
|Present				|
|Edit/Delete		|


Scenario: Verify Edit icon in the data table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Edit Icon in each row of data table only when entries are available in attendance

Scenario: Verify Edit icon when no data in the table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Edit Icon will not be present in data table in attendance

Scenario: Verify delete icon in the data table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Delete Icon in each row of data table only  when entries are available in attendance

Scenario: Verify delete icon when no data in the table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin cant see delete  Icon in data table in attendance

Scenario: Verify sort icon in the data table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see sort icon near the column headers except for Edit and Delete in attendance

Scenario: Verify check box in the data table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see check box in the all rows  of data table in attendance

Scenario: Validate the number entries displaying
When Admin clicks "Attendance" on the navigation bar in attendance
Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table in attendance

Scenario: Verify Pagination control below the data table
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see the pagination controls under the data table in attendance

Scenario: Validate footer text
When Admin clicks "Attendance" on the navigation bar in attendance
Then Admin should see the text with total number classes in the data table in attendance


 













 



















