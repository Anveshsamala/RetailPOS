package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductCategoryactions;

public class Product_Categorystep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductCategoryactions productCategoryactions = new ProductCategoryactions();
	
	@When("user navigate to Product-Category page")
	public void user_navigate_to_product_category_page() throws InterruptedException {
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductCategorylink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product-Category page")
	public void user_navigate_to_new_product_category_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product-Category")
	public void user_enters_all_the_details_product_category(String pccode, String pcname, String pcaltname, String pcextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(pccode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pcname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pcaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pcextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product-Category page")
	public void user_verify_the_view_functionality_in_product_category_page() throws InterruptedException {
		productCategoryactions.clickonViewicon();
		Thread.sleep(3000);
		productCategoryactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product-Category page")
	public void user_verify_to_edit_the_product_category_page(String pccode1, String pcname1, String pcaltname1, String pcextref1) throws InterruptedException {
		productCategoryactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(pccode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(pcname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(pcaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(pcextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Product-Category page")
	public void user_verify_the_delete_icon_functionality_in_product_category_page() throws InterruptedException {
		productCategoryactions.clickondeleteiconinproductcategory();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Product-Category")
	public void user_delete_the_record_in_product_category() throws InterruptedException {
		productCategoryactions.clickondeletebuttoninproductcategory();
		Thread.sleep(3000);
	}
}
