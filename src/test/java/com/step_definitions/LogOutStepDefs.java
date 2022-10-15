package com.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDefs {


    @Given("user land on dashboard as a librarian")
    public void user_land_on_dashboard_as_a_librarian() {
        System.out.println("bakalim");
    }
    @When("user click log out button as a librarian")
    public void user_click_log_out_button_as_a_librarian() {
        System.out.println("I love you");
    }
    @Then("user should see homepage")
    public void user_should_see_homepage() {
        System.out.println("user interface");
    }

    @Given("user land on dashboard as a student")
    public void user_land_on_dashboard_as_a_student() {
        System.out.println("as a student");
    }
    @When("user click log out button as a student")
    public void user_click_log_out_button_as_a_student() {
        System.out.println("product owner");
    }

    }
