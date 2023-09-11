Feature: Attendance details popup window verification

Background: Admin is in Manage attendance page after login
Given Admin is in manage attendance page


Scenario: Verify all label text
When Admin clicks "+A New Attendance" button in attendance page
Then Admin should see correct spellings in the label on attendance details popup

Scenario: Verify dropdown box is present
When Admin clicks "+A New Attendance" button in attendance page
Then "4" dropdown should be present on attendance details popup

Scenario: Verify close button in attendance details popup window
When Admin clicks "+A New Attendance" button in attendance page
Then Admin should see  close button on the attendance details popup window

Scenario: Verify the alignment of the close button
When Admin clicks "+A New Attendance" button in attendance page
Then Close button should on the top right corner on attendance details popup

Scenario: Verify the text on first dropdown select a program name 
When Admin clicks "+A New Attendance" button in attendance page
Then First dropdown box "Select a Program name" text should be present on attendance details popup

Scenario: Verify the text on second dropdown select class name
When Admin clicks "+A New Attendance" button in attendance page
Then Second dropdown box "Select Class Name" text should be present on attendance details popup 

Scenario: Verify the text on third dropdown select students
When Admin clicks "+A New Attendance" button in attendance page 
Then Third dropdown box "Select students" text should be present on attendance details popup

Scenario: Verify the text on fourth dropdown select attendance
When Admin clicks "+A New Attendance" button in attendance page
Then Fourth dropdown box "Select Attendance" text should be present on attendance details popup 

Scenario: Verify all the text inside the dropdown box is gray color
When Admin clicks "+A New Attendance" button in attendance page
Then Admin  should see text in gray color in dropdown on attendance details popup

Scenario: Verify save button is present
When Admin clicks "+A New Attendance" button in attendance page
Then Admin should see save button on attendance details popup

Scenario: Verify cancel button is present
When Admin clicks "+A New Attendance" button in attendance page
Then Admin should see  cancel button on attendance details popup

Scenario: Verify order of the label in attendance details page
When Admin clicks "+A New Attendance" button in attendance page
Then Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date on attendance details popup



 

























