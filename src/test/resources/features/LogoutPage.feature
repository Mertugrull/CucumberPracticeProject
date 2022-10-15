Feature: library app logout functionality
  User Story:
  As a user, I should be able to log-out my
  account. And homepage should be displayed.

  Accounts : librarian, student and admin

  Scenario: log-out as librarian
    Given user land on dashboard as a librarian
    When user click log out button as a librarian
    Then user should see homepage

    Scenario: log-out as student
      Given user land on dashboard as a student
      When user click log out button as a student
      Then user should see homepage

      Scenario: Log-out as admin
        Given User land on as a username
        And user click log out as a admin
        Then User should see morgate

