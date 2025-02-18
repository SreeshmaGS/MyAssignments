Feature: Login functionality of Sales Force application

Scenario: Login with valid credentials and Verify account Name

Given Launch the Sales Force browser
And Load the Sales Force url
And Enter the SF username as 'vidyar@testleaf.com'
And Enter the SF password as 'Sales@123'
When Click on the SF Login button 
And Click on the Toggle button
And Click Sales from App Launcher
And Click on Acccount Tab
And Click on New button
And Enter Account Name
And  Select Ownership as Public
And Click Save
Then Verify Account Name 
