package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductSubCategoryactions;
import pages.actions.ProductTaxGroupactions;

public class ProductTaxGroupPTGstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductTaxGroupactions productTaxGroupactions =new ProductTaxGroupactions();
	
	@When("user navigate to Product Tax Group page")
	public void user_navigate_to_product_tax_group_page() throws InterruptedException {
		 Thread.sleep(3000);
		customerListpageActions.clickonTaxConfigurationlink();
		 Thread.sleep(3000);
		customerListpageActions.clickonProductTaxGrouplink();
		 Thread.sleep(3000);
	}

	@And("user navigate to New Product Tax Group page")
	public void user_navigate_to_new_product_tax_group_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		 Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product Tax Group")
	public void user_enters_all_the_details_product_tax_group(String ptgCode, String ptgName, String ptgAltname, String ptgExtref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(ptgCode);
		 Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(ptgName);
		 Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(ptgAltname);
		 Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(ptgExtref);
		 Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product Tax Group page")
	public void user_verify_the_view_functionality_in_product_tax_group_page() throws InterruptedException {
		productTaxGroupactions.clickonViewicon();
		    Thread.sleep(3000);
		    productTaxGroupactions.clickonEscapeicon();
		    Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product Tax Group page")
	public void user_verify_to_edit_the_product_tax_group_page(String ptgCode1, String ptgName1, String ptgAltname1, String ptgExtref1) throws InterruptedException {
		productTaxGroupactions.clickonEditicon();
		 Thread.sleep(3000);
			businessTaxGrouphomepageActions.updateCode(ptgCode1);
			Thread.sleep(3000);
		    businessTaxGrouphomepageActions.updateName(ptgName1);
		    Thread.sleep(3000);
		    businessTaxGrouphomepageActions.updateAltname(ptgAltname1);
		    Thread.sleep(3000);
		    businessTaxGrouphomepageActions.updateExtref(ptgExtref1);
		    Thread.sleep(3000);
		    businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		    Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Product Tax Group page")
	public void user_verify_the_delete_icon_functionality_in_product_tax_group_page() throws InterruptedException {
		productTaxGroupactions.clickondeleteiconinproducttaxgroup();
	    Thread.sleep(3000);
	}

	@Then("user delete the record in Product Tax Group")
	public void user_delete_the_record_in_product_tax_group() throws InterruptedException {
		productTaxGroupactions.clickondeletebuttoninproducttaxgroup();
		  Thread.sleep(3000);
	}
	
}
