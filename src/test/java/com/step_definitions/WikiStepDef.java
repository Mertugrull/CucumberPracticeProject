package com.step_definitions;

import com.pages.WikipediaPage;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDef {

    WikipediaPage wikipediaPage=new WikipediaPage();
    @Given("User is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }

    @When("user types Steve Jobs in the wiki search box")
    public void userTypesSteveJobsInTheWikiSearchBox() {
        wikipediaPage.searchBox.sendKeys("Steve Jobs");
    }

    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {

        wikipediaPage.searchButton.click();
    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void userSeesSteveJobsIsInTheWikiTitle() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));
    }

    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {

        String actualMainHeader=wikipediaPage.mainHeader.getText();
        Assert.assertTrue(actualMainHeader.equals("Steve Jobs"));

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String string) {

        String actualImageHeader=wikipediaPage.imageHeader.getText();
        Assert.assertTrue(actualImageHeader.equals(string));
    }

    @When("user types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String string) {

        wikipediaPage.searchBox.sendKeys(string+ Keys.ENTER);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}
