package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductFamilyactions;

public class ProductFamilystep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductFamilyactions productFamilyactions=new ProductFamilyactions(); 
	
	@When("user navigate to Product-Family page")
	public void user_navigate_to_product_family_page() throws InterruptedException {
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductsFamilylink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product-Family page")
	public void user_navigate_to_new_product_family_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product-Family")
	public void user_enters_all_the_details_product_family(String pfcode, String pfname, String pfaltname, String pfextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(pfcode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pfname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pfaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pfextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product-Family page")
	public void user_verify_the_view_functionality_in_product_family_page() throws InterruptedException {
		productFamilyactions.clickonViewicon();
		Thread.sleep(3000);
		productFamilyactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product-Family page")
	public void user_verify_to_edit_the_product_family_page(String pfcode1, String pfname1, String pfaltname1, String pfextref1) throws InterruptedException {
		productFamilyactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(pfcode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(pfname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(pfaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(pfextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Product-Family page")
	public void user_verify_the_delete_icon_functionality_in_product_family_page() throws InterruptedException {
		productFamilyactions.clickondeleteiconinproductbrand();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Product-Family")
	public void user_delete_the_record_in_product_family() throws InterruptedException {
		productFamilyactions.clickondeletebuttoninproductbrand();
		Thread.sleep(3000);
	}
	
}
