Feature: Examples of Cucumber data tables implementations

  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi     |
      | banana   |
      | cucumber |
      | orange   |
      | grape    |