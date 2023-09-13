#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Student Page verification


Scenario: Validate the title of the page 
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see the Student details Page Title


Scenario: Validate response time from dashboard page to student page
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Maximum navigation time in milliseconds, defaults to 30 seconds


Scenario: Validate the broken link
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then HTTP response >= 400. Then the link is broken


Scenario: Verify LMS title 
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then HTTP response >= 400. Then the link is broken


Scenario: Verify the alignment of the Student detail title
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Student Detail title should be in centre of the page


Scenario: Validate drop down is present in the page down
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then 2 dropdowns should be present in the page


Scenario: Validate search bar in select batch id drop down
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see search box inside batch id drop down

 
Scenario: Validate text spelling student name
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see correct spelling select student name


Scenario: Validate text spelling select batch id
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see correct spelling select batch id text


Scenario: Validate only numbers inside select batch id
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see only numbers inside batch id drop down


Scenario: Validate gray color in student name drop down
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see select student name in gray color


Scenario: Validate gray color in student name drop down
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see select batch ID in gray color


Scenario: Validate first drop down label is select student name
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see select student name in first


Scenario: Validate second drop down label is select batch id
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see select batch id in second


Scenario: Validate scroll down inside student name dropdown
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should able to scroll down to select the name


Scenario: Validate scroll down inside batch id dropdown
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should able to scroll down to select the batch id


Scenario: Validate select student name is fading
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin shouldn't see select student name text

 
Scenario: Validate select batch id is fading
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin shouldn't see select batch id text 


Scenario: Validate select student name using search box
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see student name start with x is listed below


Scenario: Validate select batch id using search box
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Admin should see batch id start with x is listed below


Scenario: Validate selecting only student name will not display any details
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Student details shouldn't be displayed


Scenario: Validate selecting only batch id will not display any details
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Student details shouldn't be displayed


Scenario: Validate selecting student name and batch id
Given Admin is on dashboard page after Login
When Admin clicks "Student" on the navigation bar
Then Particular student informations should be display


