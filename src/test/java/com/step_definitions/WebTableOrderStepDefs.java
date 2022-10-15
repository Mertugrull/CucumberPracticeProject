package com.step_definitions;

import com.pages.BasePage;
import com.pages.OrderPage;
import com.pages.ViewAllOrdersPage;
import com.pages.WebTableLoginPage;
import com.utilities.BrowserUtility;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class WebTableOrderStepDefs {

    WebTableLoginPage loginPage=new WebTableLoginPage();
    BasePage basePage=new BasePage();

    OrderPage orderPage=new OrderPage();

    ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();

    @Given("user is already logged in to web table app")
    public void user_is_already_logged_in_to_web_table_app() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));

    }
    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {

       loginPage.login();
       basePage.order.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {


        Select select=new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }

    @And("users enters quantity {int}")
    public void usersEntersQuantity(int arg0) {

        orderPage.quantity.sendKeys(arg0+"");
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {

        orderPage.customerName.sendKeys(string);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {

        orderPage.streetName.sendKeys(string);

    }

    @And("user enters city {string}")
    public void userEntersCity(String string) {

        orderPage.cityName.sendKeys(string);
    }


    @When("user enters state {string}")
    public void user_enters_state(String string) {

        orderPage.stateName.sendKeys(string);

    }
    @When("user enters zip {string}")
    public void user_enters_zip(String string) {

        orderPage.zipName.sendKeys(string);

    }
    @When("user selects credit  card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {

        BrowserUtility.radioButtons(orderPage.cardType,expectedCardType );
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

        orderPage.cardNo.sendKeys(string);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

        orderPage.cardExp.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {

        orderPage.processSummit.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {

        System.out.println("viewAllOrdersPage.newCustomer.getText() = "
                + viewAllOrdersPage.newCustomer.getText());

        Assert.assertEquals(viewAllOrdersPage.newCustomer.getText(), expectedName);

    }


}


