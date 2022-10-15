package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name=\"search\"]")
    public WebElement searchBox;

    @FindBy(css = "input[id=\"searchButton\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;

}
