Feature: Login as Client

@Login
Scenario: Successful login to NYDFS after entering valid credentials
Given User opens NYDFS application
And User enters valid user name and password
When Clicks on Login button
Then User is able to view Client Dash board

@Dashboard
Scenario: View all Control Officers list
Given User is on Client Dashboard
When Clicks on Control Officers Management 
Then User is able to view all Control Officers list

@AddControlOfficers
Scenario: Add Control Officers
Given User is on Control Officers Management page
When Clicks on add button
Then User is able to Add and save the details

@COFilters
Scenario: Search by filters
Given User is on Control Officers page
When Enters appropriate filters
Then User is able to view filtered details

@Inactivate
Scenario: InActivating user
Given User is on Control Officers 
When select active user and clicks on inactive button
Then user inactivating successfully

@Activate
Scenario: Activating user
Given User selects Inactivate filter
When select inactive user and clicks on active button
Then user activating successfully

@Back
Scenario: Go back to Dashboard
Given User is on Current page
When Clicks on back button
Then User is able to redirect on dashboard

@LegalEntityDashboard
Scenario: View all Legal Entity list
Given User is on client dashboard
When Clicks on Legal Entity Management
Then User is able to view all Legal Entity list

@AddLegalEntity
Scenario: Add Legal Entity
Given User is on Legal Entity Management page
When Clicks on Add button
Then User is able to Add and save the detail

@LEFilters
Scenario: Search by filter
Given User is on Legal Entity Page
When Enters appropriate Filter
Then User is able to view Filtered details

@Back
Scenario: Go back to Dashboard
Given User is on Legal Entity page
When Clicks on Back button
Then User is able to redirect on Dashboard

@TaskManagementDashboard
Scenario: View task details
Given View Task tabs
When Click on Task Management
Then User is able to view task tabs

@AddTask
Scenario: Add task
Given View Add Task tab
When Click on save button
Then User is able to Add and save the task

@PublishTask
Scenario: Publish task
Given View Unpublished Task tab
When Click on Publish button
Then User is able to Publish the task

@ViewPublishedTask
Scenario: View recently Published task
Given View Published Task tab
When Select page size to view published task if required
Then User is able to view recently published task

@Back
Scenario: Go back to Dashboard
Given User is on Task management page
When clicks on Back Button
Then User should be able to redirect on Dashboard

@ReviewApproveDashboard
Scenario: View all Review/Approve task list
Given User is on Client dashboard
When Clicks on Review Approve Task
Then User is able to view all Submitted task list

@EditTask
Scenario: Edit Submitted task
Given User is on Review Approve Page
When Clicks on Edit button
Then User is able to edit Submitted task

@Back
Scenario: Go back to Review Approve
Given User is on Edit Review Approve page
When Clicks on Back Button
Then User should able to redirect on Review Approve page

@ViewPDF
Scenario: View Generated PDF
Given User is on Review Approve page
When Selects Approved Task
Then User should able to view generated PDF

@Back
Scenario: Go back to Dashboard
Given User is on review approve page
When clicks on Back button
Then User should be able to redirect on Dashboard page

@ReportManagement
Scenario: View Report Management page
Given user is on Client dashboard
When Clicks on Report Management
Then User is able to view Report Management page

@Export
Scenario: Export data into Excel file
Given user is on Report Management page
When Clicks on Export button
Then User is able to export data into excel

@Back
Scenario: Go back to Dashboard
Given User is on Report Management page
When click on Back Button
Then User should be able to redirect on Dashboard Page

@ViewChecklist
Scenario: View Checklist details
Given user is on Client Dashboard
When Clicks on View Checklist
Then User is able to view Checklist details

@Filters
Scenario: Search by filters
Given User is on View Checklist page
When Enter appropriate filters
Then User is able to view filtered checklist details

@ViewChecklistDetails
Scenario: View Perticular Checklist details
Given user is on View Checklist page
When Clicks on Checklist Name
Then User is able to view details of perticular checklist

@Back
Scenario: Go back to Dashboard
Given User is on View checklist page
When Click on Back Button
Then User should be able to redirect on dashboard page

@Logout
Scenario: Logout from the current application
Given User is on Dashboard
When Click on Logout Button
Then User should be able to redirect on Login page