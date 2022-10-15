package com.step_definitions;

import com.pages.WebTableLoginPage;
import com.utilities.BrowserUtility;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDefs {


    WebTableLoginPage loginPage=new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url= ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);

    }

    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        loginPage.username.sendKeys(string);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.summitButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtility.titleVerifyContains("orders");

    }

    @When("user enters username {string} password {string} and login")
    public void userEntersUsernamePasswordAndLogin() {
        loginPage.LoginWithConf();

    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

      loginPage.username.sendKeys(credentials.get("username"));
      loginPage.password.sendKeys(credentials.get("password"));
      loginPage.summitButton.click();

    }

}
