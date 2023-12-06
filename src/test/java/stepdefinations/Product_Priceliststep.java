package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductPricelistactions;


public class Product_Priceliststep {
	
	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductPricelistactions productPricelistactions =new ProductPricelistactions(); 

	@And("user navigate to Pricelist page")
	public void user_navigate_to_pricelist_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductPricelistlink();
		Thread.sleep(3000);
	}

	@And("user in new Pricelist page")
	public void user_in_new_pricelist_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();	
		Thread.sleep(3000);
	}

	@And("user enter all the fileds {string}, {string}, {string}, {string} in new Pricelist page")
	public void user_enter_all_the_fileds_in_new_pricelist_page(String pplCode, String pplName, String pplAltname, String pplExtref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(pplCode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(pplName);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(pplAltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(pplExtref);
		Thread.sleep(3000);
	}

	@Then("user create the new Pricelist record")
	public void user_create_the_new_pricelist_record() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonSavebtn();
	    Thread.sleep(3000);
	}

	@Then("Verify the Pricelist view page")
	public void verify_the_pricelist_view_page() throws InterruptedException {
		productPricelistactions.clickonViewicon();
		Thread.sleep(3000);
		productPricelistactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user update the Pricelist {string}, {string}, {string}, {string}")
	public void user_update_the_pricelist(String pplCode1, String pplName1, String pplAltname1, String pplExtref1) throws InterruptedException {
		productPricelistactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(pplCode1);
		Thread.sleep(3000);
	    businessTaxGrouphomepageActions.updateName(pplName1);
	    Thread.sleep(3000);
	    businessTaxGrouphomepageActions.updateAltname(pplAltname1);
	    Thread.sleep(3000);
	    businessTaxGrouphomepageActions.updateExtref(pplExtref1);
	    Thread.sleep(3000);
	    businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
	    Thread.sleep(3000);
	}

	@And("user in Delete pop up Pricelist page")
	public void user_in_delete_pop_up_pricelist_page() throws InterruptedException {
		productPricelistactions.clickondeleteiconinproductcategory();
		Thread.sleep(3000);
	}

	@Then("user delete the Pricelist record")
	public void user_delete_the_pricelist_record() throws InterruptedException {
	    productPricelistactions.clickondeletebuttoninproductcategory();
	    Thread.sleep(3000);
	}
	
}
