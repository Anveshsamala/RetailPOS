@TaxSetup1
Feature: Tax Setup flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Tax Setup page

  #Scenario Outline: Tax Setup creation
    #And user navigate to New Tax Setup page
    #And user enters "<tcode>", "<tname>", "<taltname>", "<ttaxtype>", "<ttax>", "<tBTG>", "<tPTG>", "<tstartdate>", "<tenddate>", "<textref>"  all the details Tax Setup
    #Then click on Save and new record is created
#
    #Examples: 
      #| tcode   | tname      | taltname | ttaxtype | ttax | tBTG      | tPTG      | tstartdate | tenddate   | textref |
      #| 1223223 | Income1tax | taxprop1 | Input    |   23 | English55 | English55 | 04/10/2023 | 10/10/2023 | test    |
#
  #Scenario: Tax Setup view
    #Then user verify the view functionality in Tax Setup page

  Scenario Outline: Tax Setup edit
    Then user verify to edit the "<tcode1>", "<tname2>", "<taltname3>", "<ttaxtype4>", "<ttax5>", "<tBTG6>", "<tPTG7>", "<tstartdate8>", "<tenddate9>", "<textref10>" Tax Setup page

    Examples: 
      | tcode1 | tname2         | taltname3    | ttaxtype4 | ttax5 | tBTG6       | tPTG7   | tstartdate8 | tenddate9  | textref10 |
      | 121212 | commercial1tax | propertytax1 | Output    |    20 | English5566 | test777 | 19/10/2023  | 20/10/2023 | taxextref |

  Scenario: Tax Setup delete
    And user verify the Delete icon functionality in Tax Setup page
    Then user delete the record in Tax Setup
