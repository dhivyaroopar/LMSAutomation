Feature: Adding and Editing New Attendance
Background: Admin click +Add New Attendance button after reaching to Manage attendance page
Given Admin is in attendance details popup window

Scenario: Validate admin able to create new attendance data
When Admin fills all the values and click save in attendance 
Then Admin should see success message in popup window and sees new attendance details in manage attendance details database

Scenario: Validate admin able to create new attendance data without program name
When Admin fills values missing program name and click save in attendance details popup
Then Program name is missing error in attendance

Scenario: Validate admin able to create new attendance data without class name
When Admin fills values missing class name and click save in attendance details popup
Then class name is missing error in attendance

Scenario: Validate admin able to create new attendance data without student name
When Admin fills values missing student name and click save in attendance details popup
Then student name is missing error in attendance

Scenario: Validate admin able to create new attendance data without attendances
When Admin fills values missing attendance and click save in attendance details popup
Then Attendance is missing error in attendance

Scenario: Validate admin able to create new attendance data without attendance date
When Admin fills values missing attendance date and click save in attendance details popup
Then Attendance date is missing error in attendance

Scenario: Validate admin able to create new attendance by selecting future date
When Admin fills values with future date  and click save in attendance details popup
Then Invalidate attendance date error in attendance

Scenario: Validate admin able to update  attendance data
When Admin fills all the values and click save in attendance details popup
Then Admin should see success message in popup window and sees new attendance details in manage attendance details database

Scenario: Validate admin able to update attendance data without program name
When Admin fills values missing program name and click save in attendance details popup
Then Program name is missing error in attendance

Scenario: Validate admin able to update attendance data without class name
When Admin fills values missing class name and click save in attendance details popup
Then class name is missing error in attendance

Scenario: Validate admin able to create new attendance data without student name
When Admin fills values missing student name and click save in attendance details popup
Then student name is missing error in attendance

Scenario: Validate admin able to create new attendance data without attendances
When Admin fills values missing attendance and click save in attendance details popup
Then Attendance is missing error in attendance

Scenario: Validate admin able to create new attendance data without attendance date
When Admin fills values missing attendance date and click save in attendance details popup
Then Attendance date is missing error in attendance

Scenario: Validate admin able to create new attendance by selecting future date
When Admin fills values with future date  and click save in attendance details popup
Then Invalidate attendance date error in attendance

Scenario: Verify next page is enabled in pagination
When Admin creates 6 new attendance in attendance page
Then when total attendance entries are above 5 next page is enabled in attendancce

Scenario: Verify next page is disabled in pagination
When Admin creates less than or equal to 5 new attendance data
Then when total attendance entries 5 or below next page is disabled in attendance            
                
                
            