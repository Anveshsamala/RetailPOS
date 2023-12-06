package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductGroupactions;

public class ProductGroupstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductGroupactions productGroupactions = new ProductGroupactions();
	
	@When("user navigate to Product-Group page")
	public void user_navigate_to_product_group_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductGroupslink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product-Group page")
	public void user_navigate_to_new_product_group_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product-Group")
	public void user_enters_all_the_details_product_group(String pgcode, String pgname, String pgaltname, String pgextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(pgcode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pgname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pgaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pgextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product-Group page")
	public void user_verify_the_view_functionality_in_product_group_page() throws InterruptedException {
		productGroupactions.clickonViewicon();
		Thread.sleep(3000);
		productGroupactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product-Group page")
	public void user_verify_to_edit_the_product_Group_page(String pgcode1, String pgname1, String pgaltname1, String pgextref1) throws InterruptedException {
		productGroupactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(pgcode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(pgname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(pgaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(pgextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}
	
	@And("user verify the Delete icon functionality in Product-Group page")
	public void user_verify_the_delete_icon_functionality_in_product_group_page() throws InterruptedException {
		productGroupactions.clickondeleteiconinproductgroup();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Product-Group")
	public void user_delete_the_record_in_product_group() throws InterruptedException {
		productGroupactions.clickondeletebuttoninproductgroup();
		Thread.sleep(3000);
	}
	
}
