Feature: Login with Leaftaps appplication

#Background:
#Given Launch the chrome browser
#And Load the application url

@functional
Scenario Outline: Login with valid credentials
Given Enter the username as <userName>
And Enter the password as <password>
When Click on Login button
Then HomePage should be displayed

Examples:
|userName|password|
|Demosalesmanager|crmsfa| 
|DemoCSR|crmsfa| 

 @Sanity
Scenario: Login with In-valid credentials
Given Enter the username as 'Demosalesmanager123'
And Enter the password as 'crmsfa'
When Click on Login button
But error message should be displayed

@smoke  @Sanity
Scenario: Login with In-valid credentials
Given Enter the username as 'Demosalesmanager986'
And Enter the password as 'crmsfa'
When Click on Login button
But error message should be displayed
