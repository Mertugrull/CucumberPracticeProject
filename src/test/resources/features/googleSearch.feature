Feature: Google search functionality
  Agile story:  As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information


  Scenario: User search apple
    Given User is on google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple is in the google title

  @scenarioOutline
  Scenario Outline: User search apple
    Given User is on google search page
    When User types "<search value>" in the google search box and clicks enter
    Then User sees "<expectedTitle>" is in the google title

    Examples: search values we are going to be using in this scenario is as below
      | search value | expectedTitle |
      | apple        | apple         |
      | rolex        | rolex         |







