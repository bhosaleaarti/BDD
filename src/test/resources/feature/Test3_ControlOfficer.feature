Feature: Login as Control Officer

@ControlOfficerLogin
Scenario: Successful login to NYDFS after entering valid credentials
Given User is redirected to NYDFS application
And User enters valid credentials
When Clicks again on Login button
Then User is able to view Control Officers Dash board

@submit
Scenario: Submit assinged task
Given List of Task are dispalyed
When user clicks on given arrow
Then user is able to update and submit the task
And User Can view Submitted task

@COLogout
Scenario: Logout from the current application
Given Control Officer is on Dashboard
When Control Officer Clicks on Logout Button
Then Control Officer should be able to redirect on Login page