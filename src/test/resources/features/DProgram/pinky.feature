Feature: Home Page Verification
Rule: User verifying home page with correct URL
Background:
Given Admin is in home page of LMS portal using correct URL
#1
Scenario: Verify admin is able to land on home page
When Admin enter the correct LMS portal URL
Then Admin should land on the home page
#2
Scenario: Verify admin is able to land on home page with invalid URL
When Admin enter the incorrect LMS portal URL
Then Admin should land on the home page
#3
Scenario: Verify for broken link
When Admin enter the correct LMS portal URL
Then User see 400 Bad Request
#4
Scenario: Verify the text spelling in the page
When Admin enter the correct LMS portal URL
Then Admin should see correct spellings in all fields
#5
Scenario: Verify the logo of the LMS
When Admin enter the correct LMS portal URL
Then Admin should see correct logo of the LMS
#6
Scenario: Verify the logo properly aligned
When Admin enter the correct LMS portal URL
Then Admin should see logo is properly aligned
#7
Scenario: Verify login button is present
When Admin enter the correct LMS portal URL
Then Admin should see login button
#8
Scenario: Verify login button is clickable
When Admin enter the correct LMS portal URL
Then Admin should able to click the Login button
#9
Scenario: Verify the login page
When Admin clicks Login button	
Then Admin should land on the login page
#10
Scenario: Verify for broken link
When Admin clicks Login button
Then Bad Request "400"Link is broken
Rule: User verifying home page with incorrect URL
Background:
Given Admin is in home page of LMS portal using incorrect URL
#11
Scenario: Verify admin is able to land on home page with invalid UR
When Admin enter the incorrect LMS portal URL
Then Admin should get Bad Request "400" error
