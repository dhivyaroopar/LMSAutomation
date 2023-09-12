Feature: Edit Program Details
Rule: Admin clicks program on dashboard page
Background:
Given Admin is on dashboard page after Login and clicks Program on the navigation bar

#1
Scenario: Validate Edit Feature
Given Admin is on Manage Program Page in program
When Admin clicks <Edit> button on the data table for any row in program
Then Admin should see a popup open for Program details to edit in program

Rule: Admin clicks program to navigate to manage program page
Background:
Given Admin is on Manage Program Page after clicks Program on the navigation bar

#2
Scenario: Edit Program Name
Given Admin is on Program Details Popup window to Edit in program
When Admin edits the "Name column" and clicks save button in program
Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program in program
Examples:
|Sheetname|RowNumber|
|program|5|
#3
Scenario: Edit Program description
Given Admin is on Program Details Popup window to Edit in program
When Admin edits the "Description column" and then
 clicks save button in program
Then Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program in program
Examples:
|Sheetname|RowNumber|
|program|6|

#4
Scenario: Change Program Status
Given Admin is on Program Details Popup window to Edit in program
When Admin changes the Status and clicks save button in program
Then Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program in program

#5
Scenario: Validate invalid values on the text column
Given Admin is on Program Details Popup window to Edit in program
When Admin enters only numbers or special char in name and desc column in program
Then Admin gets a Error message alert in program

#6
Scenario: Validate Cancel button on Edit popup
Given Admin is on Program Details Popup window to Edit in program
When Admin clicks <Cancel>button on edit popup in program
Then Admin can see the Program details popup disappears and can see nothing changed for particular program in program

#7
Scenario: Validate Save button on Edit popup
Given Admin is on Program Details Popup window to Edit in program
When Admin clicks <Save>button on edit popup in program
Then Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program in program
