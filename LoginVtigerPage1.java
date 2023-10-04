
package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginVtigerPage1
{

	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	@FindBy(xpath="(//span[@class='app-icon fa fa-bars'])[1]")
    private WebElement threelines;

	public WebElement getThreelines() {
		return threelines;
	}
	
	 @FindBy(xpath="//span[text()=' MARKETING']")
	 private WebElement marketing;

	public WebElement getMarketing() {
		return marketing;
	}
	
	 @FindBy(xpath="//span[text()=' Campaigns']")
	 private WebElement campaigns;

	public WebElement getCampaigns() {
		return campaigns;
	}
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcampaign1;

	public WebElement getAddcampaign1() {
		return addcampaign1;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement CampignName;

	public WebElement getCampignName() {
		return CampignName;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsize;

	public WebElement getTargetsize() {
		return targetsize;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	private WebElement Date;

	public WebElement getDate() {
		return Date;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement audience;

	public WebElement getAudience() {
		return audience;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponser;

	public WebElement getSponser() {
		return sponser;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_numsent")
	private WebElement numsent;

	public WebElement getNumsent() {
		return numsent;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement budgetcost;

	public WebElement getBudgetcost() {
		return budgetcost;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_actualcost")
	private WebElement actualcost;

	public WebElement getActualcost() {
		return actualcost;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedrevenue")
	private WebElement expectedrevenue;

	public WebElement getExpectedrevenue() {
		return expectedrevenue;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement expectedsalescount;

	public WebElement getExpectedsalescount() {
		return expectedsalescount;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualsalescount;

	public WebElement getActualsalescount() {
		return actualsalescount;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement expectedresponsecount;

	public WebElement getExpectedresponsecount() {
		return expectedresponsecount;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement actualresponsecount;

	public WebElement getActualresponsecount() {
		return actualresponsecount;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedroi")
	private WebElement expectedroi;

	public WebElement getExpectedroi() {
		return expectedroi;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_actualroi")
	private WebElement actualroi;

	public WebElement getActualroi() {
		return actualroi;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_description")
	private WebElement description;

	public WebElement getDescription() {
		return description;
	}
	
	
	
	
	
	
}
