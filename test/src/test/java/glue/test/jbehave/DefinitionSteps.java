package glue.test.jbehave;

import glue.test.steps.EndUserSteps;

import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class DefinitionSteps {

    @Steps
    EndUserSteps mailUser;

    @Given("Sales rep is on the Salesfoce home page")
    public void userIsOnTheSalesforceHomePage() {
        mailUser.is_this_home_page();
       
    }

    @When("Sales rep login to glue as Mail user by supplying $UserName and $Password")
    public void userSupplyLoginCredentials(String username, String password) {
        mailUser.supplyLoginCredientials(username, password);
    }

    @Then("Mail user should be able to login to glue successfully")
    public void userShouldSeeSalesforceHomePage() {
        mailUser.loginSuccessful();
    }
    
    @When("Mail user navigate to Accounts page and click on New button")
    public void accessNewAccountPage() {
    	 mailUser.accessNewAccountPage();
    }
    @When("Mail user search for an Account using $searchAccountName")
    public void searchForAnAccountUsingAccountName(String searchAccountName){
    	mailUser.searchForAnAccountUsingAccountName(searchAccountName);
    }
    
    @When("Mail user access New Account from search results section")
    public void accessNewAccountsPageviaSearchResults() {
    	mailUser.accessNewAccountsPageviaSearchResults();
    }
    
    @When("Mail user provides input data from CSV $file and create account")
    public void supplyInputToCreateNumberofUserAccounts(String file){
    	mailUser.read_csv_input(file);
    }
    
    @When("Mail user navigate to the New Account page with Record Type '$recordType'")
	public void navigateNewAccountPage(String recordType) {
    	mailUser.navigateNewAccountPage(recordType);
	}
    
	@When("Mail user select Account Type as '$type'")
	public void selectType(String type)  {
		mailUser.selectType(type);
	}
    
	@When("Mail user fill in Mandatory fields for Agency Account: $AccountTable")
	public void supplyMandatoryFieldsForAgencyAccount(ExamplesTable AccountTable){
		Map<String, String> billingvalues = new HashMap<String, String>();
		for (Map<String, String> row : AccountTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			billingvalues.put(fieldName, fieldValue);
		}
		mailUser.supplyMandatoryFieldsForAgencyBillingAccount(billingvalues);
	
	}
    
	@When("Mail user fill in Mandatory fields for Advertiser Account: $AccountTable")
	public void supplyMandatoryFieldsForBilling(ExamplesTable AccountTable){
		Map<String, String> adviserMandValues = new HashMap<String, String>();
		for (Map<String, String> row : AccountTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			adviserMandValues.put(fieldName, fieldValue);
		}
		mailUser.supplyMandatoryFieldsForAdviserAccount(adviserMandValues);
	}
	
	@When("Mail user click on Save")
	public void saveBillingForm() {
		
		mailUser.saveBillingForm();
	}
	
	@Then("Mail user should be able to create account successfully")
	public void confirmAccountCreation(){
		mailUser.confirmAccountCreation();
	}
	@When("Mail user click on edit button to create Industry Category")
	public void editIndustryCategory(){
		mailUser.editIndustryCategory();
	}
	
	@When("Mail user supply input for $mainCategory, $subCategory and $minorCategory")
	public void selectCategoryValues(String mainCategory, String subCategory, String minorCategory){
		mailUser.selectCategoryValues(mainCategory, subCategory, minorCategory);
	}
	
	@When("Mail user click on Save button")
	public void createIndustryCategory(){
		mailUser.createIndustryCategory();
	}

	@When("Mail user link Booking Agency account with CCI")
	public void linkBookingAgencyAccountWithCCI() {
		mailUser.linkBookingAgencyAccountWithCCIMail();
	}

	@When("Mail user click on Account Mapping")
	public void clickOnAccountMapping() {
		mailUser.accessAccountMapping();
	}

	@Then("Mail user verify Account Mapping")
	public void checkAccountMapping() {
		mailUser.validateAccountMapping();
	}

	@When("Mail user return to Billing Account")
	public void returnToBillingAccount() {
		mailUser.returnToBillingAccount();
	}
	
	@When("Mail user click on Finance Account")
	public void clickOnFinanceAccount()  {
		mailUser.accessFinanceAccount();
	}
	
	@When("Mail user verify Finance Account")
	public void checkFinanceAccount() {
		mailUser.validateFinanceAccount();
	}
	
	@When("Mail user click on New Relationship from Ralationship (outgoing)")
	public void createNewRelationshipTypeBilling() {
		mailUser.createNewRelationshipBillingToBooking();
	}
	
	
	@When("Mail user supply values for $accountBName and $role and submit the form")
	public void supplyAdviserAccountAndRolevalues(String accountBName, String role) {
		mailUser.supplyAdviserAccountAndRolevalues(accountBName, role);
		
	}
	
	@Then("Mail user should be able to make Billing relationship successfully")
	public void verifyRelationship() {
		mailUser.verifyRelationship();
	}
	
/********************************************************Create Order Steps **************************************************/
	
	@When("Mail user click on Create Direct Order button")
	public void clickOnCreateDirectOrderButton(){
		mailUser.clickOnCreateOrderFromCustomerAccount();
	}
	
	@When("Mail user selects billing order type as '$keyword'")
	public void selectOrderBillingSelection(String keyword){
		mailUser.selectOrderBillingSelection(keyword);
	}
	
	@When("Mail user supplys user contact information $ContactTable")
	public void supplyCustomerContactInformation(ExamplesTable ContactTable){
		Map<String, String> adviserMandValues = new HashMap<String, String>();
		for (Map<String, String> row : ContactTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			adviserMandValues.put(fieldName, fieldValue);
		}
		mailUser.supplyContactInformatoin(adviserMandValues);
	}
	
	@When("Mail user associates end user account with contact information")
	public void associateEndUserAccountWithinContactInformation(){
		mailUser.selectAccountNameForContact();
	}
	@When("Mail user selects order package type $packageType")
	public void selectOrderPackageType(String packageType) {
		mailUser.selectTypeOfPackage(packageType);
		
	}
	

	
/********************************************************Create Order Steps end **********************************************/

}
