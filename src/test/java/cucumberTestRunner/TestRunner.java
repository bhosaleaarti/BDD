package cucumberTestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty", "html:target/cucumber-html-report"},
features = "src/test/resources/feature"
,glue={"stepDefinition"}
,tags = {"@Login,@Dashboard,@AddControlOfficers,@Inactivate,@Activate,@LEFilters,@COFilters,@Back,@LegalEntityDashboard,@AddLegalEntity,@TaskManagementDashboard,@AddTask,@PublishTask,@ViewPublishedTask,@ReviewApproveDashboard,@EditTask,@ViewPDF,@ReportManagement,@Export,@ViewChecklist,@ViewChecklistDetails,@Logout,@ControlOfficerLogin,@submit,@COLogout,@AdminLogin,@AdminDashboard,@AdminFilters,@TrailDetails,@AdminInactivate,@AdminActivate,@EditAdmin,@AdminBack,@TrialChecklist,@TrialFilters,@TrailDetails,@PaidChecklist,@PaidFilters,@AdminLogout"}
//,tags = {"@Login,@Logout,@ControlOfficerLogin,@COLogout,@AdminLogin,@AdminLogout"}
//,tags = {"@AdminLogin,@AdminDashboard,@AdminFilters,@TrailDetails,@AdminInactivate,@AdminActivate,@EditAdmin,@AdminBack,@TrialChecklist,@TrialFilters,@TrailDetails,@PaidChecklist,@PaidFilters,@AdminLogout"}

)

public class TestRunner {
	
	
	

}

