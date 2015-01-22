package glue.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class SalesforceGlueHomePage extends PageObject {
	
	

	@FindBy(how = How.XPATH, using = "//td[contains(label,'Account B')]/following-sibling::td[1]/div/span/input")
	private WebElement accountB;
	
	@FindBy(how = How.CSS, using = "//td[div='DM Default']")
	private WebElement DMDefault;
	
	@FindBy(how = How.CSS, using = "//div[label='PO number']/div/div/input")
	private WebElement PONumber;

	@FindBy(how = How.CSS, using = "//div[label='Order note']/div/textarea")
	private WebElement orderNote;
	
	@FindBy(how = How.CSS, using = "//div[label='Urgent note']/div/textarea")
	private WebElement urgentNote;
	
	@FindBy(how = How.CSS, using = "//div[label='Caller name']/div/input")
	private WebElement callerName;
	
	@FindBy(how = How.CSS, using = "//div[label='Caller phone']/div/input")
	private WebElement callerPhone;	
	
	@FindBy(how = How.CSS, using = "//div/label='Responsible Salesperson'/div/select")
	private WebElement responsibleSalesperson;		
	
	@FindBy(how = How.CSS, using = "//div/label='Order status'/div/select")
	private WebElement orderStatus;			
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement publication;
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement section;
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement subsection;
	
	@FindBy(how = How.CSS, using = "//div/label='Publication'/div/select")
	private WebElement zones;
	
	@FindBy(how = How.CSS, using = "//div/label='Module'/div/div/select")
	private WebElement module;
	
	@FindBy(how = How.CSS, using = "input[value='New Account']")
	private WebElement newAccountButtonChild;
	
	@FindBy(how = How.CSS, using = "input[value='Continue']")
	private WebElement continueButton;
	
	@FindBy(how = How.CSS, using = "input[value=' Save ']")
	private WebElement saveButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	private WebElement home;

	@FindBy(how = How.LINK_TEXT, using = "Chatter")
	private WebElement chatter;
	
	@FindBy(how = How.LINK_TEXT, using = "Leads")
	private WebElement leads;
	
	@FindBy(how = How.LINK_TEXT, using = "Accounts")
	private WebElement accounts;
	
	@FindBy(how = How.LINK_TEXT, using = "FriDirectADvertiser400")
	private WebElement newAdvertiser;
	
	@FindBy(how = How.LINK_TEXT, using = "Media Leads")
	private WebElement mediaLeads;

	@FindBy(how = How.LINK_TEXT, using = "Contacts")
	private WebElement contacts;
	
	@FindBy(how = How.LINK_TEXT, using = "Pitch Hub")
	private WebElement pitchHub;

	@FindBy(how = How.LINK_TEXT, using = "Campaigns")
	private WebElement campaigns;
	
	@FindBy(how = How.LINK_TEXT, using = "Dashboards")
	private WebElement dashboards;

	@FindBy(how = How.LINK_TEXT, using = "Documents")
	private WebElement documents;
		
	@FindBy(how = How.CSS, using = "input[value='Create CCI Customer-Mail']")
	private WebElement createCCICustomerMail;

	@FindBy(how = How.CSS, using = "input[value='Create CCI Customer-Metro']")
	private WebElement createCCICustomerMetro;

	@FindBy(how = How.XPATH, using = "//td[@id='bottomButtonRow']/input[@type='submit' and @value='Edit']")
	private WebElement Edit;
	
	@FindBy(how = How.CSS, using = "input[value='Create Direct Order']")
	private WebElement createDirectOrder;


   
    
    public void type(String mytype) {
    	Select droplist = new Select(find(By.id("acc6")));   
    	droplist.selectByVisibleText(mytype);
    }
    
  
    public void AccountsTab() {
    	accounts.click();
    }
    
    public void editIndustryCategory() {
    	
    	WebDriver x = getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[@title='AccountIndustryCategory']")));
    	x.findElement(By.cssSelector("//td/input[@value='Edit']")).click();;
    }
   
   
    
    public void createCCICustomerMail()
    {
    	createCCICustomerMail.click();
    }

    
    public String getCustomerRef()
    {        
    	WebElementFacade result = null;
    	result = element(By.xpath("//td[text()='Customer Ref']/following-sibling::td[1]"));	
    	return result.getText();    	
    }
    
    public String getSOPID()
    {        	
    	WebElementFacade result = null;
    	result = element(By.xpath("//td[text()='SOP ID']/following-sibling::td[1]"));	
    	return result.getText();    	    	
    }
    
    public void checkPageSavedSuccessfully(String name) {
    	
    }
    
    public String verifyRelationship() {

    	WebElementFacade result = null;
    	result = element(By.xpath("//td/div[@id='Name_ileinner']"));	
    	return result.getText();  
    	
    }
    
    public void saveForm() {
    	saveButton.click();
    }
    
    public void continueButton() {
    	continueButton.click();
    }
    
    public int getResult() {
//        WebElementFacade result = find(By.xpath("//*[contains(text(),'rror')]"));
//    	WebElementFacade result = element(By.xpath("//*[contains(text(),'xxx')]"));
    	
    	
    	WebElementFacade result = null;
    	int returnValue = 0;
    	
    	try
    	{
    		result = element(By.xpath("//*[contains(text(),'rror')]"));
//    		JOptionPane.showMessageDialog(null, result.getText());     		    		
    		returnValue = 1;
    	
    	}
    	catch(Exception e)
    	{
    		returnValue = 0;
    	}
    	
        
        return returnValue;
    }
    
  /* public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return Convert(results, toStrings());
    }*/

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}
	
	
	


