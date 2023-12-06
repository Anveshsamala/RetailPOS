package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductSubCategoryactions;


public class ProductSubCategorystep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductSubCategoryactions productSubCategoryactions = new ProductSubCategoryactions();
	
	@When("user navigate to Product-Sub-Category page")
	public void user_navigate_to_product_sub_category_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductSubCategorylink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product-Sub-Category page")
	public void user_navigate_to_new_product_sub_category_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product-Sub-Category")
	public void user_enters_all_the_details_product_sub_category(String psccode, String pscname, String pscaltname, String pscextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(psccode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pscname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pscaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pscextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product-Sub-Category page")
	public void user_verify_the_view_functionality_in_product_sub_category_page() throws InterruptedException {
		productSubCategoryactions.clickonViewicon();
		Thread.sleep(3000);
		productSubCategoryactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product-Sub-Category page")
	public void user_verify_to_edit_the_product_sub_category_page(String psccode1, String pscname1, String pscaltname1, String pscextref1) throws InterruptedException {
		productSubCategoryactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(psccode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(pscname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(pscaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(pscextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Product-Sub-Category page")
	public void user_verify_the_delete_icon_functionality_in_product_sub_category_page() throws InterruptedException {
		productSubCategoryactions.clickondeleteiconinproductsubcategory();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Product-Sub-Category")
	public void user_delete_the_record_in_product_sub_category() throws InterruptedException {
		productSubCategoryactions.clickondeletebuttoninproductsubcategory();
		Thread.sleep(3000);
	}

}
