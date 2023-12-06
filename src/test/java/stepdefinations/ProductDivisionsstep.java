package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductDivisionactions;

public class ProductDivisionsstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductDivisionactions productDivisionactions =new ProductDivisionactions();
	
	@When("user navigate to Product-Divisions page")
	public void user_navigate_to_product_divisions_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductDivisionslink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product-Divisions page")
	public void user_navigate_to_new_product_divisions_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product-Divisions")
	public void user_enters_all_the_details_product_divisions(String pgcode, String pgname, String pgaltname, String pgextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(pgcode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pgname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pgaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pgextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Product-Divisions page")
	public void user_verify_the_view_functionality_in_product_divisions_page() throws InterruptedException {
		productDivisionactions.clickonViewicon();
		Thread.sleep(3000);
		productDivisionactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product-Divisions page")
	public void user_verify_to_edit_the_product_divisions_page(String pgcode1, String pgname1, String pgaltname1, String pgextref1) throws InterruptedException {
		productDivisionactions.clickonEditicon();
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

	@And("user verify the Delete icon functionality in Product-Divisions page")
	public void user_verify_the_delete_icon_functionality_in_product_divisions_page() throws InterruptedException {
		productDivisionactions.clickondeleteiconinproductdivisions();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Product-Divisions")
	public void user_delete_the_record_in_product_divisions() throws InterruptedException {
		productDivisionactions.clickondeletebuttoninproductdivisions();
		Thread.sleep(3000);
	}
	
}
