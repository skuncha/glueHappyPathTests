package glue.test.steps;


import static org.fest.assertions.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import glue.test.pages.LoginPage;
import glue.test.pages.SalesforceGlueAccountPage;
import glue.test.pages.SalesforceGlueContactsPage;
import glue.test.pages.SalesforceGlueHomePage;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.thucydides.core.steps.ScenarioSteps;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsNot;
import org.openqa.selenium.Alert;

public class EndUserSteps extends ScenarioSteps {

    LoginPage loginPage;
    SalesforceGlueHomePage homePage;
    ArrayList<String> arraylist = new ArrayList<String>(); 
    
    public void is_this_home_page()  {
    	loginPage.open();
		getDriver().manage().window().maximize();
	}
    
    public void supplyLoginCredientials(String username, String password){
    	loginPage.supplyLogin_Credientials(username, password);
    }

    public void loginSuccessful() {
    	
    	loginPage.clickOnLogin();
    	waitABit(3000);
//    	assertThat(getDriver().getTitle(), is(equalTo("salesforce.com - Unlimited Edition")));
    }	
    
    public void accessNewAccountPage() {
    	
    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		homePage.AccountsTab();
		waitABit(4000);
		accountPage.newAccount();
    }
    
    public void searchForAnAccountUsingAccountName(String keyword) {
    	waitABit(1000);
    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
    	accountPage.newAccountChild(keyword);
    }
    	
    public void accessNewAccountsPageviaSearchResults() {
    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.newAccountButtonFromSearchResultsSection();
    }
    
/**************************************************CSVFile**********************************************/
    
    public void read_csv_input(String file) {

    	SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
    	accountPage.read_input(file);

	}
/**************************************************CSVFile**********************************************/  
    
	public void navigateNewAccountPage(String recordType) {
		
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.recordType(recordType);
		accountPage.continueButton();
	}

	public void selectType(String mytype) {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.type(mytype);
	}
	
	public void supplyMandatoryFieldsForAgencyBillingAccount(Map<String, String> billingvalues) {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.supplyMandatoryFieldsForAgencyBillingAccount(billingvalues);
		}
	public void supplyMandatoryFieldsForAdviserAccount(Map<String, String> adviserMandValues) {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.supplyMandatoryFieldsForAdviserAccount(adviserMandValues);
		}
	
	public void saveBillingForm() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		String str = accountPage.saveBillingForm();
		arraylist.add(str);
	}
	
	public void confirmAccountCreation() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		assertThat(accountPage.confirmAccountCreation(), is(true));
	}

		public void editIndustryCategory() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.clickOneditIndustryCategory();
	}

	public void selectCategoryValues(String mainCategory, String subCategory,
			String minorCategory) {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.selectCategories(mainCategory,subCategory,minorCategory);
	}

	public void createIndustryCategory() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.createIndustryCategory();
	}
	
	public void linkBookingAgencyAccountWithCCIMail() {
		
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.createCCICustomerMail();
	}
	
	public void accessAccountMapping() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.accountMapping();
	}
	
	public void validateAccountMapping() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		assertThat(accountPage.getCustomerRef(), not(equalTo(null)));
		getDriver().navigate().back();
	}
	
	public void returnToBillingAccount() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.accountMappingBillingLink();
	}
	
	public void accessFinanceAccount() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		accountPage.financeAccount();
	}
	
	public void validateFinanceAccount() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		assertThat(accountPage.getSOPID(), not(equalTo(null)));
	}
	
		public void createNewRelationshipBillingToBooking() {
			SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
			accountPage.createNewRelationshipBillingToBooking();
	}
		
		public void supplyAdviserAccountAndRolevalues(String accountBName, String role) {
			SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
			accountPage.supplyAdviserAccountAndRolevalues(accountBName, role);
		}
		public void verifyRelationship() {
		SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
		assertThat(accountPage.verifyRelationship().matches("TestBilling1"));
		}
		
/**
 *   Create Order steps library
 */
		public void clickOnCreateOrderFromCustomerAccount(){
			SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
			accountPage.clickOnCreateDirectOrderButton();
		}
		
		public void selectOrderBillingSelection(String keyword){
			SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
			accountPage.selectOrderBillingType(keyword);
		}
		
		public void supplyContactInformatoin(Map<String, String> contactMandValues) {
			SalesforceGlueContactsPage contactsPage = getPages().get(SalesforceGlueContactsPage.class);
			contactsPage.supplyCustomerContactInformation(contactMandValues);
			}
		public void selectAccountNameForContact(){
			SalesforceGlueContactsPage contactsPage = getPages().get(SalesforceGlueContactsPage.class);
			contactsPage.selectAccountNameForContacts(arraylist);
		}

		public void selectTypeOfPackage(String keyword){
			SalesforceGlueAccountPage accountPage = getPages().get(SalesforceGlueAccountPage.class);
			accountPage.selectOrderPackage(keyword);
		}

}