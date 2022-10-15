package com.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {
        System.out.println("librarian");
    }

    @And("user input librarian password")
    public void userInputLibrarianPassword() {
        System.out.println("password");
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("dashboard");

    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("admin");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("password");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("student");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("password");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("user is on the library login page");
    }
}
