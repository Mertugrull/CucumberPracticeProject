@Regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with valid credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file , user is expected to be on login page.
    Given user is on the library login page

      @librarian
      Scenario: login as librarian
      When user enters librarian username
      And user input librarian password
      Then user should see the dashboard

      @admin
      Scenario: login as admin
        When user enters admin username
        And user enters admin password
        Then user should see the dashboard

        @student
        Scenario: login as student
          When user enters student username
          And user enters student password
          Then user should see the dashboard