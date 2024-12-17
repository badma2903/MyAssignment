#Feature-describes the functionality of the function
Feature: Salesforce - Create a New Account
#Scenario - describes the testcase
Scenario: Creating a new account in Salesforce
#given - represents a pre conditon 
Given Launch the chrome browser and Load the Url
#when- represents a test condition
When  Click on the toggle menu button from the left corner
#and - represent the combnation of multiple scenarios
And   Click view All and click Sales from App Launcher
And   Click on Accounts tab
And   Click on New button
And   Enter your name as account name
And   Select Ownership as Public 
And   Click the Save button
#Then - used for positive scenarios as a o/p
Then  Verify the account name




 

 