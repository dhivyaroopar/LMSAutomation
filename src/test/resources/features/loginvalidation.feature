#Feature: Login page validation
Background: Logged on the LMS portal as Admin 
Given Admin is in login page
​
#1
Scenario Outline: Validate login with valid credentials
When Admin enter valid username "<SheetName>" and  valid password "<RowNumber>" 
 and admin clicks login button 
Then Admin should land on dashboard page
​
 Examples: 
      | SheetName   |RowNumber|
      | Login_Page|  		2	|
​
​
#2
Scenario: verify login button action through keyboard 
When Admin user enter valid username"<SheetName>" and password "<RowNumber>" 
 and clicks login button through keyboard	
Then Admin should land on dashboard page
​
Examples: 
      | SheetName  | RowNumber|
      |  Login_Page	|  	2		|
​
#3
Scenario: verify login button action through mouse
When User enter valid username"<SheetName>" and password "<RowNumber>" 
and  user clicks login button through mouse
Then Admin should land on dashboard page
​
Examples: 
      | SheetName  | RowNumber|
      |  Login_Page	|  	2		|
​
#4
Scenario Outline: Validate login with invalid credentials
When Admin enter invalid username "<SheetName>" and  invalid password "<RowNumber>"  
and admin user clicks login button
Then Error message please check username/password
​
 Examples: 
      | SheetName  | RowNumber|
      | Login_Page|  	3		|
      
#5 Negative Scenario
Scenario: Validate login with blank username credentials
When Admin enter blank username "<SheetName>" and  valid password "<RowNumber>"  
and user clicks login button 
Then Error message please check username/password
 
 Examples: 
      | SheetName  | RowNumber|
      | Login_Page |  	4	|
​
#6
Scenario: Validate login with blank password credentials
When Admin enter valid username "<SheetName>" and  blank password "<RowNumber>"  
and user click login button 
Then Error message please check username/password
​
Examples: 
      | SheetName  | RowNumber|
  
       | Login_Page|  5	|
       
       
 #7
Scenario: Validate login with valid username invalid password 
When Admin enter valid username "<SheetName>" and  invalid password "<RowNumber>"  
and user click login button 
Then Error message please check username/password
​
Examples: 
      | SheetName  | RowNumber|
  
       | Login_Page|  6	|  
 #8
Scenario: Validate login with invalid username valid password 
When Admin enter invalid username "<SheetName>" and  valid password "<RowNumber>"  
and User click login button 
Then Error message please check username/password
​
Examples: 
      | SheetName  | RowNumber|
  
       | Login_Page|  7	|       
       
​
#9
Scenario: validate login with empty values in both field
When Admin clicks login button with blank username "<SheetName>" and  blank password "<RowNumber>"  
Then Error message please check username/password
​
Examples: 
      |SheetName|RowNumber|
      |Login_Page|8|
​
​
