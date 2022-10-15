package com.pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "input[name=\"username\"]")
    public WebElement username;

    @FindBy(css = "input[name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement summitButton;

    /**
     * no parameters
     * when we call this method  it will use
     */
    public void login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.summitButton.click();

    }

    /**
     * This method will accept two arguments and login
     * @param username
     * @param password
     */
    public void login(String username, String password){

        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.summitButton.click();
    }

    public void LoginWithConf(){
        this.username.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        this.password.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        this.summitButton.click();
    }

}
