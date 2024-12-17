Feature:  LeafTaps - Create Account

Scenario Outline: Creating a account in leaftaps

When Click on the Crmsfa link
And  Click the Account tab
And Click the Create Account button 
And  Enter the account name as <Username>
And  Click the submit button
Then  Verify the account Name


Examples:
|Username|
|'Krish'|
|'Abhi'|