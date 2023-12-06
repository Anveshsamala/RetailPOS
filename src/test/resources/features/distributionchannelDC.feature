@DistributionChannel1
Feature: Distribution Channel flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "Shahabuddin" and "revest123" username and password
    When user navigate to Distribution Channel page

  Scenario Outline: Distribution Channel creation
    And user navigate to New Distribution Channel page
    And user enters "<dccode>", "<dcname>", "<dcaltname>", "<dcextref>"  all the details Distribution Channel
    Then click on Save and new record is created

    Examples: 
      | dccode | dcname | dcaltname | dcextref |
      | 123123 | DCNAME | DCALTNAME | DCEXTREF |

  Scenario: Distribution Channel view
    Then user verify the view functionality in Distribution Channel page

  Scenario Outline: Distribution Channel edit
    Then user verify to edit the "<dccode1>", "<dcname1>", "<dcaltname1>", "<dcextref1>" Distribution Channel page

    Examples: 
      | dccode1 | dcname1 | dcaltname1 | dcextref1 |
      |  566565 | DCNAME1 | DCALTNAME2 | DCEXTREF3 |

  Scenario: Distribution Channel delete
    And user verify the Delete icon functionality in Distribution Channel page
    Then user delete the record in Distribution Channel
