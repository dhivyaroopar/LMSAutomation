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

Feature: Navigation Validation from student page to other Pages

Scenario: Program link on navigation bar
Given Admin is on student details page
When Admin clicks on program link on student page
Then Admin is redirected to Program page


Scenario: Batch link on navigation bar
Given Admin is on student details page
When Admin clicks on Batch link on student page
Then Admin is redirected to Batch page


Scenario: Class link on navigation bar
Given Admin is on student details page
When Admin clicks on Class link on student page
Then Admin is redirected to Class page


Scenario: User link on navigation bar
Given Admin is on student details pageWhen 
When Admin clicks on User link on student page
Then Admin is redirected to User page


Scenario: Assignment link on navigation bar
Given Admin is on student details page
When Admin clicks on Assignment link on student page
Then Admin is redirected to Assignment page


Scenario: Attendance link on navigation bar
Given Admin is on student details page
When Admin clicks on Attendence link on student page
Then Admin is redirected to Attendence page


Scenario: Logout link on navigation bar
Given Admin is on student details page
When Admin clicks on Logout link on student page
Then Admin is redirected to Logout page


