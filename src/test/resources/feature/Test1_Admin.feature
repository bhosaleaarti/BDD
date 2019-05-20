Feature: Login as Admin

@AdminLogin
Scenario: Successful login to NYDFS after entering valid credentials
Given Open NYDFS application
And Enters valid user name and password
When User clicks on Login button
Then User is able to view Admin dashboard

@AdminDashboard
Scenario: View Dashboard
Given User is on Admin Dashboard
When Clicks on client Management 
Then User is able to view all client list

@AdminFilters
Scenario: Search by filters
Given User is on client management dashboard
When User enters appropriate filters
Then User is able to view filtered data

@AdminInactivate
Scenario: InActivating Admin
Given User is on Client Management
When select active admin and clicks on inactive button
Then admin inactivating successfully

@AdminActivate
Scenario: Activating Admin
Given User clicks on Inactivate filter
When select inactive admin and clicks on active button
Then admin activating successfully

@EditAdmin
Scenario: Edit Client details
Given User is on Client page
When Clicks on edit button
Then User is able to edit and save the details

@AdminBack
Scenario: Go back to Dashboard
Given User is on client management page
When User clicks on back button
Then User is able to redirect on dashboard page

@TrialChecklist
Scenario: View all Trial Checklist
Given User is on admin dashboard
When Clicks on Trail Checklist
Then User is able to view all trail checklist details

@TrialFilters
Scenario: Search by filter
Given User is on Trial Checklist Page
When Apply appropriate Filter
Then User is able to view filtered details for trail checklist

@TrailDetails
Scenario: View Trail Checklist details
Given User is on Trial Management page
When Clicks on Checklist name
Then User is able view trail checklist details

@AdminBack
Scenario: Go back to Dashboard
Given User is on Trial Checklist page
When clicks on back button
Then user is able to redirect on dashboard

@PaidChecklist
Scenario: View all Paid Checklist
Given User is on admin Dashboard
When Clicks on Paid Checklist
Then User is able to view all paid checklist details

@PaidFilters
Scenario: Search by filter
Given User is on Paid Checklist Page
When Apply appropriate Filters
Then User is able to view filtered details for paid checklist

@AdminBack
Scenario: Go back to Dashboard
Given User is on Paid Checklist page
When User click on back button
Then user should be able to redirect on dashboard

@AdminLogout
Scenario: Logout from the current application
Given User is on Admin Dashboard page
When User clicks on Logout Button
Then User able to redirect on Login page