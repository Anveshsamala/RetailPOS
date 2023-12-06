@CustomerList
Feature: Customer List flows

  Background: 
    Given user navigate to "https://dev.revestretail.com/auth/login/" login page
    When user enters "Anvesh" and "Revest@123" username and password
    And user navigate to Customer List

  #Scenario Outline: Customer List creation
  #When user navigate to New Customer List page
  #And user enters "<firstname>", "<lastname>", "<mobile>","<selectcountry>","<customercode>", "<customertype>", "<customergroup>", "<distributionchannel>", "<customerdivision>","<businesstaxgroup>", "<paymentterms>", "<creditlimit>", "<pricelist>","<currency>"  all the details Customer List
  #Then click on Save and new record is created
  #
  #Examples:
  #| firstname | lastname | mobile      | selectcountry | customercode | customertype | customergroup | distributionchannel | customerdivision | businesstaxgroup | paymentterms | pricelist       | currency       |
  #| FIRSTNAME | LASTNAME | 84990990897 | Saudi Arabia  |       999999 | External     | Test          | arabic              | testing          | english          | pay test     | Wholesale Price | Algerian Dinar |
  #Examples:
  #| firstname | lastname | mobile     | email         | dob        | selectcountry | selectregion | selectcity | street     | tags  | customercode | customertype | customergroup | customer class | distributionchannel | customerdivision | salesman | status | taxnumber | businesstaxgroup | paymentterms | creditlimit | pricelist   | customerbalance | currency | externalreference |
  #| FIRSTNAME | LASTNAME | 8499099088 | abc@gmail.com | 01/30/1994 | Saudi Arabia  | Riyadh       | Muhayil    | Kings road | test1 |       123456 | Internal     | S2            | test111        | test                | test11           | Yousef   | Active |    123123 | testing          | pay test     |     1000000 | Store Price |          500000 | Lek      | EXTREF            |
  #
  #Scenario: Customer List view
  #Then user verify the view functionality in Customer List page
  Scenario Outline: Customer List edit
    Then user verify to edit the "<firstname1>", "<lastname1>", "<mobile1>","<selectcountry1>","<customercode1>", "<customertype1>", "<customergroup1>","<customerclass1>", "<distributionchannel1>", "<customerdivision1>", "<paymentterms1>", "<taxtype>","<basictaxgroup1>", "<pricelist1>","<currency1>", Customer List page

    Examples: 
      | firstname1 | lastname1 | mobile1    | selectcountry1 | customercode1 | customertype1 | customergroup1 |customerclass1| distributionchannel1 | customerdivision1 | paymentterms1        | taxtype              | basictaxgroup1       | pricelist1      |currency1     |
      | FIRSTNAME1 | LASTNAME1 | 8499099087 | Saudi Arabia   |     999787999 | External      | test0000       |11111         | Hekmat               | test0000          | withdraw             | BASIC_TAX_GROUP      | Tax 15 per exclusive | pricelist-123   | Saudi Riyal  |
  #Scenario: Customer List delete
    #And user verify the Delete icon functionality in Customer List page
    #Then user delete the record in Customer List
