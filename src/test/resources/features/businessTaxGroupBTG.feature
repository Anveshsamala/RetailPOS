@btgcreation
Feature: Business Tax group all flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    And user navigate to Business tax group

  Scenario Outline: Create a new Business Tac Group record with valid data
    And user in new business tax group page
    And user enter all the fileds "<btgCode>", "<btgName>", "<btgAltname>", "<btgExtref>"
    Then user create the new business tax group record

    Examples: 
      | btgCode  | btgName  | btgAltname | btgExtref |
      | 77773778 | nam3e134 | altnme1324 | ext3ref1  |

  Scenario: Verify View page
    Then Verify the Business tax group view page

  Scenario Outline: verify the Edit page
    Then user update the business tax group "<btgCode1>", "<btgName1>", "<btgAltname1>", "<btgExtref1>"

    Examples: 
      | btgCode1  | btgName1 | btgAltname1 | btgExtref1 |
      | 787837787 | na3me234 | alt3nme224  | extre3f22  |

  Scenario: Verify Delete page
    And user in Delete pop up page
    Then user delete the record
