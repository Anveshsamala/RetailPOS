package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductBrandactions;

public class ProducstBrandstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductBrandactions productBrandactions=new ProductBrandactions();
	
	@When("user navigate to Product-Brands page")
	public void user_navigate_to_product_brands_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductBrandslink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product-Brands page")
	public void user_navigate_to_new_product_brands_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product-Brands")
	public void user_enters_all_the_details_product_brands(String pbcode, String pbname, String pbaltname, String pbextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(pbcode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pbname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pbaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pbextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product-Brands page")
	public void user_verify_the_view_functionality_in_product_brands_page() throws InterruptedException {
		productBrandactions.clickonViewicon();
		Thread.sleep(3000);
		productBrandactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product-Brands page")
	public void user_verify_to_edit_the_product_brands_page(String pbcode1, String pbname1, String pbaltname1, String pbextref1) throws InterruptedException {
		productBrandactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(pbcode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(pbname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(pbaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(pbextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Product-Brands page")
	public void user_verify_the_delete_icon_functionality_in_product_brands_page() throws InterruptedException {
		productBrandactions.clickondeleteiconinproductbrand();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Product-Brands")
	public void user_delete_the_record_in_product_brands() throws InterruptedException {
		productBrandactions.clickondeletebuttoninproductbrand();
		Thread.sleep(3000);
	}
	
}
