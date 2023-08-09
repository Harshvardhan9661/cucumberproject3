Feature: Login functionality

Scenario Outline: Test login page with valid credential
Given User should navigate to login page
When User should enter userid <username>
And User should enter password <password>
And User should click on login button
Then User shoudl able to login successfully login 
Examples:
|username         |password|
|harshvardhan9661@gmail.com| Harsh@9334|
|harshrcpl@gmail.com| Harsh@9334|
|harsh954dddsd@gmail|Harsh@9334|

Scenario: Test login page with invalid credential
Given User should navigate to login page
When User should enter userid "abcd9661@gmail.com"
And User should enter password "abcd@9334"
And User should click on login button
Then User should get warning message 

Scenario: Test login page with invalid userid and valid password
Given User should navigate to login page
When User should enter userid "abcd9661@gmail.com"
And User should enter password "Harsh@9334"
And User should click on login button
Then User should get warning message

Scenario: Test login page with valid userid and invalid password
Given User should navigate to login page
When User should enter userid "harshvardhan9661@gmail.com"
And User should enter password "abcd@9334"
And User should click on login button
Then User should get warning message

Scenario: Test login page without entering credential
Given User should navigate to login page
When User should click on login button
Then User should get warning message