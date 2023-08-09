Feature: Search functionality

Scenario: Test search functionality by entering valid product
Given User should navigate to Home page 
When User should enter product "HP" in search section
And user should click on search button
Then User should able to see entered product in search page 

Scenario: Test search functionality by entering invalid product
Given User should navigate to Home page 
When User should enter product "Laptop" in search section
And user should click on search button
Then User should not able to see any product in search page

Scenario: Test search functionality without entering any product
Given User should navigate to Home page 
When user should click on search button
Then User should not able to see any product in search page