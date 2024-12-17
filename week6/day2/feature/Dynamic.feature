#Feature-describes the functionality of the function
Feature: Salesforce - Create a New Account
#Scenario outline for dynamic parameterization
Scenario Outline: Creating a new account in Salesforce
#given - represents a pre conditon 
Given Launch the diff browser and Load the Url
#when- represents a test condition
When  Click on the Toggle menu button from the left corner
#and - represent the combnation of multiple scenarios
And   Click View All and click Sales from App Launcher
And   Click on Accounts Tab
And   Click on New Button
And   Enter your Name as <accName>
And   Select OwnerShip as Public 
And   Click the Save Button
#Then - used for positive scenarios as a o/p
Then Verify the Account name

Examples:
|accName|
|'Kag'|
|'Shazain'|
|'Padma'|

