package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CustomerListpageActions;

public class CustomerListCLstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	
	@When("user navigate to Customer List")
	public void user_navigate_to_customer_list() throws InterruptedException {
		Thread.sleep(3000);
	    customerListpageActions.clickonCustomerListlink();
	    Thread.sleep(5000);
	    customerListpageActions.clickonListlink();
	    Thread.sleep(6000);
	}
	
	@Then("user verify to edit the {string}, {string}, {string},{string},{string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string},{string}, Customer List page")
	public void user_verify_to_edit_the_customer_list_page(String firstname1, String lastname1, String mobile1, String selectcountry1, String customercode1, String customertype1, String customergroup1, String customerclass1, String distributionchannel1, String customerdivision1, String paymentterms1, String taxtype1, String basictaxgroup1, String pricelist1, String currency1, String externalreference1) throws InterruptedException 
	{
	    
	
//		customerListpageActions.clickonactionsoption();
		Thread.sleep(3000);
		customerListpageActions.clickoneditoption();
		Thread.sleep(3000);
		customerListpageActions.editfirstname(firstname1);
		Thread.sleep(3000);
		customerListpageActions.editlastname(lastname1);
		Thread.sleep(3000);
		customerListpageActions.editmobilenumber(mobile1);
		Thread.sleep(3000);
		customerListpageActions.editcountry(selectcountry1);
		Thread.sleep(3000);
		customerListpageActions.clickonadvance();
		Thread.sleep(3000);
		customerListpageActions.editcustomercode(customercode1);
		Thread.sleep(3000);
		customerListpageActions.editcustomertype(customertype1);
		Thread.sleep(3000);
		customerListpageActions.editcustomergroup(customergroup1);
		Thread.sleep(3000);
		customerListpageActions.editcustomerclass(customerclass1);
		Thread.sleep(3000);
		customerListpageActions.editdistributionchannel(distributionchannel1);
		Thread.sleep(3000);
		customerListpageActions.editcustomerdivision(customerdivision1);
		Thread.sleep(3000);
		customerListpageActions.clickonfinancialsection();
		Thread.sleep(3000);
		customerListpageActions.editpaymentterms(paymentterms1);
		Thread.sleep(3000);
		customerListpageActions.edittaxtype(taxtype1);
		Thread.sleep(3000);
		customerListpageActions.editbasictaxgroup(basictaxgroup1);
		Thread.sleep(3000);
		customerListpageActions.editpricelist(pricelist1);
		Thread.sleep(3000);
		customerListpageActions.editcurrency(currency1);
		Thread.sleep(3000);
		//customerListpageActions.editextref(externalreference1);
		//Thread.sleep(3000);
		customerListpageActions.clickonsaveineditpage();
		
		
		
	}

		
}
