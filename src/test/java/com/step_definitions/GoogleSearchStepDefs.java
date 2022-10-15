package com.step_definitions;

import com.pages.GoogleSearchPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleSearchStepDefs {


    GoogleSearchPage searchPage=new GoogleSearchPage();
    @Given("User is on google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.co.uk/");
        Driver.getDriver().findElement(By.xpath("//div[.='Accept all']")).click();

    }

    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {

        searchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }

    @Then("User sees apple is in the google title")
    public void userSeesAppleIsInTheGoogleTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }

    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String string) {
        searchPage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}
