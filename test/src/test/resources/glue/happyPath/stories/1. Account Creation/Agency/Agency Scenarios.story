!-- Objective : A sales reprasentative should be able to login to glue and create accounts such as Billing Agency, Booking Agency, Private Advertiser etc and associate account with CCIMail 
!-- Then verify Account Mapping and Fianance Account configuations upon successful CCIMail association

Narrative:
In order to verify Account Mapping and Finance Account configurations upon successful CCIMail association with customer accounts
As a Sales Representative
I want to login to SalesforceGlue and able to create customer accounts and ensure CCIMail association

Scenario: Create a Billing Agency Account
Meta:
@author Srinivasa Kuncha
@tag capability: Agency Creattion
@tags feature: Agency Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName]
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Agency'
When Mail user select Account Type as 'Billing Agency'
When Mail user fill in Mandatory fields for Agency Account:

|ElementName	|ElementValue				|
|accountName	|AUTOBILLING				|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street	Billing			|
|postCode		|BT60JH						|

When Mail user click on Save
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping
When Mail user click on Finance Account
And Mail user verify Finance Account

Examples:
|username											|password			|searchAccountName	|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|glue1234			|XYZ123				|

Scenario: Create a Booking Agency Account
Meta:
@author Srinivasa Kuncha
@tag capability: Agency Creattion
@tags feature: Agency Account
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Agency'
When Mail user select Account Type as 'Booking Agency'
When Mail user fill in Mandatory fields for Agency Account:

|ElementName	|ElementValue				|
|accountName	|AUTOBOOKIG					|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street	Booking			|
|postCode		|W8 5TT						|

When Mail user click on Save
And Mail user link Booking Agency account with CCI
When Mail user click on Account Mapping
Then Mail user verify Account Mapping

Examples:
|username											|password			|searchAccountName	|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|glue1234			|XYZ123				|

Scenario: Link Billing account to Booking 
Meta:
@author Srinivasa Kuncha
@tag capability: Agency Mapping
@tags feature: Association
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Agency'
When Mail user select Account Type as 'Billing Agency'
When Mail user fill in Mandatory fields for Agency Account:

|ElementName	|ElementValue				|
|accountName	|AUTOBILLING				|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street	Billing			|
|postCode		|BT60JH						|

When Mail user click on Save
When Mail user click on New Relationship from Ralationship (outgoing)
And Mail user supply values for [accountBName] and [role] and submit the form
Then Mail user should be able to make Billing relationship successfully

Examples:
|username											|password			|searchAccountName	|accountBName				|role	|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|glue1234			|XYZ123				|Essence					|Billing|

Scenario: Link Booking account to Client
Meta:
@skip
@tags feature: Association
Given Sales rep is on the Salesfoce home page
When Sales rep login to glue as Mail user by supplying [username] and [password]
Then Mail user should be able to login to glue successfully
When Mail user navigate to Accounts page and click on New button
And Mail user search for an Account using [searchAccountName] 
And Mail user access New Account from search results section
When Mail user navigate to the New Account page with Record Type 'Agency'
When Mail user select Account Type as 'Booking Agency'
When Mail user fill in Mandatory fields for Agency Account:

|ElementName	|ElementValue				|
|accountName	|AUTOBOOKIG					|
|phoneNumber	|020 000000000				|
|billingStreet	|DMG Street	Booking			|
|postCode		|W8 5TT						|

When Mail user click on Save
When Mail user click on New Relationship from Ralationship (outgoing)
And Mail user supply values for [accountBName] and [role] and submit the form
Then Mail user should be able to make Billing relationship successfully

Examples:
|username											|password			|searchAccountName	|accountBName						|role		|
|srinivasa.kuncha@mailnewspapers.co.uk.prodmirror	|glue1234			|XYZ123				|Goodstuff Communications			|Booking	|