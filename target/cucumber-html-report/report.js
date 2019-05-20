$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Test1_Admin.feature");
formatter.feature({
  "line": 1,
  "name": "Login as Admin",
  "description": "",
  "id": "login-as-admin",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login to NYDFS after entering valid credentials",
  "description": "",
  "id": "login-as-admin;successful-login-to-nydfs-after-entering-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AdminLogin"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open NYDFS application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enters valid user name and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User is able to view Admin dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.open_NYDFS_application()"
});
formatter.result({
  "duration": 36421512120,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.enters_valid_user_name_and_password()"
});
formatter.result({
  "duration": 3290741942,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 3097283279,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_Admin_dashboard()"
});
formatter.result({
  "duration": 68440504,
  "status": "passed"
});
formatter.after({
  "duration": 47323210,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "View Dashboard",
  "description": "",
  "id": "login-as-admin;view-dashboard",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@AdminDashboard"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Admin Dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Clicks on client Management",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User is able to view all client list",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_Admin_Dashboard()"
});
formatter.result({
  "duration": 2126758,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.clicks_on_client_Management()"
});
formatter.result({
  "duration": 4731965567,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_all_client_list()"
});
formatter.result({
  "duration": 2660718841,
  "status": "passed"
});
formatter.after({
  "duration": 811006,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search by filters",
  "description": "",
  "id": "login-as-admin;search-by-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@AdminFilters"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on client management dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User enters appropriate filters",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User is able to view filtered data",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.User_is_on_client_management_dashboard()"
});
formatter.result({
  "duration": 2127427,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_enters_appropriate_filters()"
});
formatter.result({
  "duration": 4435017401,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_filtered_data()"
});
formatter.result({
  "duration": 2340102877,
  "status": "passed"
});
formatter.after({
  "duration": 1124631,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "InActivating Admin",
  "description": "",
  "id": "login-as-admin;inactivating-admin",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@AdminInactivate"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on Client Management",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "select active admin and clicks on inactive button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "admin inactivating successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_Client_Management()"
});
formatter.result({
  "duration": 1939989,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.select_active_admin_and_clicks_on_inactive_button()"
});
formatter.result({
  "duration": 11594535296,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.admin_inactivating_successfully()"
});
formatter.result({
  "duration": 24768,
  "status": "passed"
});
formatter.after({
  "duration": 609510,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Activating Admin",
  "description": "",
  "id": "login-as-admin;activating-admin",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@AdminActivate"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User clicks on Inactivate filter",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "select inactive admin and clicks on active button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "admin activating successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_clicks_on_Inactivate_filter()"
});
formatter.result({
  "duration": 6698536574,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.select_inactive_admin_and_clicks_on_active_button()"
});
formatter.result({
  "duration": 15307227830,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.admin_activating_successfully()"
});
formatter.result({
  "duration": 2506034183,
  "status": "passed"
});
formatter.after({
  "duration": 1163793,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Edit Client details",
  "description": "",
  "id": "login-as-admin;edit-client-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@EditAdmin"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User is on Client page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Clicks on edit button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User is able to edit and save the details",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.User_is_on_Client_page()"
});
formatter.result({
  "duration": 1553396,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.Clicks_on_edit_button()"
});
formatter.result({
  "duration": 2244603277,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.User_is_able_to_edit_and_save_the_details()"
});
formatter.result({
  "duration": 9376367213,
  "status": "passed"
});
formatter.after({
  "duration": 663399,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Go back to Dashboard",
  "description": "",
  "id": "login-as-admin;go-back-to-dashboard",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@AdminBack"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "User is on client management page",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User clicks on back button",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User is able to redirect on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.User_is_on_client_management_page()"
});
formatter.result({
  "duration": 1492814,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_clicks_on_back_button()"
});
formatter.result({
  "duration": 6255955358,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_redirect_on_dashboard_page()"
});
formatter.result({
  "duration": 6303959,
  "status": "passed"
});
formatter.after({
  "duration": 826738,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "View all Trial Checklist",
  "description": "",
  "id": "login-as-admin;view-all-trial-checklist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@TrialChecklist"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "User is on admin dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "Clicks on Trail Checklist",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User is able to view all trail checklist details",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_admin_dashboard()"
});
formatter.result({
  "duration": 1203623,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.clicks_on_Trail_Checklist()"
});
formatter.result({
  "duration": 4642318735,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_all_trail_checklist_details()"
});
formatter.result({
  "duration": 102060285,
  "status": "passed"
});
formatter.after({
  "duration": 660386,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Search by filter",
  "description": "",
  "id": "login-as-admin;search-by-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@TrialFilters"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "User is on Trial Checklist Page",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "Apply appropriate Filter",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User is able to view filtered details for trail checklist",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_Trial_Checklist_Page()"
});
formatter.result({
  "duration": 1070408,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.apply_appropriate_Filter()"
});
formatter.result({
  "duration": 2043490427,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_filtered_details_for_trail_checklist()"
});
formatter.result({
  "duration": 4490013877,
  "status": "passed"
});
formatter.after({
  "duration": 663398,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "View Trail Checklist details",
  "description": "",
  "id": "login-as-admin;view-trail-checklist-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 58,
      "name": "@TrailDetails"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "User is on Trial Management page",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "Clicks on Checklist name",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "User is able view trail checklist details",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.User_is_on_Trial_Management_page()"
});
formatter.result({
  "duration": 847825,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.Clicks_on_Checklist_name()"
});
formatter.result({
  "duration": 2237347062,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.User_is_able_view_trail_checklist_details()"
});
formatter.result({
  "duration": 6731410615,
  "status": "passed"
});
formatter.after({
  "duration": 696535,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "Go back to Dashboard",
  "description": "",
  "id": "login-as-admin;go-back-to-dashboard",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@AdminBack"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "User is on Trial Checklist page",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "clicks on back button",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "user is able to redirect on dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_Trial_Checklist_page()"
});
formatter.result({
  "duration": 872593,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.clicks_on_back_button()"
});
formatter.result({
  "duration": 6261932639,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_redirect_on_dashboard()"
});
formatter.result({
  "duration": 9252100,
  "status": "passed"
});
formatter.after({
  "duration": 352451,
  "status": "passed"
});
formatter.scenario({
  "line": 71,
  "name": "View all Paid Checklist",
  "description": "",
  "id": "login-as-admin;view-all-paid-checklist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 70,
      "name": "@PaidChecklist"
    }
  ]
});
formatter.step({
  "line": 72,
  "name": "User is on admin Dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "Clicks on Paid Checklist",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "User is able to view all paid checklist details",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_admin_Dashboard()"
});
formatter.result({
  "duration": 926147,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.clicks_on_Paid_Checklist()"
});
formatter.result({
  "duration": 4404504416,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_all_paid_checklist_details()"
});
formatter.result({
  "duration": 142569769,
  "status": "passed"
});
formatter.after({
  "duration": 462571,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "Search by filter",
  "description": "",
  "id": "login-as-admin;search-by-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 76,
      "name": "@PaidFilters"
    }
  ]
});
formatter.step({
  "line": 78,
  "name": "User is on Paid Checklist Page",
  "keyword": "Given "
});
formatter.step({
  "line": 79,
  "name": "Apply appropriate Filters",
  "keyword": "When "
});
formatter.step({
  "line": 80,
  "name": "User is able to view filtered details for paid checklist",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_Paid_Checklist_Page()"
});
formatter.result({
  "duration": 817701,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.apply_appropriate_Filters()"
});
formatter.result({
  "duration": 2046078752,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_is_able_to_view_filtered_details_for_paid_checklist()"
});
formatter.result({
  "duration": 4490058393,
  "status": "passed"
});
formatter.after({
  "duration": 303918,
  "status": "passed"
});
formatter.scenario({
  "line": 83,
  "name": "Go back to Dashboard",
  "description": "",
  "id": "login-as-admin;go-back-to-dashboard",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 82,
      "name": "@AdminBack"
    }
  ]
});
formatter.step({
  "line": 84,
  "name": "User is on Paid Checklist page",
  "keyword": "Given "
});
formatter.step({
  "line": 85,
  "name": "User click on back button",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "user should be able to redirect on dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.user_is_on_Paid_Checklist_page()"
});
formatter.result({
  "duration": 778539,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.User_click_on_back_button()"
});
formatter.result({
  "duration": 6334615614,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_should_be_able_to_redirect_on_dashboard()"
});
formatter.result({
  "duration": 4145070,
  "status": "passed"
});
formatter.after({
  "duration": 326344,
  "status": "passed"
});
formatter.scenario({
  "line": 89,
  "name": "Logout from the current application",
  "description": "",
  "id": "login-as-admin;logout-from-the-current-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 88,
      "name": "@AdminLogout"
    }
  ]
});
formatter.step({
  "line": 90,
  "name": "User is on Admin Dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 91,
  "name": "User clicks on Logout Button",
  "keyword": "When "
});
formatter.step({
  "line": 92,
  "name": "User able to redirect on Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminTestSteps.User_is_on_Admin_Dashboard_page()"
});
formatter.result({
  "duration": 844812,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_clicks_on_Logout_Button()"
});
formatter.result({
  "duration": 2259557859,
  "status": "passed"
});
formatter.match({
  "location": "AdminTestSteps.user_able_to_redirect_on_Login_page()"
});
formatter.result({
  "duration": 2004362967,
  "status": "passed"
});
formatter.after({
  "duration": 455877,
  "status": "passed"
});
});