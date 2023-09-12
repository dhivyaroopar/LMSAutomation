Feature: Forgot username,password page Look & Feel
Rule:Verifying forgot username or password
Background: Logged on the LMS portal as Admin 
Given Admin is in login page
​
#1
Scenario: Verify forgot username or password link	
When Admin clicks forgot username or password link	
Then Admin should land on forgot username or password page
​
#2
Scenario: verify broken link		
When Admin clicks forgot username or password link	
Then Bad Request 400 wil appear
​
#3
Scenario: verify input descriptive text for Email	
	When Admin clicks forgot username or password link	
	Then Admin should see "Email" text in gray color
	
#4 
Scenario: Verify email text in text field		
	When Admin clicks forgot username or password link	
	Then Admin should see "Email" in text field
#5
Scenario: Verify send link button is present	
When Admin clicks forgot username or password link	
Then Admin should see "send Link" button
​
#6
Scenario: Verify asterik near Email text	
When Admin clicks forgot username or password link	
Then Admin should see "*" symbol near Email
​
#7
Scenario: Verify text spelling 		
When Admin clicks forgot username or password link	
Then Admin should see correct spellings in forgot username password fields
​
#8
Scenario: Verify the alignment of the send link button		
​
When Admin clicks forgot username or password link
Then Admin should see send link button in center of the page
​
Rule: Validating Forgot Password
Background: Admin is in login page
Given Admin is in forgot username and password page
​
#9
Scenario: Valid email sent for forgot password
​
When Admin enters valid email-id and clicks send link button	
 					|pm1@gmail.com| 
​
Then Admin should receive link in mail for reset username / password
 
             
​
#10
Scenario: Invalid email sent for forgot password 
When Admin enters invalid email-id and clicks send link button	
 | 123@gmail.com | 
Then Admin should not receive link in mail for reset username / password
​
#11
Scenario: Validate send link without any email 
When Admin clicks send link button without any email
				 | | 	
Then Admin should get a message "Please enter valid email id"
 