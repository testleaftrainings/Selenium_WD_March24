Feature: Login with Leaftaps appplication
Scenario: Login with valid credentials
Given Launch the chrome browser
And Load the application url
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario: Login with In-valid credentials
Given Launch the chrome browser
And Load the application url
And Enter the username as 'demosalesmanager123456'
And Enter the password as 'crmsfa'
When Click on Login button
But error message should be displayed
