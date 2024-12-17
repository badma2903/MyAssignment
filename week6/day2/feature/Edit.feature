Feature:  LeafTaps - Edit Account

Scenario Outline: Editing a account in leaftaps

When Click on the Crmsfa Link
And  Click the Account Tab
And  Click the Find accounts
And  Enter the Account Id as <ID>
And  Click the Find accounts button
And  Click the edit button
And  Click the save button
Then  verify the account Name


Examples:
|ID|
|'11318'|
|'11319'|