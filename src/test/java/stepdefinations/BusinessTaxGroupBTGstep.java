package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.Loginflowactions;
import utilities.SeleniumDriver;

public class BusinessTaxGroupBTGstep {
	
	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	Loginflowactions loginflowactions=new Loginflowactions();
	
	@Given("user navigate to {string} login page")
	public void user_navigate_to_login_page(String websiteURL) throws InterruptedException {
		SeleniumDriver.openPage(websiteURL);
	    Thread.sleep(3000);
	}

	@When("user enters {string} and {string} username and password")
	public void user_enters_and_username_and_password(String user, String pass) throws InterruptedException {
		 loginflowactions.enterusername(user);
		    Thread.sleep(3000);
		    loginflowactions.enterpassword(pass);
		    Thread.sleep(3000);
		    loginflowactions.clickonSigninButton();
		    Thread.sleep(3000);
	}

	@And("user navigate to Business tax group")
	public void user_navigate_to_business_tax_group() throws InterruptedException {
		 Thread.sleep(3000);
		customerListpageActions.clickonTaxConfigurationlink();
		 Thread.sleep(3000);
		customerListpageActions.clickonBusinessTaxGrouplink();
		 Thread.sleep(3000);
	}

	@And("user in new business tax group page")
	public void user_in_new_business_tax_group_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		 Thread.sleep(3000);
	}

	@And("user enter all the fileds {string}, {string}, {string}, {string}")
	public void user_enter_all_the_fileds(String btgCode, String btgName, String btgAltname, String btgExtref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(btgCode);
		 Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(btgName);
		 Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(btgAltname);
		 Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(btgExtref);
		 Thread.sleep(3000);
	}

	@Then("user create the new business tax group record")
	public void user_create_the_new_business_tax_group_record() throws InterruptedException {
	    businessTaxGrouphomepageActions.clickonSavebtn();
	    Thread.sleep(3000);
	}
	
	@Then("Verify the Business tax group view page")
	public void verify_the_business_tax_group_view_page() throws InterruptedException {
	    businessTaxGrouphomepageActions.clickonViewicon();
	    Thread.sleep(3000);
	    businessTaxGrouphomepageActions.clickonEscape();
	    Thread.sleep(3000);
	}
	
	@Then("user update the business tax group {string}, {string}, {string}, {string}")
	public void user_update_the_business_tax_group(String btgCode1, String btgName1, String btgAltname1, String btgExtref1) throws InterruptedException {
		businessTaxGrouphomepageActions.clickonEditicon();
		 Thread.sleep(3000);
			businessTaxGrouphomepageActions.updateCode(btgCode1);
			Thread.sleep(3000);
		    businessTaxGrouphomepageActions.updateName(btgName1);
		    Thread.sleep(3000);
		    businessTaxGrouphomepageActions.updateAltname(btgAltname1);
		    Thread.sleep(3000);
		    businessTaxGrouphomepageActions.updateExtref(btgExtref1);
		    Thread.sleep(3000);
		    businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		    Thread.sleep(3000);
		
	}

	@When("user in Delete pop up page")
	public void user_in_delete_pop_up_page() throws InterruptedException {
	    businessTaxGrouphomepageActions.clickonDeleteicon();
	    Thread.sleep(3000);
	}

	@Then("user delete the record")
	public void user_delete_the_record() throws InterruptedException {
	  businessTaxGrouphomepageActions.clickonDeletebuttonin_Deletepopuppage();
	  Thread.sleep(3000);
	}

	
	
	
}
