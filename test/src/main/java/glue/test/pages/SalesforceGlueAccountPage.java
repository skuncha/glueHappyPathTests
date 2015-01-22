package glue.test.pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import ch.lambdaj.function.convert.Converter;

public class SalesforceGlueAccountPage extends PageObject {
	
	DateFormat dateFormat = new SimpleDateFormat("HHmmss");
	Calendar cal = Calendar.getInstance();
	String s = dateFormat.format(cal.getTime());
	
	static String typeOfAdv;

	private WebElementFacade salutation() 		 { return element(By.id("00ND0000005jggD"));							}
	private WebElementFacade firstname() 		 { return element(By.id("00ND0000005jgg9"));							}
	private WebElementFacade parentAccount()     { return element(By.cssSelector("#acc3"));								}
	private WebElementFacade phoneNumber()       { return element(By.cssSelector("#acc10"));							}
	private WebElementFacade accountName()       { return element(By.cssSelector("#acc2"));								}
	private WebElementFacade selectAccountType() { return element(By.id("p3")); 										}
	private WebElementFacade selectTypeOfAccount() { return element(By.id("acc6")); 									}
	private WebElementFacade clientType() 		 { return element(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/span/select/option[4]"));  }
	private WebElementFacade DAType() 			 { return element(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/span/select/option[5]"));  }
	private WebElementFacade DMGTType()			 { return element(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/span/select/option[6]"));  }
	private WebElementFacade billingStreet()     { return element(By.cssSelector("#acc17street"));       				}
	private WebElementFacade billingPostCode()   { return element(By.cssSelector("#acc17zip"));							}
	private WebElementFacade newButton() 		 { return element(By.cssSelector("input[value=' New ']"));				}
	private WebElementFacade customerRef() 		 { return element(By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2"));		}
	private WebElementFacade FinanceAccNum()     { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[3]/td[2]"));}
	private WebElementFacade CCIMailCustomerID() { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[5]/td[4]"));}
	private WebElementFacade SOPID() 			 { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[9]/td[2]"));}
	private WebElementFacade readAccountName()   { return element(By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2"));  }
	private WebElementFacade accountB_Name() 	  { return element(By.id("CF00ND0000003g0n9"));							}
	private WebElementFacade billing() 			  { return element(By.id("00ND0000003g0nB"));							}
	
	private WebElementFacade editIndCate() 		  { return element(By.name("j_id0:j_id1:j_id27:j_id28:j_id31"));		}
	private WebElementFacade mainCate()           { return element(By.name("j_id0:j_id1:j_id27:j_id36"));				}
	private WebElementFacade subCate()            { return element(By.name("j_id0:j_id1:j_id27:subcategory"));			}
	private WebElementFacade minorCate()          { return element(By.name("j_id0:j_id1:j_id27:minor"));				}
	private WebElementFacade saveIndCate()        { return element(By.name("j_id0:j_id1:j_id27:j_id28:j_id29"));		}
	
	private WebElementFacade newAccountButtonChild() { return element(By.cssSelector("input[value='New Account']"));	}
	private WebElementFacade continueButt()          { return element(By.cssSelector("input[value='Continue']")); 		}
	private WebElementFacade searchCustomerName() 	{ return element(By.xpath("//td[contains(label,'Customer Name or Aliases')]/input"));		}
	private WebElementFacade type() 				{ return element(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/span/select/option[2]"));  }
	private WebElementFacade createDirectOrder() 	{ return element(By.cssSelector("input[value='Create Direct Order']"));						}
	private WebElementFacade billingSelection() 	{ return element(By.id("j_id0:j_id1:i:f:pb:d:Billing_Selection.input"));					}
	private WebElementFacade billingSelectionNext() { return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));								}
	private WebElementFacade finish() 				{ return element(By.cssSelector("input[value='Finish']"));									}
	private WebElementFacade CCICustomerMail()      { return element(By.cssSelector("input[value='Create CCI Customer-Mail']"));				}
	
	@FindBy(how = How.CSS, using = "//td[contains(label,'Role')]/following-sibling::td/span/select")
	private WebElement role;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "AM-")
	private WebElement accountMapping;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "AUTOBILLING")
	private WebElement accountMappingBilling;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "-Mail Advertising")
	private WebElement financeAccount;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "AUTOBOOKING")
	private WebElement accountMappingBooking;
	
	@FindBy(how = How.CSS, using = "//td[text()='Customer Ref']/following-sibling::td[1]")
	private WebElement myMappingCustomerRef;

	@FindBy(how = How.XPATH, using = "//td[contains(label, 'Record Type of new record')]/following-sibling::td[1]/div/select")
	private WebElement recordType;
	
	@FindBy(how = How.XPATH, using = "//td[contains(label,'Parent Account')]/following-sibling::td[1]/span/input")
	private WebElement parentAccount;
	
	@FindBy(how = How.XPATH, using = "//td[label='Website']/following-sibling::td[1]/input")
	private WebElement website;

	@FindBy(how = How.XPATH, using = "//td[label='Employees']/following-sibling::td[1]/input")
	private WebElement employees;

	@FindBy(how = How.XPATH, using = "//div[@class='pbBottomButtons']//input[@value='Search']")
	private WebElement customerSearchButton;
	
	@FindBy(how = How.XPATH, using = "//td[label='Description']/following-sibling::td[1]/textarea")
	private WebElement description;
	
	@FindBy(how = How.XPATH, using = "//td[label='Billing Country']/following-sibling::td[1]/input")
	private WebElement billingCountry;
	
	// Order Creation

	@FindBy(how = How.LINK_TEXT, using = "123Client")
	private WebElement existingAccount;
	
	@FindBy(how = How.XPATH, using = "//input[@title='New Relationship']")
	private WebElement newRelationship;
	
	@FindBy(how = How.XPATH, using = "//td[@id='bottomButtonRow']/input[@title='Save']")
	private WebElement saveRelationship;

	@FindBy(how = How.XPATH, using = "//td[contains(label,'Account B')]/following-sibling::td[1]/div/span/input")
	private WebElement accountB;
	
	@FindBy(how = How.CSS, using = "input[value=' Save ']")
	private WebElement saveButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Accounts")
	private WebElement accounts;
		
	@FindBy(how = How.CSS, using = "input[value='Create CCI Customer-Metro']")
	private WebElement createCCICustomerMetro;

	@FindBy(how = How.XPATH, using = "//td[@id='bottomButtonRow']/input[@type='submit' and @value='Edit']")
	private WebElement Edit;
	
    public void type(String mytype) {
    	typeOfAdv = mytype;
    	Select droplist = new Select(find(By.id("acc6")));   
    	droplist.selectByVisibleText(mytype);
    }
    
    public void newAccount() {
    	newButton().click();
    }
     
    public void clickExistingAccount() {
    	existingAccount.click();
    }
    
    public void newAccountChild(String keyword) {
    	
    	waitABit(1000);
    	searchCustomerName().type(keyword);
    	customerSearchButton.click();
    	waitABit(3000);
    }
    
    public void newAccountButtonFromSearchResultsSection() {
    	waitABit(2000);
    	newAccountButtonChild().click();
    }
    
/**************************************************************CSVFile*****************************************************/
    public void read_input(String fileLoc) {

		File filePath = new File(fileLoc);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			try {
				CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
				for (Map<String, String> record : testDataSrc.getData()) {
				
/************** Select Agency Type ******************************************/  
					
				    selectAccountType().selectByVisibleText(record.get("type"));
				    continueButt().click();
				    waitABit(3000);
					
/************** Supply User Account details ********************************/  
				  
				    waitFor(5).second();
				    String str = record.get("accountType");
				    selectTypeOfAccount().selectByVisibleText(record.get("accountType"));
				    accountName().type(s + record.get("lastName"));
			    	phoneNumber().type(record.get("phone"));
			    	billingStreet().type(record.get("billingStreet"));
			    	billingPostCode().type(record.get("postalCode"));
			    	
				    	if (type().getText().equals("Brand")) {
							parentAccount().type(record.get("parentAccount"));
							waitABit(1000);
						}
			    	 
			    	if (str.equals("Private Advertiser")) {
			    		 salutation().selectByVisibleText(record.get("salutation"));
		    		     firstname().type(record.get("firstName"));
			    	}
			    	
			    	if (str.equals("Client") || str.equals("DMGT Group") || str.equals("Direct Advertiser") || str.equals("Holding Company") || str.equals("Charity")) {
			    		 salutation().selectByVisibleText(record.get("salutation"));
		    		     firstname().type(record.get("firstName"));
						waitABit(1000);
						saveButton.click();
				    	waitABit(8000);
/************** Select Industry Category ********************************/ 
				    	getDriver().switchTo().frame("066D0000000kh27");
				    	WebElement editable = getDriver().switchTo().activeElement();
				    	editable.findElement(By.cssSelector("input[name='j_id0:j_id1:j_id27:j_id28:j_id31']")).click();
				    	waitABit(3000);
			    	   	mainCate().selectByVisibleText(record.get("mainCategory"));
				 	    waitABit(3000);
				 	    subCate().selectByVisibleText(record.get("subCategory"));
				 	    waitABit(3000);
				 	    minorCate().selectByVisibleText(record.get("minorCategory"));
				 	    waitABit(3000);
				 	    saveIndCate().click();  
				 	    waitABit(4000);
					    getDriver().switchTo().defaultContent();
/************** Select Industry Category ********************************/
			    		}
			    	else {
			    	saveButton.click();
			    	waitABit(8000);
			    	}
/**************  CCI Integration  **************************************/  					    
					    
				    	CCICustomerMail().click();
				    	waitABit(4000);
						getDriver().switchTo().alert().accept();  
						waitABit(15000);
						getDriver().switchTo().alert().accept(); 
						
/***********************************************************************/						
						waitABit(4000);
				    	if (readAccountName().isVisible()) {
				    		
				    		accounts.click();
							waitABit(3000);
							newButton().click();
							waitABit(3000);
							searchCustomerName().type("xyz");
					    	customerSearchButton.click();
					    	waitABit(3000);
					    	newAccountButtonChild().click();
					    	waitFor(3).seconds();
					}
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			waitABit(1000);
		}
	}
/**************************************************************CSVFile*****************************************************/   
    
    public void recordType(String mytype) {
    	Select droplist = new Select(find(By.id("p3")));   
    	droplist.selectByVisibleText(mytype);
    }

    public void editIndustryCategory() {
    	
    	waitABit(3000);
    	WebDriver x = getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[@title='AccountIndustryCategory']")));
    	x.findElement(By.cssSelector("//td/input[@value='Edit']")).click();
    	waitABit(3000);
    }
    
    /**
     * This method is used to fill mandatory fields on Agency Account
     */
    public void supplyMandatoryFieldsForAgencyBillingAccount(Map<String, String> billingvalues){
    	
    	try {
    		
    	waitABit(1000);
    	accountName().type(s + billingvalues.get("accountName"));
    	phoneNumber().type(billingvalues.get("phoneNumber"));
    	billingStreet().type(billingvalues.get("billingStreet"));
    	billingPostCode().type(billingvalues.get("postCode"));
    	waitABit(1000);
    	}
    	catch (Exception e) { e.printStackTrace();}
    }
    
    /**
     * This method is used to fill mandatory fields on Agency Account
     */
    public void supplyMandatoryFieldsForAdviserAccount(Map<String, String> adviserMandValues){
    	
    	try {

    		waitABit(1000);
    	accountName().type(s + adviserMandValues.get("accountName"));
    		waitABit(1000);
    	phoneNumber().type(adviserMandValues.get("phoneNumber"));
    		waitABit(1000);
    	billingStreet().type(adviserMandValues.get("billingStreet"));
    		waitABit(1000);
    	billingPostCode().type(adviserMandValues.get("postCode"));
    		waitABit(1000);
//    		System.out.println("supplied value is --------->"+typeOfAdv);
	    	if (typeOfAdv.equalsIgnoreCase("Brand")) 
	    	{
				parentAccount().type(adviserMandValues.get("parentaccount"));
			}
	    	if (typeOfAdv.equalsIgnoreCase("Private Advertiser"))
	    	{
	    		salutation().selectByVisibleText(adviserMandValues.get("salutation"));
	         	firstname().type(adviserMandValues.get("firstname"));
	    	}
		}
    	catch (Exception e) { e.printStackTrace();}
    }
    
    public void createCCICustomerMail()
    {
    		waitABit(3000);
    	CCICustomerMail().click();
    		waitABit(5000);
		getDriver().switchTo().alert().accept();  
			waitABit(12000);
		getDriver().switchTo().alert().accept(); 
     }

    public void accountMapping()
    {
    	accountMapping.click();
    }

    public void financeAccount()
    {
    	financeAccount.click();
    }
    
    public void accountMappingBillingLink()
    {
    	accountMappingBilling.click();
    }
    
    public String getCustomerRef()
    {    
    	waitABit(3000);
    	System.out.println("customer reference is ------------------------------------------------------->" +customerRef().getText());
    	return customerRef().getText(); 
    	
    }
    
    public String getSOPID()
    {        	
       	System.out.println("customer Finance Account Number is : --------------->" +FinanceAccNum().getText());
    	System.out.println("customer CCIMailCustomerID is : -------------------->" +CCIMailCustomerID().getText());
    	System.out.println("customer SOPID is : -------------------------------->" +SOPID().getText());
    	return FinanceAccNum().getText();    	    	
    }
    
     public void createNewRelationshipBillingToBooking() {
    	newRelationship.click();
      }
    
    public void supplyAdviserAccountAndRolevalues(String accountBName, String role){
    	
    	accountB_Name().type(accountBName);
    	billing().selectByVisibleText(role);
    	saveRelationship.click();
    	waitABit(3000);	
    }

    public String verifyRelationship() {

    	WebElementFacade result = null;
    	result = element(By.xpath("//td/div[@id='Name_ileinner']"));	
    	return result.getText();  
    }
   
    public String saveBillingForm() {
    	waitABit(1000);
    	saveButton.click();
    	waitABit(8000);
    	return readAccountName().getText();
    }
    
    public boolean confirmAccountCreation(){
    	
    	if (readAccountName().isCurrentlyVisible())
    		return true;
    	else 
    		return false;
    }
    
    public void clickOneditIndustryCategory(){
    	
    	waitABit(2000);
    	getDriver().switchTo().frame("066D0000000kh27");
    	 WebElement editable = getDriver().switchTo().activeElement();
    	 editable.findElement(By.cssSelector("input[name='j_id0:j_id1:j_id27:j_id28:j_id31']")).click();
    	 waitABit(3000);
    }
    
   public void selectCategories(String mainCategory, String subCategory,
			String minorCategory){
	   mainCate().selectByVisibleText(mainCategory);
	   waitABit(4000);
	   subCate().selectByVisibleText(subCategory);
	   waitABit(4000);
	   minorCate().selectByVisibleText(minorCategory);
	   waitABit(3000);
   }
   
   public void createIndustryCategory(){
	   waitABit(3000);
	   saveIndCate().sendKeys(Keys.RETURN); 
	   waitABit(4000);
	   getDriver().switchTo().defaultContent();
   }
   
 /***********************************Create Order Functions *******************************/ 
   public void clickOnCreateDirectOrderButton(){
	   createDirectOrder().click();
	   waitABit(3000);
   }
   
   public void selectOrderBillingType(String keyword){
	   billingSelection().selectByVisibleText(keyword);
	   System.out.println("supplied value is :" +keyword);
	   waitABit(1000);
	   billingSelectionNext().click();  
	   waitABit(3000);
   }
   
   public void selectOrderPackage(String keyword){
	
	try {   
	 waitFor(3).seconds();
	 getDriver().switchTo().defaultContent();
	 getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));
	
 	 WebElement element = getDriver().switchTo().activeElement();
 	 waitFor(9).seconds();
 	 element.findElement(By.xpath("//td[div='DM Display']")).click();
// 	element.findElement(By.xpath("//*[@id='sf-package-list']/div/table/tbody/tr[1]/td/div[1]")).click();
	 waitABit(5000);
//	 element.findElement(By.xpath("//td[div= '"+keyword+"']")).click();
	 element.findElement(By.id("Order.Identification:order.purchaseOrderNo")).sendKeys("12");
	 waitABit(1000);
	 element.findElement(By.id("Order.Identification:order.note")).sendKeys("Test");
	 element.findElement(By.id("Order.Identification:order.message")).sendKeys("Test");
	 waitABit(1000);
	 element.findElement(By.id("Order.SalesTerritory:order.primarySalesRep.id")).sendKeys("Tom Leader");
	 waitABit(1000);
	 element.findElement(By.xpath("//h4/a/span/input")).click();  	
	 waitABit(4000);
	 element.findElement(By.xpath("//h4/a/span/input")).click(); 
	 waitABit(4000);
	 Select droplist = new Select(element.findElement(By.id("Order.Schedule:sched.publicationCode")));
	 droplist.selectByVisibleText("Daily Mail Display");
	 waitABit(2000);
	 droplist = new Select(element.findElement(By.id("Order.Schedule:sched.sectionCode")));
	 droplist.selectByVisibleText("City MD");
	 waitABit(2000);
	 droplist = new Select(element.findElement(By.id("Order.Schedule:")));
	 droplist.selectByVisibleText("01. National");
	 waitABit(6000);
	 element.findElement(By.xpath("//tbody/tr[5]/td[5]")).click();
	 waitFor(6).seconds();
	 droplist = new Select(element.findElement(By.id("Order.Schedule.Material:material.moduleCode")));
	 droplist.selectByVisibleText("10x2");
	 waitABit(4000);
	/* element.findElement(By.xpath("//nav[button='Save']/button[2]")).click();
	 waitFor(8).seconds();*/
	 element.findElement(By.xpath("//nav[button='Accept']/button[3]")).click();
	 waitABit(3000);
	 element.findElement(By.xpath(".//*[@id='salesforce-plugin']/div[2]/div/div/form/div[3]/input[4]")).click();
	 System.out.println("WOOO HOOO");
	 waitABit(2000);
	 element.findElement(By.xpath(".//*[@id='salesforce-plugin']/div[2]/div/div/form/div[3]/input[2]")).click();
	 waitABit(5000);
	} catch (Exception ex) {
		
        System.err.println("The following exception was thrown:    ");
        ex.printStackTrace(); }
   }
   
    public void parentAccount(String name) {
    	parentAccount.sendKeys(name);
    }
    
    public void continueButton() {
    	continueButt().click();
    }
    
     /* private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }*/
}
	
