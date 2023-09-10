Feature: Edit Batch
Background:
Given Logged on the LMS portal Admin is on dashboard
#1
Scenario: Validate row level edit icon
Given The edit icon on row level in data table is enabled in batch
When Admin clicks the edit icon in batch
Then A new pop up with Batch details appears in batch
#2
Scenario: Check if the fields are updated
Given Admin clicks the edit button in batch
When Update the fields with valid values and click save in batch
Then The updated batch details should appear on the data table in batch
#3
Scenario:	Check if the update throws error with invalid valued
Given Admin clicks the edit button in batch
When Update the fields with invalid values and click save in batch
Then Error message should appear in batch
#4
Scenario: Check if you get error message when mandatory fields are erased
Given Admin clicks the edit button in batch
When Erase data from mandatory field in batch
Then Error message should appear in batch
#5
Scenario: Check if description field is optional in update
Given Admin clicks the edit button in batch
When Erase data from description field in batch
Then The updated batch details should appear on the data table in batch