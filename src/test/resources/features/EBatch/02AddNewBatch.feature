Feature: Add new Batch
Background:
Given Logged on the LMS portal Admin is on dashboard
#1
Scenario: Check if the fields exist in pop
Given A new pop up with Batch details appears in batch
Then The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down,Status as radio button,Number of classes as text box in batch
#2
Scenario: Check if description is optional field
Given A new pop up with Batch details appears in batch
When Fill in all the fields except description with valid values in batch
Then 	The newly added batch should be present in the data table in Manage Batch page in batch
#3
Scenario: Check if the program details are added in data table
Given A new pop up with Batch details appears in batch
When Fill in all the fields with valid values and click save in batch
Then The newly added batch should be present in the data table in Manage Batch page in batch
#4
Scenario: Check for error messages for invalid fields
Given A new pop up with Batch details appears in batch
When any of the fields have invalid values in batch
Then Error message should appear in batch
#5
Scenario: Check for error messages for mandatory fields
Given A new pop up with Batch details appears in batch
When Any of the mandatory fields are blank in batch
Then  Error message should appear in batch
