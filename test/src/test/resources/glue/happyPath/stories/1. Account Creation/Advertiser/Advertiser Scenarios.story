!-- Objective : Sales rep should be able to login to glue and create Advertiser Accounts 

Narrative:
In order to Create an Advertiser Accounts
As a Sales Representative
I want to login to SalesforceGlue and able to create an Advertiser Account and make CCIMail association

Meta:
@author Srinivasa Kuncha
@tag capability: Account Creattion

Scenario: Create a Charity Advertiser Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'Charity'
When Mail user fill in Mandatory fields for Advertiser Account:


|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|Charity Advertiser			|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
Then Mail user should be able to create account successfully
When Mail user click on edit button to create Industry Category
And Mail user supply input for [mainCategory], [subCategory] and [minorCategory]
And Mail user click on Save button
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|mainCategory	|subCategory			|minorCategory				|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|

Scenario: Create a Client Advertiser Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'Client'
When Mail user fill in Mandatory fields for Advertiser Account:

|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|Client Advertiser			|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
Then Mail user should be able to create account successfully
When Mail user click on edit button to create Industry Category
And Mail user supply input for [mainCategory], [subCategory] and [minorCategory]
And Mail user click on Save button
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username									        |password			|searchAccountName	|mainCategory	|subCategory			|minorCategory				|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|

Scenario: Create a Brand Advertiser Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'Brand'
When Mail user fill in Mandatory fields for Advertiser Account:

|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|Brand Advertiser			|
|parentaccount  |Client - 1419321795842		|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
Then Mail user should be able to create account successfully
When Mail user click on edit button to create Industry Category
And Mail user supply input for [mainCategory], [subCategory] and [minorCategory]
And Mail user click on Save button
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|mainCategory	|subCategory			|minorCategory				|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|

Scenario: Create a Direct Advertiser Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'Direct Advertiser'
When Mail user fill in Mandatory fields for Advertiser Account:

|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|DA Advertiser				|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
Then Mail user should be able to create account successfully
When Mail user click on edit button to create Industry Category
And Mail user supply input for [mainCategory], [subCategory] and [minorCategory]
And Mail user click on Save button
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|mainCategory	|subCategory			|minorCategory				|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|

Scenario: Create a DMGT Group Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'DMGT Group'
When Mail user fill in Mandatory fields for Advertiser Account:

|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|DMGT-Advertiser			|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
Then Mail user should be able to create account successfully
When Mail user click on edit button to create Industry Category
And Mail user supply input for [mainCategory], [subCategory] and [minorCategory]
And Mail user click on Save button
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|mainCategory	|subCategory			|minorCategory				|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|

Scenario: Create a Holding Company Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'Holding Company'
When Mail user fill in Mandatory fields for Advertiser Account:

|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|Holding Advertiser			|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|

Scenario: Create a Private Advertiser Account
Meta:
@tags feature: Advertiser Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Advertiser'
When Mail user select Account Type as 'Private Advertiser'
When Mail user fill in Mandatory fields for Advertiser Account:

|ElementName	|ElementValue				|
|salutation		|Mr.						|
|firstname		|Srinivasa					|
|accountName	|Private Advertiser				|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street					|
|postCode		|BT60JH						|

When Mail user click on Save
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|test1234			|xyz123				|

