Feature: Employee Info Update Functionalities

@smoke
Scenario: Login as an Employee
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Employee Login
Then I enter User Id "testpilot@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see Employee Home Page
Then I click My Profile
Then I click Update Info
And I update Contact
Then I click submit button
Then I click refresh url
Then I will see sucessfully update