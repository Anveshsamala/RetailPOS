@productpricelist
Feature: Pricelist all flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    And user navigate to Pricelist page
    
  Scenario Outline: Create a new Pricelist record with valid data
  
    And user in new Pricelist page
    And user enter all the fileds "<pplCode>", "<pplName>", "<pplAltname>", "<pplExtref>" in new Pricelist page
    Then user create the new Pricelist record

    Examples: 
      | pplCode | pplName | pplAltname | pplExtref |
      |  123456 | name1   | altnme1    | extref1   |

  Scenario: Verify View page
    Then Verify the Pricelist view page
    
    Scenario Outline: verify the Edit page
    Then user update the Pricelist "<pplCode1>", "<pplName1>", "<pplAltname1>", "<pplExtref1>"

    Examples: 
      | pplCode1 | pplName1 | pplAltname1 | pplExtref1 |
      |   567890 | name22   | altnme22    | extref22   |
    

  Scenario: Verify Product Pricelist Delete page
    And user in Delete pop up Pricelist page
    Then user delete the Pricelist record

  