Feature: Registered functionality

Scenario: Test register page by entering mandatory detail only
Given User should navigate to Register page 
When user should enter below mandatory details
|First Name |Harshvardhan|
|Last Name | vardhan |
|E-mail| harsh954dddsdhb@gmail.com|
|Telephone| 9334615491|
|Password|Harsh@9334|
|Password Confirm| Harsh@9334|
And select privacy policy
And click on continue button
Then User credential should successfully created

Scenario: Test register page by entering all field details
Given User should navigate to Register page 
When user should enter below mandatory details
|First Name |Harshvardhan|
|Last Name | vardhan |
|E-mail| harsh945dddxhb@gmail.com|
|Telephone| 9334615491|
|Password|Harsd@9334|
|Password Confirm| Harsd@9334|
And select subscribe
And select privacy policy
And click on continue button
Then User credential should successfully created

Scenario: Test register page without entering any details
Given User should navigate to Register page 
When click on continue button
Then User should get warning message for invalid account