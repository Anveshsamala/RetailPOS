package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.DistributionChannellocators;
import utilities.SeleniumDriver;

public class DistributionChannelActions {
	
	DistributionChannellocators distributionChannellocators=null;
	
	public DistributionChannelActions()
	{
		this.distributionChannellocators=new DistributionChannellocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), distributionChannellocators);
	}

	public void clickonViewicon()
	{
		distributionChannellocators.clickon_Viewicon_distributionchannel.click();
	}
	
	public void clickonEscapeicon()
	{
		distributionChannellocators.clickon_Escape_distributionchannel.click();
	}
	
	public void clickonEditicon()
	{
		distributionChannellocators.clickon_Editicon_distributionchannel.click();
	}
	
	public void clickondeleteiconindistributionchannel()
	{
		distributionChannellocators.clickon_deleteicon_distributionchannel.click();
	}
	
	public void clickondeletebuttonindistributionchannel()
	{
		distributionChannellocators.clickon_delete_button_distributionchannel.click();
	}
	
}
