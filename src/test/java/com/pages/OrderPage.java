package com.pages;

import com.pages.BasePage;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {


    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name="name")
    public WebElement customerName;

    @FindBy(name="street")
    public WebElement streetName;

    @FindBy(name="city")
    public WebElement cityName;

    @FindBy(name="state")
    public WebElement stateName;

    @FindBy(name="zip")
    public WebElement zipName;

    @FindBy(xpath = "//input[.='Visa']")
    public WebElement visaCard;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name="cardNo")
    public WebElement cardNo;

   @FindBy(name="cardExp")
    public WebElement cardExp;

   @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processSummit;




}
