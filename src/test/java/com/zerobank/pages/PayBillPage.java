package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillPage extends BasePage {

    @FindBy (xpath="//input[@id='np_new_payee_name']")
    public WebElement payeeName;

    @FindBy (css="#np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy (xpath="//input[@id='np_new_payee_account']")
    public WebElement payeeAccount;

    @FindBy (xpath = "//input[@id='np_new_payee_details']")
    public WebElement payeeDetails;

    @FindBy(xpath = "//input[@value='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//div[contains(text(),'was successfully created')]")
    public WebElement successMessage;


    @FindBy(css = "#pc_currency")
    public WebElement currencySelectDropDwn;

    @FindBy(css = "#pc_amount")
    public WebElement inputAmount;
    @FindBy(css="#pc_inDollars_true")
    public  WebElement DollarButton  ;
    @FindBy ( css="#pc_inDollars_false")
    public WebElement SelectedCurrency;
    @FindBy (css="#purchase_cash")
    public  WebElement purchaseButton;

    @FindBy (css="#pc_calculate_costs")
    public WebElement calculatecostBtn;
    @FindBy (css="#pc_conversion_amount")
    public WebElement displayedMessage;

    @FindBy (xpath = "//div[contains(text(),'successfully purchased')]")
    public WebElement purchaseSuccessMessage;

    @FindBy(css = "#pc_conversion_amount")
    public WebElement conversionAmount;



}
