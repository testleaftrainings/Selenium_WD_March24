Feature: To create a new lead with mandatory field
Scenario: Create a new lead in leaftaps application
Given Launch the chrome browser
And Load the application url
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa hyper link
Then MyHomePage should be displayed
When click on Leads tap
Then MyLeads Page should be displayed
When Click on create Lead tap
Then CreateLeadPage should be displayed
Given Enter the comapny name as TestLeaf
And Enter firstName as Raghu
And Enter the lastname as G
When click on CreateLead button
Then ViewLead page should be displayed