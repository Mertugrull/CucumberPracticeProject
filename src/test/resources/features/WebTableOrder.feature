Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table


    Given user is already logged in to web table app
    When user is on the “Order” page
    And user selects product type "Familybea"
    And users enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zip "50505"
    And user selects credit  card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  @wip
  Scenario Outline: User should be able to place order and order seen in web table


    Given user is already logged in to web table app
    When user is on the “Order” page
    And user selects product type "<productType>"
    And users enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<streetName>"
    And user enters city "<cityName>"
    And user enters state "<stateName>"
    And user enters zip "<zipCode>"
    And user selects credit  card type "<cardType>"
    And user enters credit card number "<cardNo>"
    And user enters expiry date "<expireDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    Examples: Famous female scientists
      | productType | quantity | customerName | streetName | cityName | stateName | zipCode | cardType | cardNo          | expireDate | expectedName |
      | MoneyCog    | 2        | Marie Curie  | London st  | London   | London    | 20555   | Visa     | 111122223333444 | 12/14      | Marie Curie  |
      | Screenable  | 2        | Rosa Linda   | London st  | London   | London    | 20555   | Visa     | 111122223333444 | 12/14      | Rosa Linda   |
      | Familybea   | 2        | Sofia Bea    | London st  | London   | London    | 20555   | Visa     | 111122223333444 | 12/14      | Sofia Beae   |



  #Note: Follow POM
#1- Parameterize scenario
#2- Scenario Outline after.