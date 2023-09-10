
 Feature: Delete Batch
Background:
Given Logged on the LMS portal Admin is on dashboard
#1
Scenario: Validate row level delete icon
Given The delete icon on row level in data table is enabled in batch
When Admin clicks the delete icon in batch
Then Alert appears with yes and No option in batch
#2
Scenario: Validate accept alert
Given Admin clicks the delete icon in batch
When You click yes option in batch
Then Batch deleted alert pops and batch is no more available in data table in batch
#3
Scenario: Validate reject alert
Given Admin clicks the delete icon in batch
When you click No option in batch
Then Batch is still listed in data table in batch