Feature:  LeafTaps - Delete Account

Scenario Outline: Delete a account in leaftaps

When Click on the crmsfa Link
And  Click the account Tab
And  Click the find accounts
And  Enter the account Id as <ID>
And  Click the Find accounts Button
And  Click the deactivate button
Then  Print the message


Examples:
|ID|
|'11305'|
|'11317'|