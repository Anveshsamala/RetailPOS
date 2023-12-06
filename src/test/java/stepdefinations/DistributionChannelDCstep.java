package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.DistributionChannelActions;

public class DistributionChannelDCstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	DistributionChannelActions distributionChannelActions=new pages.actions.DistributionChannelActions();
	
	@When("user navigate to Distribution Channel page")
	public void user_navigate_to_distribution_channel_page() throws InterruptedException {
		customerListpageActions.clickonCustomerListlink();
		Thread.sleep(3000);
		customerListpageActions.clickonDistributionChannellink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Distribution Channel page")
	public void user_navigate_to_new_distribution_channel_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Distribution Channel")
	public void user_enters_all_the_details_distribution_channel(String dccode, String dcname, String dcaltname, String dcextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(dccode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(dcname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(dcaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(dcextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Distribution Channel page")
	public void user_verify_the_view_functionality_in_distribution_channel_page() throws InterruptedException {
		distributionChannelActions.clickonViewicon();
		Thread.sleep(3000);
		distributionChannelActions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Distribution Channel page")
	public void user_verify_to_edit_the_distribution_channel_page(String dccode1, String dcname1, String dcaltname1, String dcextref1) throws InterruptedException {
		distributionChannelActions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(dccode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(dcname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(dcaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(dcextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Distribution Channel page")
	public void user_verify_the_delete_icon_functionality_in_distribution_channel_page() throws InterruptedException {
		distributionChannelActions.clickondeleteiconindistributionchannel();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Distribution Channel")
	public void user_delete_the_record_in_distribution_channel() throws InterruptedException {
		distributionChannelActions.clickondeletebuttonindistributionchannel();
		  Thread.sleep(3000);
	}
}
