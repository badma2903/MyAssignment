#Feature-describes the functionality of the function
Feature: Salesforce - Edit a Account
#Scenario - describes the testcase
Scenario: Editing a account in Salesforce


#given - represents a pre conditon 
Given Launch the new browser and Load the Url
#when- represents a test condition
When Click the App Launcher Icon next to Setup
#and - represent the combnation of multiple scenarios
And Click view All and Select Accounts from App Launcher
And Search a account using your unique account name
And Click the dropdown icon and select Edit
And Set Type to Technology Partner
And Set Industry to Healthcare
And Enter the Billing Address 'Deccan'
And Enter the Shipping Address 'Pine'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
And Enter a unique number in the Phone field "9577824509"
And Set Upsell Opportunity to No
#Then - used for positive scenarios as a o/p
Then Click Save and verify the phone number





